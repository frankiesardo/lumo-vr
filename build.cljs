(require '[lumo.build.api :as b])

(b/build "src"
  {:output-to "index.vr.js"
   :optimizations :advanced})
