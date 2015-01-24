(defproject clj-ml "0.1.0-SNAPSHOT"
  :description "Examples from Clojure for Machine Learnings"
  :url "http://dawillah.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [net.mikera/core.matrix "0.32.1"]
                 [clatrix "0.4.0"]]
  :plugins [[cider/cider-nrepl "0.8.2"]]
  :main ^:skip-aot ml.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
