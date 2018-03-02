(ns present-intersect.images
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [quil.helpers.seqs :as s]))

(def nom (s/seq->stream (cycle [:mov0 :mov1 :mov2 :mov3 :mov4 :mov5 :mov6 :mov7 :mov8 :mov9 :mov10 :mov11 :mov12 :mov13 :mov14 :mov15 :mov16 :mov17 :mov18 :mov19 :mov20 :mov21 :mov22 :mov23 :mov24 :mov25 :mov26 :mov27 :mov28 :mov29 :mov30 :mov31 :mov32 :mov33 :mov34 :mov35 :mov36 :mov37 :mov38 :mov39 :mov40 :mov41 :mov42 :mov43 :mov44 :mov45 :mov46 ;; :mov47 :mov48 :mov49 :mov50
                                ])))

(defn setup [] (q/frame-rate 10)
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
            :mov12 (q/load-image "mov12.jpg") :mov13 (q/load-image "mov13.jpg") :mov14 (q/load-image "mov14.jpg") :mov15 (q/load-image "mov15.jpg")  :mov16 (q/load-image "mov16.jpg") :mov17 (q/load-image "mov17.jpg") :mov18 (q/load-image "mov18.jpg") :mov19 (q/load-image "mov19.jpg") :mov20 (q/load-image "mov20.jpg")  :mov21 (q/load-image "mov21.jpg")  :mov22 (q/load-image "mov22.jpg")  :mov23 (q/load-image "mov23.jpg") :mov24 (q/load-image "mov24.jpg") :mov25 (q/load-image "mov25.jpg") :mov26 (q/load-image "mov26.jpg") :mov27 (q/load-image "mov27.jpg") :mov28 (q/load-image "mov28.jpg") :mov29 (q/load-image "mov29.jpg") :mov30 (q/load-image "mov30.jpg") :mov31 (q/load-image "mov31.jpg") :mov32 (q/load-image "mov32.jpg") :mov33 (q/load-image "mov33.jpg") :mov34 (q/load-image "mov34.jpg") :mov35 (q/load-image "mov35.jpg") :mov36 (q/load-image "mov36.jpg") :mov37 (q/load-image "mov37.jpg") :mov38 (q/load-image "mov38.jpg") :mov39 (q/load-image "mov39.jpg") :mov40 (q/load-image "mov40.jpg") :mov41 (q/load-image "mov41.jpg") :mov42 (q/load-image "mov42.jpg") :mov43 (q/load-image "mov43.jpg") :mov44 (q/load-image "mov44.jpg") :mov45 (q/load-image "mov45.jpg") :mov46 (q/load-image "mov46.jpg") ;; :mov47 (q/load-image "mov47.jpg") :mov48 (q/load-image "mov48.jpg") :mov49 (q/load-image "mov49.jpg") :mov50 (q/load-image "mov50.jpg"
            }
  :nom-de-fn nom})
;;; should use all the following eventually

;; (defn load-image [image]
;;   (let [path (str (name image) ".jpg")]
;;     (q/request-image path)))

;; (defn draw-image [state k [x y]]
;;   (q/image (get-in state [:images k]) x y))

;; (defn setup []
;;   (q/frame-rate 25)
;;   ;; (q/color-mode :rgb)
;;   (q/image-mode :center)
;;   {:images (zipmap images (map load-image images))})

(defn update-state [state]
  (identity state))

(defn draw-state [state]
  (q/image (get-in state [:images ((:nom-de-fn state))]) 0 0))

(defn key-pressed [state event] (identity state))

(q/defsketch aname
  :title "the tune"
   :size [1280 700]
   :setup setup
   :update update-state
  :draw draw-state
  :key-pressed key-pressed
  :middleware [m/fun-mode m/pause-on-error])

