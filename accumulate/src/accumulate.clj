(ns accumulate)

(defn accumulate
  ([]
   (vec []))
  ([f coll]
   (if-let [c (seq coll)]
     (cons (f (first c)) (accumulate f (rest c)))
     (vec []))))
