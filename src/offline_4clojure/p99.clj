;; Product Digits - Easy
;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;; tags - math:seqs
;; restricted -
(ns offline-4clojure.p99
  (:use clojure.test))

(def __
  (fn seq-num [a b]
    (rseq
     (loop [result [] num (* a b)]
       (if (= 0 num)
         result
         (recur (conj result (mod num 10)) (quot num 10))))))
)

(defn -main []
  (are [soln] soln
(= (__ 1 1) [1])
(= (__ 99 9) [8 9 1])
(= (__ 999 99) [9 8 9 0 1])
))
