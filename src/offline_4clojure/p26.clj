;; Fibonacci Sequence - Easy
;; Write a function which returns the first X fibonacci numbers.
;; tags - Fibonacci:seqs
;; restricted -
(ns offline-4clojure.p26
  (:use clojure.test))

(def __
  (fn [max-num]
    (seq (loop [acc [] fib-num 0]
           (if (<= max-num fib-num)
             acc
             (if (< fib-num 2)
               (recur (conj acc 1) (inc fib-num))
               (recur (conj acc (reduce + (take-last 2 acc))) (inc fib-num))))
           )))
  )

(defn -main []
  (are [soln] soln
(= (__ 3) '(1 1 2))
(= (__ 6) '(1 1 2 3 5 8))
(= (__ 8) '(1 1 2 3 5 8 13 21))
))
