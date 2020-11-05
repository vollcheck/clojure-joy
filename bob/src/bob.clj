(ns bob
  (:require [clojure.string :refer [trimr upper-case]]))


(defn upper? [s]
  (= s (str/upper-case s)))


(def ends-w-? #(= (last %) \?))


(defn response-for
  [sentence]
  (let [s (trimr sentence)]
    (cond
      (empty? s) "Fine. Be that way!"
      (upper? s) (if (ends-w-? s)
                   "Calm down, I know what I'm doing!"
                   "Whoa, chill out!")
      (ends-w-? s) "Sure."
      :else "Whatever.")))
