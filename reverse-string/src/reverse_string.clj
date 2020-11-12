(ns reverse-string)

(defn reverse-string
  "Function that returns reversed string."
  [s]
  (apply str (reduce conj () s)))
