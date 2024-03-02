(defun is-exist (input-list num)
  ;; (is-exist '(1 2 3) 3)
  ;; "yes"
  ;; (is-exist '(1 2 3) 4)
  ;; "no"
  (cond
    ((null input-list) "no")
    ((eq (car input-list) num) "yes")
    (t (is-exist (cdr input-list) num))))

(defun duplicate-elem (input-list))

(defun filter-odd-1 (input-list)
  ;; (filter-odd-1 '(1 2 3 4 5))
  ;; (1 3 5)
  (cond 
    ((null input-list) nil)
    ((eq 1 (mod (list-length input-list) 2)) 
     (cons (car input-list) 
     (filter-odd (cdr input-list))))
    (t (filter-odd (cdr input-list)))))

(defun filter-odd-2 (input-list)
  ;; (filter-odd-1 '(1 2 3 4 5))
  ;; (1 3 5)
  (cond 
    ((null input-list) nil)
    (t (cons (car input-list) 
             (filter-odd (cdr (cdr input-list)))))))
