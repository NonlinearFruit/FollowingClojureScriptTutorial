(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"html"}

  :dependencies '[[adzerk/boot-cljs "2.1.5"] [javax.xml.bind/jaxb-api "2.3.0"]])

(require '[adzerk.boot-cljs :refer [cljs]])
