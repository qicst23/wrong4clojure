;; Last Element
;;
;; Write a function which returns the last element in a sequence.  (= (__ [1 2 3 4 5]) 5)  (= (__ '(5 4 3)) 3)  (= (__ ["b" "c" "d"]) "d")Special Restrictionslast
;;
;; test cases:
;;   (= (__ [1 2 3 4 5]) 5)
;;   (= (__ '(5 4 3)) 3)
;;   (= (__ ["b" "c" "d"]) "d")

#(first (reverse %1))