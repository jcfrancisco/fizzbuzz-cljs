(ns hello-cljs.main)

(js/$ (fn []
  (fizzbuzz-inc 1)))

(defn fizzbuzz-inc [n]
  (clear)
  (-> (js/$ "#number")
      (.text n))
  (if (= (rem n 3) 0) (fizz))
  (if (= (rem n 5) 0) (buzz))
  (js/setTimeout fizzbuzz-inc "200" (inc n)))

(def $fizz (js/$ "#fizz"))
(def $buzz (js/$ "#buzz"))

(defn fizz []
  (-> $fizz (.show)))

(defn buzz []
  (-> $buzz (.show)))

(defn fizzbuzz []
  (fizz) (buzz))

(defn clear []
  (-> $fizz (.hide))
  (-> $buzz (.hide)))
