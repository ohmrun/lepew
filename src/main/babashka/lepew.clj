(ns lepew)

(require '[edn-db.reader :as read])
(require '[edn-db.actions :as edit])
(require '[contajners.core :as c])

(def data (read/get-collection "yardie"))

(defn sanity [_] data)
(def images (c/client (merge data {:category :images})))
(def containers (c/client (merge data {:category :containers})))

(defn images-cfg [_] images)