;; Intro to Sets
;;
;; Sets are collections of unique values.  (= __ (set '(:a :a :b :c :c :c :c :d :d)))  (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
;;
;; test cases:
;;   (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;;   (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

#{ :a :b :c :d }