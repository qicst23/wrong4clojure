;; Maximum value
;;
;; Write a function which takes a variable number of parameters and returns the maximum value.  (= (__ 1 8 3 4) 8)  (= (__ 30 20) 30)  (= (__ 45 67 11) 67)Special Restrictionsmaxmax-key
;;
;; test cases:
;;   (= (__ 1 8 3 4) 8)
;;   (= (__ 30 20) 30)
;;   (= (__ 45 67 11) 67)

(fn [& args] (first (reverse (sort args))))