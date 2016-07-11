(ns storii.core
  (:gen-class))

(defn show-stories []
  (println "no stories :(")
)

(defn show-help []
  (println "help - this help")
  (println "list - list stories")
  (println "open [story name] - open a story")
  (println "exit | quit - quit Storii")
)

(defn handle-input [input]
  (when (= input "help")
    (show-help))
  (when (= input "list")
    (show-stories))
  (when (contains? #{"exit" "quit"} input)
    (System/exit 0))
)

(defn start-storii []
  (while true
    (print "> ")
    (flush)
    (handle-input (read-line))))

(defn -main
  [& args]
  (println "Welcome to Storii")
  (start-storii))

