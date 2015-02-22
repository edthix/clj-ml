(ns clj-ml.chap02.01singlevar
  (:use clojure.core.matrix
        [incanter.core :only [view]]
        [incanter.charts :only [scatter-plot add-lines]])
  (:require [clatrix.core :as cl]))

(def X (cl/matrix [8.401 14.475 13.396 12.127 5.044
                   8.339 15.692 17.108 9.253 12.029]))


(def Y (cl/matrix [-1.57 2.32  0.424  0.814 -2.3
                   0.01 1.954 2.296 -0.635 0.328]))

;;   X       | Y
;; 8.401        -1.57
;; 14.475       2.32
;; 13.396       0.424
;; 12.127       0.814
;; 5.044        -2.3
;; 8.339        0.01
;; 15.692       1.954
;; 17.108       2.296
;; 9.253        -0.635
;; 12.029       0.328

;; scatter plot
(def linear-samp-scatter
  (scatter-plot X Y))

(defn plot-scatter []
  (view linear-samp-scatter))
￼
;;(plot-scatter)

(def linear-samp-scatter-rev
  (scatter-plot Y X))

(view linear-samp-scatter)
(view linear-samp-scatter-rev)
