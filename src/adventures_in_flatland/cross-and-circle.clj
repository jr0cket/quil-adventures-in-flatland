(ns adventures-in-flatland.cross-with-circle
  (:use quil.core))

(defn setup []
  (smooth)
  (background 230 230 230)
  (stroke 130, 0 0)
  (stroke-weight 4)
  (let [cross-size 70
        circ-size 50
        canvas-x-center (/ (width) 2)
        canvas-y-center (/ (height) 2)
        left (- canvas-x-center cross-size)
        right (+ canvas-x-center cross-size)
        top (+ canvas-y-center cross-size)
        bottom (- canvas-y-center cross-size)]
    (line left bottom right top)
    (line right bottom left top)

    (fill 255 150)
    (ellipse canvas-x-center canvas-y-center circ-size circ-size)))

(defsketch gen-art-1
  :title "Cross with circle"
  :setup setup
  :size [500 300])
