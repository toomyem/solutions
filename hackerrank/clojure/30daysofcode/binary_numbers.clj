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
    (when (> n 0)
      (println (make-binary (.nextInt scanner)))
      (recur (- n 1)))))
