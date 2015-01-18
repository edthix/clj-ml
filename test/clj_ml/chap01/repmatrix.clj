(ns clj-ml.chap01.repmatrix
  (:use clojure.core.matrix))

;; creating a matrix from vector
(matrix [[0 1 2] [3 4 5]])

;; A(2x3) - 2 rows x 3 columns matrix
;; element inside A. a(i, j) - i row, j column indexes ~ a(1,1) = 0
(def A (matrix [[0 1 2] [3 4 5]]))

;; printing the matrix
(pm A) ;; check in console / repl

;; check for matrix?
(matrix? A)
(matrix? "matrix")
(matrix? [[1 2 3] [6 7 8]])

