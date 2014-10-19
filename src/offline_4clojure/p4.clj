;; Intro to Lists - Elementary
;; Lists can be constructed with either a function or a quoted form.
;; tags -
;; restricted -
(ns offline-4clojure.p4
  (:use clojure.test))

(def __
  (list :a :b :c)
)

(defn -main []
  (are [soln] soln
       (=  __ '(:a :b :c))
))
