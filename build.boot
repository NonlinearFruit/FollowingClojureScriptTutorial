; vi: ft=clojure

(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"html"}

  :dependencies '[[org.clojure/clojure "1.8.0"]
  [org.clojure/clojurescript "1.9.473"]
  [adzerk/boot-cljs "1.7.228-2"]
  [javax.xml.bind/jaxb-api "2.3.0"]
  [pandeiro/boot-http "0.7.6"]
  [org.clojure/tools.nrepl "0.2.12"]
  [adzerk/boot-reload "0.5.1"]
  [adzerk/boot-cljs-repl "0.3.3"]
  [com.cemerick/piggieback "0.2.1"]
  [org.clojars.magomimmo/domina "2.0.0-SNAPSHOT"]
  [weasel "0.7.0"]])

(require '[adzerk.boot-cljs :refer [cljs]]
'[pandeiro.boot-http :refer [serve]]
'[adzerk.boot-reload :refer [reload]]
'[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]])


(deftask dev
  "Launch Immediate Feedback Development Environment"
  []
  (comp
    (serve :dir "target")
    (watch)
    (reload)
    (cljs-repl)
    (cljs)
    (target :dir #{"target"})))
