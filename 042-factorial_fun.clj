;; Factorial Fun
;;
;; Write a function which calculates factorials.  (= (__ 1) 1)  (= (__ 3) 6)  (= (__ 5) 120)  (= (__ 8) 40320)
;;
;; test cases:
;;   (= (__ 1) 1)
;;   (= (__ 3) 6)
;;   (= (__ 5) 120)
;;   (= (__ 8) 40320)

(fn ! [x]
  (if (= 1 x) 1
    (* x (! (dec x)))))