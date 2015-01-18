(ns clj-ml.chap01.additions
  (:use clojure.core.matrix)
  (:require [clojure.core.matrix.operators :as M]))

(def A (matrix [[0 1 2] [3 4 5]]))
(def B (matrix [[0 0 0] [0 0 0]]))
(M/== B A)
(def C (M/+ A B))
(M/== C A)

(defn mat-eq
  "Checks if two matrices are equal"
  [A B]
  (and (= (count A) (count B))
       (reduce #(and %1 %2) (map = A B))))

(mat-eq A C)

