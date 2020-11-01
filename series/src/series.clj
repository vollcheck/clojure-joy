(ns series)

(defn slices [string length]
  (if (pos? length)
    (loop [s string res []]
      (if (>= (count s) length)
        (recur (subs s 1) (conj res (subs s 0 length)))
        res))
    [""]))
