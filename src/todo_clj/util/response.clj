;; src/todo_clj/util/response.clj
(ns todo-clj.util.response
  (:require [ring.util.response :as res]))

(def response #'res/response)
(alter-meta! #'response #(merge % (meta #'res/response)))

(defn html [res]
  (res/content-type res "text/html; charset=utf-8"))
