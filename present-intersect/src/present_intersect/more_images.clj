(ns present-intersect.more-images
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn more-setup [] {:images {:mov0 (q/load-image "mov0.jpg") :mov25 (q/load-image "mov25.jpg")}})

(defn more-draw [state] (q/image (get-in state [:images :mov25]) 0 0))

(defn more-update [state] (identity state))

(q/defsketch imagey
  :title "none"
  :size [480, 240]
  :middleware [m/fun-mode m/pause-on-error]
  :update more-update
  :setup more-setup
  :key-pressed (fn kp [state event] (identity state))
  :draw more-draw
  )
