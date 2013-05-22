;; http://www.4clojure.com/problem/50

;; the general idea is to construct a hash-map, keyed by type,
;; then just extract the values of the hash-map as the solution
(fn [v]
  (map vec
       (map reverse
            (vals (reduce (fn [m k] (update-in m [(type k)] conj k)) {} v)))))
