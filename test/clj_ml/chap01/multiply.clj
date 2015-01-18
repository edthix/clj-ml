(ns clj-ml.chap01.multiply
  (:use clojure.core.matrix)
  (:require [clojure.core.matrix.operators :as M]))

(def A (matrix [[1 2 3]
                [4 5 6]]))

(def B (matrix [[10 20]
                [20 30]
                [30 40]]))

(def C (matrix [[11 12]
                [13 14]]))


(def D (matrix [[1 2]
                [4 5]]))

(def E (matrix [[1 2]
                [2]]))

(def N 10)

;; Multiply
(pm A)
(pm B)
(pm C)
(pm D)
(pm E)

(pm (M/* A N))

(pm (M/* D D))
(pm (M/* E D))

