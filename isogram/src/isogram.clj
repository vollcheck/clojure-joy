(ns isogram
  (:require [clojure.string :as str]))

(defn isogram? [word]
  (let [s (str/replace (str/lower-case word) #"\s|-" "")]
    (= (count (set s)) (count s))))
