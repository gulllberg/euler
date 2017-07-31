(ns euler.core
  (:require [ysera.test :refer [is= is is-not]]))


;; Problem 206

(defn validate-guess
  {:test (fn []
           (is (validate-guess 1020304050607080900))
           (is-not (validate-guess 9010203040506070809))
           (is-not (validate-guess 1)))}
  [number-to-test]
  (let [number-string (str number-to-test)]
    (and (= (count number-string) 19)
         (re-matches #"1\d2\d3\d4\d5\d6\d7\d8\d9\d0" number-string))))

(defn square-and-test-number
  [number]
  (validate-guess (* number number)))

(defn find-number
  []
    (some #(when (square-and-test-number %) %) (range 1000000000 1389026630 10)))

(comment
  (find-number)
  1389019170)

;; Problem 588



