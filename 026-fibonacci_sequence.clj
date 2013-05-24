;; Fibonacci Sequence
;;
;; Write a function which returns the first X fibonacci numbers.  (= (__ 3) '(1 1 2))  (= (__ 6) '(1 1 2 3 5 8))  (= (__ 8) '(1 1 2 3 5 8 13 21))
;;
;; test cases:
;;   (= (__ 3) '(1 1 2))
;;   (= (__ 6) '(1 1 2 3 5 8))
;;   (= (__ 8) '(1 1 2 3 5 8 13 21))

(fn fib [n]
  (loop [index 1
         sum 1
         result '(1)]
    (if (= n index)
      (reverse result)
      (recur (inc index)
             (+ sum (first result))
             (cons sum result)))))