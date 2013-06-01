;; Read Roman numerals
;;
;; Roman numerals are easy to recognize, but not everyone knows all the rules necessary to work with them. Write a function to parse a Roman-numeral string and return the number it represents.

You can assume that the input will be well-formed, in upper-case, and follow the subtractive principle. You don't need to handle any numbers greater than MMMCMXCIX (3999), the largest number representable with ordinary letters.  (= 14 (__ "XIV"))  (= 827 (__ "DCCCXXVII"))  (= 3999 (__ "MMMCMXCIX"))  (= 48 (__ "XLVIII")) 
;;
;; test cases:
;;   (= 14 (__ "XIV"))
;;   (= 827 (__ "DCCCXXVII"))
;;   (= 3999 (__ "MMMCMXCIX"))
;;   (= 48 (__ "XLVIII")) 

;; This is the one I came up with. I thought it was pretty so also put it on Rosetta Code too.
;; - Paul
(fn [r] 
  (->> (reverse r)
       (replace (zipmap "MDCLXVI" [1000 500 100 50 10 5 1]))
       (partition-by identity)
       (map (partial apply +))
       (reduce #(if (< %1 %2) (+ %1 %2) (- %1 %2)))))
