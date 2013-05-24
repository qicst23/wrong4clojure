;; Count a Sequence
;;
;; Write a function which returns the total number of elements in a sequence.  (= (__ '(1 2 3 3 1)) 5)  (= (__ "Hello World") 11)  (= (__ [[1 2] [3 4] [5 6]]) 3)  (= (__ '(13)) 1)  (= (__ '(:a :b :c)) 3)Special Restrictionscount
;;
;; test cases:
;;   (= (__ '(1 2 3 3 1)) 5)
;;   (= (__ "Hello World") 11)
;;   (= (__ [[1 2] [3 4] [5 6]]) 3)
;;   (= (__ '(13)) 1)
;;   (= (__ '(:a :b :c)) 3)

(fn count' [s]
  (if-let [s' (seq s)]
    (inc (count' (rest s')))
    0))