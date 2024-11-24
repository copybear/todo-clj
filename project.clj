(defproject todo-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
 :dependencies [[org.clojure/clojure "1.11.1"]
                [ring "1.13.0"]
                [ring/ring-jetty-adapter "1.13.0"]
                [compojure "1.7.1"]
                [hiccup "2.0.0-RC3"]
                [environ "1.2.0"]
                [org.clojure/java.jdbc "0.4.2"]
                [org.postgresql/postgresql "9.4-1205-jdbc42"]
                [com.github.seancorfield/next.jdbc "1.2.674"]
                [mysql/mysql-connector-java "8.0.33"]
                [bouncer "1.0.1"]
                [ring/ring-defaults "0.5.0"]
                [metosin/ring-http-response "0.9.4"]
                [slingshot "0.12.2"]
                [potemkin "0.4.7"]]
  :plugins [[lein-environ "1.2.0"]]
  :repl-options {:init-ns todo-clj.core}
  :profiles
  {:dev {:dependencies [[prone "1.6.4"]]
         :env {:dev true}}})
