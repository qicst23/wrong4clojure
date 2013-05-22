;; Split by Type
;;
;; Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases).  (= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})  (= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})  (= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})
;;
;; test cases:
;;   (= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
;;   (= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})
;;   (= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})

;; the general idea is to construct a hash-map, keyed by type,
;; then just extract the values of the hash-map as the solution
(fn [v]
  (map vec
       (map reverse
            (vals (reduce (fn [m k] (update-in m [(type k)] conj k)) {} v)))))