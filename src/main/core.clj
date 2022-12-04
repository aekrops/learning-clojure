(ns main.core
  (:require [main.hello_world :refer [hello, greet, another-hello, can-drink?]])
  (:require [main.simple_functions :refer [sum]])
  (:gen-class)
  )

(defn -main
  "Method description"
  []
  (hello)
  (greet "Sasha")
  (another-hello)
  (another-hello "Svyat")
  (can-drink? 15)
  (can-drink? 18)
  (sum 3 4)
  )

