;; Get the Caps
;;
;; Write a function which takes a string and returns a new string containing only the capital letters.  (= (__ "HeLlO, WoRlD!") "HLOWRD")  (empty? (__ "nothing"))  (= (__ "$#A(*&987Zf") "AZ")
;;
;; test cases:
;;   (= (__ "HeLlO, WoRlD!") "HLOWRD")
;;   (empty? (__ "nothing"))
;;   (= (__ "$#A(*&987Zf") "AZ")

#(clojure.string/replace %1 #"[^A-Z]" "")