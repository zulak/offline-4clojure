;; A Half-Truth - Easy
;; Write a function which takes a variable number of booleans.  Your function should return true if some of the parameters are true, but not all of the parameters are true.  Otherwise your function should return false.
;; tags -
;; restricted -
(ns offline-4clojure.p83
  (:use clojure.test))

(def __
  (fn [& args]
    (let [true-vals (filter true? args)]
      (and (not (empty? true-vals))
           (< (count true-vals)
              (count args)))))
)

(defn -main []
  (are [soln] soln
(= false (__ false false))
(= true (__ true false))
(= false (__ true))
(= true (__ false true false))
(= false (__ true true true))
(= true (__ true true true false))
))
