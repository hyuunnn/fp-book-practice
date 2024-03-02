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
  ;; (my-map (fn [x] (+ x 1)) '(1 2 3)) => (2 3 4)

(defn word-count [list]
  ;; (word-count '(a b a c b)) => {"a" 2, "b" 2, "c" 1}
  (reduce
    (fn [acc_map elem]
      (if (nil? (get acc_map elem))
        (assoc acc_map elem 1)
        (update acc_map elem inc)))
    {} 
    list))
