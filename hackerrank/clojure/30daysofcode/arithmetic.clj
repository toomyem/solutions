(ns arithmetic
  (:import (java.util Scanner)))

(defn calc-final-price [m t x]
  (let [tip (/ (* m t) 100.0)
        tax (/ (* m x) 100.0)]
    (Math/round (double (+ m tip tax)))))

(let [scanner (Scanner. System/in)
      m (.nextDouble scanner)
      t (.nextInt scanner)
      x (.nextInt scanner)]
  (printf "The final price of the meal is $%d." (calc-final-price m t x)))
