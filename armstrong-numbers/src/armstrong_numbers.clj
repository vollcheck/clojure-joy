(ns armstrong-numbers)

(def char-to-int #(Character/digit % 10))

(defn get-digits-seq
  "Function returns seq of digits of given number."
  [num]
  (map char-to-int (seq (str num))))

(defn pow-digits
  "Function returns sum of numbers in sequence of powered digits of given number."
  [num]
  (let [d (get-digits-seq num)]
    (apply +' (map #(.pow (biginteger %) (count d)) d))))

(defn armstrong?
  [num]
  (= num (pow-digits num)))
