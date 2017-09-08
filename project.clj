(defproject dreams_bucket "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.3.2"]
                 ;; Used for routing
                 [compojure "1.5.1"]
                 [enlive "1.1.6"]
                 ;; Postgres and Jdbc Drivers
                 [org.clojure/java.jdbc "0.2.3"]
                 [postgresql/postgresql "9.1-901.jdbc4"]])
