(defn sum-of-list [list]
  ;; (sum-of-list '(1 2 3 4 5)) => 15
  (if (empty? list)
    0
    (+ (first list) 
       (sum-of-list (rest list)))))

(defn max-of-list [list]
  ;; (max-of-list '(4 3 2 5 1)) => 5
  (if (empty? list)
    0
    (max (first list) 
         (max-of-list (rest list)))))

(defn my-map [fp list])
