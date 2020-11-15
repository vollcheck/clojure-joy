(ns isogram
  (:require [clojure.string :as str]))

(defn clean-s [s]
  (-> s
      (str/lower-case)
      (str/replace #"\s|-" "")))

(defn isogram? [word]
  (let [s (clean-s word)]
    (= (count (set s)) (count s))))
