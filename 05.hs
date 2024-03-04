-- fibo 6 => 8
-- fibo 7 => 13
fibo :: Int -> Int
fibo 1 = 1
fibo 2 = 1
fibo n = fibo (n - 1) + fibo (n - 2)

-- maxOfList [9, 2, 1] => 9
-- maxOfList [4, 5, 2] => 5
-- maxOfList [1, 2, 3] => 3
maxOfList :: [Int] -> Int
maxOfList [] = 0
maxOfList [a] = a
maxOfList (head:tail) = max head (maxOfList tail)

-- nth [1, 2, 3] 2 => 2
nth :: [Int] -> Int -> Int
nth (head:tail) n
  | n == 1    = head
  | otherwise = nth tail (n - 1)

-- mymap (\x -> x + 1) [1, 2, 3] => [2, 3, 4]
mymap :: (a -> b) -> [a] -> [b]
mymap fp [] = []
mymap fp [a] = [fp a]
mymap fp (head:tail) = fp head : mymap fp tail

-- TODO
-- myfilter
-- myfoldl
