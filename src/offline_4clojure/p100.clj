;; Least Common Multiple - Easy
;; Write a function which calculates the <a href="http://en.wikipedia.org/wiki/Least_common_multiple">least common multiple</a>.  Your function should accept a variable number of positive integers or ratios.
;; tags - math
;; restricted -
(ns offline-4clojure.p100
  (:use clojure.test))





(def __
  ;; determine the least-common-mulitple by using the
  ;; greatest-common-denominator see:
  ;; http://en.wikipedia.org/wiki/Least_common_multiple#Reduction_by_the_greatest_common_divisor
  (fn lcd
    [& rest]
    (let [gcd (fn [a b]
                (if (= a b)
                  a
                  (recur (min a b) (- (max a b) (min a b)))))]
      (reduce #(/ (* % %2) (gcd % %2)) rest)))
)

(defn -main []
  (are [soln] soln
(== (__ 2 3) 6)
(== (__ 5 3 7) 105)
(== (__ 1/3 2/5) 2)
(== (__ 3/4 1/6) 3/2)
(== (__ 7 5/7 2 3/5) 210)
))
