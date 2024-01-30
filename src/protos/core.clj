(ns protos.core
  (:gen-class))

(defprotocol Loadable
  (load- [this]))
(defprotocol Editable
  (edit [this]))
(defprotocol Saveable
  (save [this]))

(deftype Prose []
  Loadable
  Editable
  Saveable
  (load- [_] (comment "prose load impl here"))
  (edit [_] (comment "prose edit impl here"))
  (save [_] (comment "prose edit impl here")))

(deftype Whiteboard []
  Loadable
  Editable
  Saveable
  (load- [_] (comment "whiteboard load impl here"))
  (edit [_] (comment "whiteboard edit impl here"))
  (save [_] (comment "whiteboard edit impl here")))

(deftype Spreadsheet []
  Loadable
  Editable
  Saveable
  (load- [_] (comment "whiteboard load impl here"))
  (edit [_] (comment "whiteboard edit impl here"))
  (save [_] (comment "whiteboard edit impl here")))

(defprotocol Export
  (export [this]))

(extend-protocol Export
  Prose
  (export [_] (comment "prose export impl here"))
  Whiteboard
  (export [_] (comment "whiteboard export impl here"))
  Spreadsheet
  (export [_] (comment "spreadsheet export impl here")))

(deftype Picture []
  Loadable
  Editable
  Saveable
  (load- [_] (comment "picture load impl here"))
  (edit [_] (comment "picture edit impl here"))
  (save [_] (comment "picture edit impl here")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
