;; Map Construction - Easy
;; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;; tags - core-functions
;; restricted - zipmap
(ns offline-4clojure.p61
  (:use clojure.test))

(def __
  (fn [k v]
    (apply hash-map (interleave k v)))
)

(defn -main []
  (are [soln] soln
(= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
(= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
(= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
))
