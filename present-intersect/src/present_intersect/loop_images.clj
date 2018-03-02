(ns present-intersect.loop-images
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [quil.helpers.seqs :as s]))

(def nom (s/seq->stream (cycle [:mov0 :mov1 :mov2 :mov3 :mov4 :mov5 :mov6 :mov7 :mov8 :mov9 :mov10 :mov11])))
                 
(defn loop-setup [] (q/frame-rate 1)
  {:images {:mov0 (q/load-image "mov0.jpg")
            :mov1 (q/load-image "mov1.jpg")
            :mov2 (q/load-image "mov2.jpg")
            :mov3 (q/load-image "mov3.jpg")
            :mov4 (q/load-image "mov4.jpg")
            :mov5 (q/load-image "mov5.jpg")
            :mov6 (q/load-image "mov6.jpg")
            :mov7 (q/load-image "mov7.jpg")
            :mov8 (q/load-image "mov8.jpg")
            :mov9 (q/load-image "mov9.jpg")
            :mov10 (q/load-image "mov10.jpg")
            :mov11 (q/load-image "mov11.jpg")
            }
  :nom-de-fn nom})

;; (defn help-draw [state k] (q/image (get-in state [:images k]) 0 0))

;; (defn loop-draw [state] (help-draw state ((:current-image state))))
;; (defn loop-update [state] ((:current-image state)))
(defn loop-draw [state] (q/image (get-in state [:images ((:nom-de-fn state))]) 0 0))
(defn loop-update [state] (identity state))

(q/defsketch imagey
  :title "none"
  :size [480, 240]
  :middleware [m/fun-mode m/pause-on-error]
  :update loop-update
  :setup loop-setup
  :key-pressed (fn kp [state event] (identity state))
  :draw loop-draw
  )
