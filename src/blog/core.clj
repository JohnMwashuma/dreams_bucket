(ns blog.core
  (:require [ring.adapter.jetty :as jetty]))

(defn myapp [request]
  "This is the entry point"
  [request]
  {:body "Hello Clojure"
   :status 200
   :header {"Content-Type" "text/html"}})

(defn -main []
  (jetty/run-jetty myapp {:port 3000}))


