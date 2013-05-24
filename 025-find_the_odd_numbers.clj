;; Find the odd numbers
;;
;; Write a function which returns only the odd numbers from a sequence.  (= (__ #{1 2 3 4 5}) '(1 3 5))  (= (__ [4 2 1 6]) '(1))  (= (__ [2 2 4 6]) '())  (= (__ [1 1 1 3]) '(1 1 1 3))
;;
;; test cases:
;;   (= (__ #{1 2 3 4 5}) '(1 3 5))
;;   (= (__ [4 2 1 6]) '(1))
;;   (= (__ [2 2 4 6]) '())
;;   (= (__ [1 1 1 3]) '(1 1 1 3))

#(filter odd? %1)