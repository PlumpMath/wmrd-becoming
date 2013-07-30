(ns cassiel.wmrd-becoming.style)

(def ASPECT (/ 24 10))

(def GALLEY-WIDTH 1170)
(def THUMB-WIDTH 300)
(def THUMB-MARGIN 5)

(def BUTTON-OUTLINE {false "1px solid #444"
                     true "1px solid #888"})

(def CURTAIN-TRIM-HIGHLIGHT {false "1px solid #888"
                             true "2px solid #FFF"})

(def SLUG-OPACITY 0.5)                  ; Fades between this and 1.0.

(def BUTTON-ACTIVE {0 "-webkit-linear-gradient(top, #333 0%, #111 100%)"
                    1 "-webkit-linear-gradient(top, #633 0%, #411 100%)"})
