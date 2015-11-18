(defproject pinger "0.1.0-SNAPSHOT"
  :description "A website awailability tester"
  :url "http://www.junones.com/index.html"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [log4j/log4j "1.2.16"]
                 [javax.mail/mail "1.4.7"]]
  :main pinger.core)
