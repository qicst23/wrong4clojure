;; A nil key
;;
;; Write a function which, given a key and map, returns true iff the map contains an entry with that key and its value is nil.  (true?  (__ :a {:a nil :b 2}))  (false? (__ :b {:a nil :b 2}))  (false? (__ :c {:a nil :b 2}))
;;
;; test cases:
;;   (true?  (__ :a {:a nil :b 2}))
;;   (false? (__ :b {:a nil :b 2}))
;;   (false? (__ :c {:a nil :b 2}))

(fn [k h]
  (and (contains? (set (keys h)) k)
       (nil? (h k))))