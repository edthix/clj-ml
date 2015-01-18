(ns clj-ml.chap01.clatrix
  (:use clojure.core.matrix)
  (:require [clatrix.core :as cl]))

;; creating matrix using clatrix
(def A (cl/matrix [
                   [0 1 2]
                   [3 4 5]]))
(pm A)

;; Use overloaded matrix fn to create matrices by passing implementation names
(matrix [[0 2] [3 5]]) ;; standard :persistent-vector
(matrix :persistent-vector [[1 2] [2 1]])
(matrix :clatrix [[1 2] [2 1]])


(cl/matrix [0 1])
(cl/matrix [[0 1]])

;; clatrix? to check for a matrix
(cl/clatrix? A)
(cl/clatrix? "A")
;; only can be used on clatrix matrices
(cl/clatrix? (matrix [[0 1] [5 9]])) ;; false - cannot check core.matrix matrices implementation
(matrix? (matrix [[0 1] [5 9]])) ;; true

;; Sizes
(count A)
(row-count A)
(column-count A)

;; Retrieving a matrix element a(i, j) where i is row and j is column
;;(cl/get matrix row column)
(cl/get A 1 1)
(cl/get A 0 1)
(cl/get A 0 0)
(cl/get A 1 0)
(cl/get A 1 2)
;; (cl/get A 1 3) ;; out of bound

;; traverse row first and repeat - 0, 3, 1, 4, 2, 5
(cl/get A 0)
(cl/get A 1)
(cl/get A 2)
(cl/get A 3)
(cl/get A 4)
(cl/get A 5)

;; Mutates / sets a matrix - warning this will mutate the matrix (against clojure's philosophy)
(cl/set A 1 2 0)
(pm A)

;; functional composition on a matrix with map and map-indexed

;; map-indexed should accept 3 args
(cl/map-indexed (fn [i j m] (* m 2)) A)
(pm A) ;; map-indexed will not mutate matrix

(cl/map (fn [m] (+ m 2)) A)
