(ns wakeup.core)

(defn wake-up-user []
  (js/alert "Are you going to stare at this boring page forever?"))

(js/setTimeout wake-up-user 5000)
