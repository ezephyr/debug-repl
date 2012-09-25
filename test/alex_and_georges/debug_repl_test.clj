(ns alex-and-georges.debug-repl-test
  (:use clojure.test
        alex-and-georges.debug-repl))

(deftest launch-debug-repl
  (testing "Launch a debug repl"
    (let [a 10
          b #(+ %1 %2)]
      (debug-repl))))