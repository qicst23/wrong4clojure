;; Nth Element
;;
;; Write a function which returns the Nth element from a sequence.  (= (__ '(4 5 6 7) 2) 6)  (= (__ [:a :b :c] 0) :a)  (= (__ [1 2 3 4] 1) 2)  (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])Special Restrictionsnth
;;
;; test cases:
;;   (= (__ '(4 5 6 7) 2) 6)
;;   (= (__ [:a :b :c] 0) :a)
;;   (= (__ [1 2 3 4] 1) 2)
;;   (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

(fn nth' [l i]
  (let [fst (first l)
        rst (rest l)]
    (if (= i 0)
      fst
      (nth' rst (dec i)))))