(ns present-intersect.simple-image
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn simple-setup [] {:image (q/load-image "mov0.jpg")})

(defn simple-draw [state] (q/image (:image state) 0 0))

(defn simple-update [state] (identity state))

(q/defsketch imagey
  :size [480, 240]
  :middleware [m/fun-mode m/pause-on-error]
  :update simple-update
  :setup simple-setup
  :draw simple-draw
  :key-pressed 
  )
