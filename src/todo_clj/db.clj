(ns todo-clj.db
  (:require [clojure.java.jdbc :as jdbc]))

(def db-spec
  {:dbtype "postgresql" :dbname "todo_clj_db" :host "localhost" :port 5432 :user "hiro" :password "hiro5125"})

(defn migrate []
  (jdbc/db-do-commands
   db-spec
   (jdbc/create-table-ddl :todo [:id :serial] [:title :varchar])))
