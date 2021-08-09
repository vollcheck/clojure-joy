(ns nucleotide-count)

(def init-nucleotide {\A 0, \T 0, \C 0, \G 0})

(def available-nucles [\A \T \C \G])

(defn is-available? [nucle]
  (some #(= nucle %) available-nucles))

(defn count-of-nucleotide-in-strand [nucleotide strand]
  (if (is-available? nucleotide)
    (loop [s strand
           n 0]
      (if (= (first s) nucleotide)
        (recur (rest s) (inc n))
        n))
    (throw (Exception. "Wrong nucleotide."))))

(defn- update-nu [n arg]
  (update n arg inc))

(defn nucleotide-counts [strand]
  (loop [s strand, n init-nucleotide]
    (if (first s)
      (recur (rest s) (update-nu n (first s)))
      n)))
