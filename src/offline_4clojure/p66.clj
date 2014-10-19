;; Greatest Common Divisor - Easy
;; Given two integers, write a function which
;;returns the greatest common divisor.
;; tags -
;; restricted -
(ns offline-4clojure.p66
  (:use clojure.test))

(def __
  (fn [a b]
    (if (= a b)
      a
      (recur (min a b) (- (max a b) (min a b)))))
)

(defn -main []
  (are [soln] soln
(= (__ 2 4) 2)
(= (__ 10 5) 5)
(= (__ 5 7) 1)
(= (__ 1023 858) 33)
))
