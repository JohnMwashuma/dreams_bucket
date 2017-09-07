(ns dreams_bucket.core
  (:require [ring.adapter.jetty :as jetty]
            [compojure.core :refer [defroutes GET POST]]
            [compojure.route :refer [resources]]
            [net.cgrand.enlive-html :as enlive]))


;; Define the templates
(enlive/deftemplate all_wishes_page "templates/all_wishes.html"
  []
  [:head :title] (enlive/content "Dreams Bucket | Home")
  [:body :div#side-menu :h1] (enlive/content "Dreams Bucket"))

(enlive/deftemplate my_wishes_page "templates/my_wishes.html"
  []
  [:head :title] (enlive/content "Dreams Bucket | My Wishes")
  [:body :div#side-menu :h1] (enlive/content "Dreams Bucket"))

(enlive/deftemplate manage_account_page "templates/manage_account.html"
  []
  [:head :title] (enlive/content "Dreams Bucket | Profile")
  [:body :div#side-menu :h1] (enlive/content "Dreams Bucket"))

(enlive/deftemplate private_wishes_page "templates/private_wishes.html"
  []
  [:head :title] (enlive/content "Dreams Bucket | Private Wishes")
  [:body :div#side-menu :h1] (enlive/content "Dreams Bucket"))

(enlive/deftemplate public_wishes_page "templates/public_wishes.html"
  []
  [:head :title] (enlive/content "Dreams Bucket | Public Wishes")
  [:body :div#side-menu :h1] (enlive/content "Dreams Bucket"))

(enlive/deftemplate wish_form_page "templates/wish_form.html"
  []
  [:head :title] (enlive/content "Dreams Bucket | Wish Form")
  [:body :div#side-menu :h1] (enlive/content "Dreams Bucket"))

(defroutes dreams_bucket
"Implement routing"
  (GET "/" [] (all_wishes_page))
  (GET "/my_wishes" [] (my_wishes_page))
  (GET "/manage_account" [] (manage_account_page))
  (GET "/private_wishes" [] (private_wishes_page))
  (GET "/public_wishes" [] (public_wishes_page))
  (GET "/wish_form" [] (wish_form_page))
  (resources "/css" {:root "static/css"})
  (resources "/js" {:root "static/js"})
  (resources "/img" {:root "static/img"})
  (resources "/fonts" {:root "static/fonts"}))


(defn -main []
  (jetty/run-jetty dreams_bucket {:port 3000}))


