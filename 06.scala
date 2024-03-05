def filterOdd_1(list: List[Int]): List[Int] = {
  if (list == Nil) Nil
  else {
    if (list.head % 2 != 0) list.head :: filterOdd_1(list.tail)
    else filterOdd_1(list.tail)
  }
}

def filterOdd_2(list: List[Int]): List[Int] = {
  list match {
    case Nil => Nil
    case head :: tail if head % 2 != 0 => head :: filterOdd_2(tail)
    case _ :: tail => filterOdd_2(tail)
  }
}

// def map_1
// def map_2
