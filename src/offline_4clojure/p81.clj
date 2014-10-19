;; Set Intersection - Easy
;; Write a function which returns the intersection of two sets.  The intersection is the sub-set of items that each set has in common.
;; tags - set-theory
;; restricted - intersection
(ns offline-4clojure.p81
  (:use clojure.test))

(def __
  (fn my-intersect [a b]
    (loop [[head & tail] (seq a)
           other-set b
           result #{}]
      (let [new-result (if (contains? b head)
                         (conj result head)
                         result)]
        (if (empty? tail)
          new-result
          (recur tail b new-result)))))
)

(defn -main []
  (are [soln] soln
(= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})
(= (__ #{0 1 2} #{3 4 5}) #{})
(= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})
))
