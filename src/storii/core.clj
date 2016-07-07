(ns storii.core
  (:gen-class))

(defn handle-input [input]
  input)

(defn start-storii []
  (while true
    (print "> ")
    (flush)
    (println (handle-input (read-line)))))

(defn -main
  [& args]
  (println "Welcome to Storii")
  (start-storii))

