(ns hamming)

(defn comp
  [s1 s2]
  (if (not= s1 s2)
    1
    0))

(defn distance
  [strand1 strand2]
  (when (= (count strand1) (count strand2))
    (reduce + (map comp strand1 strand2)))
)
