(ns bob
  :require [clojure.string :as str])

(defn response-for
  [s]
  (let [n-s (str/trimr s)]
    (case n-s
      (empty? n-s) "Fine. Be that way!"
      (upper? n-s) (if (= (last s) \?)
                     "Calm down, I know what I'm doing!"
                     "Whoa, chill out!")
      (= (last s) \?) "Sure."
      "Whatever.")))
