(defproject fizzbuzz-cljs "0.0.1"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :cljsbuild {
    :builds [{
      :source-paths ["clojurescripts"]
      :compiler {
        :output-to "javascripts/main.js"}}]}
  :description "FizzBuzz in ClojureScript")
