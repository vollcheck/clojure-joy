(ns bob
  (:require [clojure.string :refer [trimr upper-case ends-with?]]))

(defn shouting? [s]
  (and (= s (upper-case s))
       (re-find #"[a-zA-Z]+" s)))


(defn question? [s]
  (ends-with? s "?"))


(defn response-for [sentence]
  (let [s (trimr sentence)]
    (cond
      (empty? s) "Fine. Be that way!"
      (and (shouting? s) (question? s)) "Calm down, I know what I'm doing!"
      (shouting? s) "Whoa, chill out!"
      (question? s) "Sure."
      :else "Whatever.")))
