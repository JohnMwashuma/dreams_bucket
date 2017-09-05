(ns blog.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.params :refer [wrap-params]]))

(defn myapp [request]
  "This is the entry point"
  (str "Hello, " (get (:params request) "name"))) ;; Gets a name from a http request

(defn string-response-middleware
  "Accepts a request and returns a responce"
  [handler]
  (fn [request]
    (let [responce (handler request)]
    (if (instance? String responce)
    {:body responce
    :status 200
    :header {"Content-Type" "text/html"}}
    responce)))
  )

;; Ring midddle ware
(def handler
  (-> myapp
      string-response-middleware
      wrap-params))

(defn -main []
  (jetty/run-jetty handler {:port 3000}))


