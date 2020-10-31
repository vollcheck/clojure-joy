(ns reverse-string)

(defn my-reverse
  "Auxiliary function for reversing."
  [s result-s]
  (if (= 0 (count s))
    result-s
    (my-reverse (rest s) (str (first s) result-s))))


(defn reverse-string
  "Function that returns reversed string."
  [s]
  (my-reverse s ""))
