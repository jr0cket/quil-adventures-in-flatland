(ns adventures-in-flatland.core
  (:use quil.core))

(def canvas-size [320 200])  ;; the size of our graphics window

(defn setup
  "Establish your drawing tools..."
  []
  (smooth)         ;; anti-alising
  (frame-rate 1)   ;; what are good rates ?
  (background 000) ;; sets the back ground colour of the canvas
  )

(defn draw-fail
  "Lets draw some stuff..."
  []
  (stroke 100)
  (stroke-weight 10)
  (fill 050)

  (ellipse 10 20 50 80)
  )


(defn draw []
  (stroke (random 255))             ;;Set the stroke colour to a random grey
  (stroke-weight (random 10))       ;;Set the stroke thickness randomly
  (fill (random 255))               ;;Set the fill colour to a random grey

  (let [diam (random 100)           ;;Set the diameter to a value between 0 and 100
        x    (random (width))       ;;Set the x coord randomly within the sketch
        y    (random (height))]     ;;Set the y coord randomly within the sketch
    (ellipse x y diam diam)))       ;;Draw a circle at x y with the correct diameter


(defsketch jr0cket-basic
  "I draw things in my sleep"
  :title "Do android phones dream of electric sheep"
  :setup setup
  :draw draw    ;; state which is the draw function
  :size [320 240]
  )

;
;(defsketch moon-at-night
;  "Simple moon in the dark night sky"
;  :setup (fn [] (background 20) (ellipse 50 50 80 80))
;  :tile "The moon delights the night"
;)
