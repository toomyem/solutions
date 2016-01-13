(ns binary-numbers
  (:import (java.util Scanner)))

(defn make-binary [n]
  (if (= n 0)
    ""
    (let [r (rem n 2)
          k (int (/ n 2))]
      (str (make-binary k) r))))

(let [scanner (Scanner. System/in)]
  (loop [n (.nextInt scanner)]
    (if (> n 0)
      (do
        (println (make-binary (.nextInt scanner)))
        (recur (- n 1))))))
