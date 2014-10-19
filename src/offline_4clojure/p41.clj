;; Drop Every Nth Item - Easy
;; Write a function which drops every Nth item from a sequence.
;; tags - seqs
;; restricted -
(ns offline-4clojure.p41
  (:use clojure.test))

(def __
  (fn [the-seq n]
    (loop [in the-seq out [] count 1]
      (if (empty? in)
        out
        (if (= 0(mod count n))
          (recur (rest in) out (inc count))
          (recur (rest in) (conj out (first in)) (inc count))))))
)

(defn -main []
  (are [soln] soln
(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
))
