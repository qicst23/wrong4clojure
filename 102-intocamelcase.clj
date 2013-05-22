;; intoCamelCase
;;
;; When working with java, you often need to create an object with fieldsLikeThis, but you'd rather work with a hashmap that has :keys-like-this until it's time to convert. Write a function which takes lower-case hyphen-separated strings and converts them to camel-case strings.  (= (__ "something") "something")  (= (__ "multi-word-key") "multiWordKey")  (= (__ "leaveMeAlone") "leaveMeAlone")
;;
;; test cases:
;;   (= (__ "something") "something")
;;   (= (__ "multi-word-key") "multiWordKey")
;;   (= (__ "leaveMeAlone") "leaveMeAlone")

