(require '[portal.api :as portal])

;; (do
;;   (.addShutdownHook (Runtime/getRuntime)
;;                     (Thread. (fn [] (portal/close))))
;;   (def p (portal/open {:app true}))
;;   (add-tap #'portal/submit))

(def inited :true)