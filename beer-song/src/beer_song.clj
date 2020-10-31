(ns beer-song)

(defn verse
  "Returns the nth verse of the song."
  [num]
  (cond
    (> num 2) (str
               (format "%d bottles of beer on the wall, %d bottles of beer.%n" num num)
               (format "Take one down and pass it around, %d bottles of beer on the wall.\n" (dec num)))
    (= num 2) (str "2 bottles of beer on the wall, 2 bottles of beer.\n"
                   "Take one down and pass it around, 1 bottle of beer on the wall.\n")
    (= num 1) (str "1 bottle of beer on the wall, 1 bottle of beer.\n"
                   "Take it down and pass it around, no more bottles of beer on the wall.\n")
    (= num 0) (str "No more bottles of beer on the wall, no more bottles of beer.\n"
                   "Go to the store and buy some more, 99 bottles of beer on the wall.\n")
    ))

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  [start & [end]]
  (apply str
         (loop [n start
                result []]
           (let [r (if (seq result)
                     (conj result "\n")
                     result)]
             (if (or (= n end) (= n 0))
               (conj r (verse n))
               (recur (dec n) (conj r (verse n))))))))
