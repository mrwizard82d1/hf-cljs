(ns ninety-nine.core)

(defn bottles
  []
  (doseq [index (reverse (range 99))]
    (let [bottle (inc index)
          word "bottle"
          phrase "of beer on the wall"]
      (.write js/document (str bottle " " word " " phrase ",<br>"))
      (.write js/document (str bottle " " word " of beer,<br>"))
      (.write js/document "Take one down, pass it around,<br>")
      (let [next-bottle (dec bottle)]
        (.write js/document
                (if (> next-bottle 0)
                  (str (dec bottle) " " word " " phrase ".<br><br>")
                  (str "No more " word "s " phrase "<br><br>")))))))

(bottles)

