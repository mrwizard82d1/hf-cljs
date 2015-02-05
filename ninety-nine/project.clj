(defproject hf-cljs "0.1.0-SNAPSHOT"
  :description "99 bottles of beer on the wall from 'Head First JavaScript.'"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2760"]]
  :plugins [[lein-cljsbuild "1.0.4"]]
  :cljsbuild {:builds
              [{:source-paths ["src/cljs"],
                :compiler
                {:output-to "resources/public/js/bottles.js",
                 :optimizations :whitespace
                 :pretty-print true}}]})
