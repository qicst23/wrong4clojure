;; Split a sequence
;;
;; Write a function which will split a sequence into two parts.  (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])  (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])  (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])Special Restrictionssplit-at
;;
;; test cases:
;;   (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
;;   (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
;;   (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

(fn [c s]
  (let [fst (subvec s 0 c)
        rst (subvec s c)]
    [fst rst]))