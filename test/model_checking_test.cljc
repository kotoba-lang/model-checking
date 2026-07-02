(ns model-checking-test
  (:require [clojure.test :refer [deftest is testing]]
            [model-checking]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? (the-ns 'model-checking)))))
