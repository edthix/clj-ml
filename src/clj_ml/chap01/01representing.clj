(ns clj-ml.chap01.01representing
  (:use clojure.core.matrix)
  (:require [clatrix.core :as cl]))

;; use a vector
(def A (matrix [[0 1 2] [3 4 5]]))

;; print a matrix
(pm A)
(class A)

;; clatrix
(def B (cl/matrix A))

(pm B)
(class B)

;; count - standard count for rows
(count A)
(count B)

;; row/col count
(row-count A)
(column-count B)


;; gettting a value
(cl/get B 1 1)
(cl/get B 0 0)
(get A 0)

;; setting a value
(cl/set B 0 1 202)
(pm B)

