(ns collatz-conjecture)

(def c-even
  "Defines what to do with even number in collatz-conjecture."
  #(/ % 2))

(def c-not-even
  "Defines what to do with not even number in collatz-conjecture."
  #(inc (* % 3)))

(defn process-num
  "Helper function to process the number based on its parity."
  [num]
  (if (even? num)
    (c-even num)
    (c-not-even num)))

(defn collatz
  [num]
  (when (< num 1)
    (throw (Throwable. "Zero and negatives cannot be `collatzed`.")))
  (loop [cnt 0 n num]
    (if (= n 1)
      cnt
      (recur (inc cnt) (process-num n)))))
