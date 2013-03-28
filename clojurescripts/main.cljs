(ns hello-cljs.main)

(js/$ (fn []
  (fizzbuzz-inc 1)))

(defn fizzbuzz-inc [n]
  (-> (js/$ "#number")
      (.text n))
  (js/setTimeout fizzbuzz-inc "1000" (inc n)))

(def $fizzbuzz (js/$ "#fizzbuzz"))

(defn fizz []
  (-> $fizzbuzz (.text "fizz")))

(defn buzz []
  (-> $fizzbuzz (.text "buzz")))

(defn fizzbuzz []
  (-> $fizzbuzz (.text "fizzbuzz")))
