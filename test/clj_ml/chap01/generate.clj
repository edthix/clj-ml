(ns clj-ml.chap01.generate
  (:use clojure.core.matrix)
  (:require [clatrix.core :as cl]))

(defn square-mat
  "Creates a square matrix of size n x n
  whose elements are all e"
  [n e & {:keys [implementation]
          :or {implementation :persistent-vector}}]
  (let [repeater #(repeat n %)]
    (matrix implementation (-> e repeater repeater))))

(square-mat 2 1)
(square-mat 3 1)

(matrix (repeat 3 (repeat 3 1)))
(matrix (repeat 2 (repeat 2 1)))

(square-mat 2 1 :implementation :clatrix)
;; Identity matrix
;; Bug in book
(defn id-mat
  "Creates an identity matrix of n x n size"
  [n]
  (let [init (square-mat n 0 :implementation :clatrix)
        identity-f (fn [i j n]
                     (if (= i j) 1 n))]
    (cl/map-indexed identity-f init)))

(id-mat 3)
;; core.matrix identity
(identity-matrix 3)

;; Generate matrix with random elements
(defn rand-square-clmat
  "Generates a random clatrix matrix of size n x n"
  [n]
  (cl/map rand-int (square-mat n 100 :implementation :clatrix)))

(rand-square-clmat 2)

(defn rand-square-mat
  "Generates a random matrix of size n x n"
  [n]
  (matrix
   (repeatedly n #(map rand-int (repeat n 100)))))

(rand-square-mat 2)


;; cl/rnorm - normally distributed random elements with optionally specified mean
;; and standard deviations

;; mean - 10
;; sd = 25
;; rows - 10
;; cols - 10
(cl/rnorm 10 25 10 10)
;; rows = 5
(cl/rnorm 5)
;; rows - 3
;; cols - 4
(cl/rnorm 3 4)


(defn id-computed-mat
  "Creates an identity matrix of size n x n
  using compute-matrix"
  [n]
  (compute-matrix [n n] #(if (= %1 %2) 1 0)))

(defn rand-computed-mat
  "Creates an n x m matrix of random elements
  using compute-matrix"
  [n m]
  (compute-matrix [n m]
                  (fn [i j] (rand-int 100))))
