;; Flatten a Sequence
;;
;; Write a function which flattens a sequence.  (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))  (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))  (= (__ '((((:a))))) '(:a))Special Restrictionsflatten
;;
;; test cases:
;;   (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;;   (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;;   (= (__ '((((:a))))) '(:a))

(fn flatten' [coll]
  (if-let [s (seq coll)]
    (let [[fst & rst] s
          f-rst (flatten' rst)]
      (if (sequential? fst)
        (concat (flatten' fst) f-rst)
        (cons fst f-rst)))
    coll))