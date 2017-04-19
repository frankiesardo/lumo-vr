(ns app.core)

(def React (js/require "react"))
(def ReactVR (js/require "react-vr"))

(def createFactory (aget React "createFactory"))
(def createClass (aget React "createClass"))

(def registerComponent (aget ReactVR "AppRegistry" "registerComponent"))

(def Pano (createFactory (aget ReactVR "Pano")))
(def View (createFactory (aget ReactVR "View")))
(def Text (createFactory (aget ReactVR "Text")))

(def asset (aget ReactVR "asset"))

(def style
  #js {
    :backgroundColor "#777879",
    :fontSize 0.8,
    :fontWeight "400",
    :layoutOrigin #js [0.5, 0.5],
    :paddingLeft 0.2,
    :paddingRight 0.2,
    :textAlign "center",
    :textAlignVertical "center",
    :transform #js [ #js {:translate #js [0, 0, -3]}],
    })


(def App (createClass
            #js {:render (fn []
                           (View. #js {}
                                  (Pano. #js {:source (asset "chess-world.jpg")})
                                  (Text. #js {:style style} "Hello")))}))

(registerComponent "WelcomeToVR" (fn [] App))
