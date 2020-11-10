(ns hamming)

(defn distance
  [strand1 strand2]
  (when (= (count strand1) (count strand2))
    (reduce + (map
             (fn [s1 s2] (if (not= s1 s2) 1 0))
             strand1 strand2))))
