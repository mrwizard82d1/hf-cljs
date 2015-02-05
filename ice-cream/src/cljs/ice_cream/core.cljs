(ns ice-cream.core)

(defn eat_yum_yum
  [scoops]
  (doseq [_ scoops]
    (.write js/document "Another scoop!<br>"))
  (.write js/document "Life without ice cream isn't the same. :("))

(eat_yum_yum (range 5))

  
