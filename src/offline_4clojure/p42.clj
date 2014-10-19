;; Factorial Fun - Easy
;; Write a function which calculates factorials.
;; tags - math
;; restricted -
(ns offline-4clojure.p42
  (:use clojure.test))

(def __
  #(reduce * 1 (range 1 (inc %)))
)

(defn -main []
  (are [soln] soln
(= (__ 1) 1)
(= (__ 3) 6)
(= (__ 5) 120)
(= (__ 8) 40320)
))
