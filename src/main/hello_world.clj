(ns main.hello_world)

;; name   params   body

(defn hello [] (println "Hello World"))

(defn greet [name] (println "Hello, " name))


(defn another-hello
  ([] (println "Hello another world!"))
  ([name]
   (println "Hello, " name)))

(def drinks ["Coke" "Fanta"])

(defn can-drink? [age]
  (if (>= age 18) 
    (println (conj drinks "Beer"))
    (println (conj drinks "Coke"))))