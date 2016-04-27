(ns adventures-in-flatland.me
  (:use quil.core))

(defn setup []
  (set-image [0 0 (load-image "images/pic.jpg")]))

(defsketch only-me
  :setup setup
  :title "boo"
  :size [320 240])
