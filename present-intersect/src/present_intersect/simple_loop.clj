(ns present-intersect.simple-loop
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [quil.helpers.seqs :as s]))

(def nom (s/seq->stream (cycle [:mov1 :mov2])))

(defn setup-fn [] (q/frame-rate 1) {:nom-de-fn nom :mov1 (q/load-image "mov0.jpg") :mov2 (q/load-image "mov10.jpg") })

(defn draw-fn [state] (q/image (((:nom-de-fn state)) state ) 0 0))
  
(defn update-fn [state] (identity state))

(q/defsketch plz
  :middleware [m/pause-on-error m/fun-mode]
  :size [420 140]
  :setup setup-fn
  :draw draw-fn
  :update update-fn
  :key-pressed (fn kp [state event] (identity state))
  )
