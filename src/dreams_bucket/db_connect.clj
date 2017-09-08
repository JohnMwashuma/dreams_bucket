(ns dreams_bucket.db_connect
    (:require [clojure.java.jdbc :as jdbc]))

;; Database connection string
(def postgresql-db
    {
        :classname "org.postgresql.Driver"
        :subprotocol "postgresql"
        :subname "//localhost:5432/dreams_bucket"
        :user "onadata"
        :password "Password1"
    })
