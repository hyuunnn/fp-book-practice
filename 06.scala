// filterOdd_1(List(1,2,3,4,5)) -> List(1,3,5)
def filterOdd_1(list: List[Int]): List[Int] = {
  if (list == Nil) Nil
  else {
    if (list.head % 2 != 0) list.head :: filterOdd_1(list.tail)
    else filterOdd_1(list.tail)
  }
}

// filterOdd_2(List(1,2,3,4,5)) -> List(1,3,5)
def filterOdd_2(list: List[Int]): List[Int] = {
  list match {
    case Nil => Nil
    case head :: tail if head % 2 != 0 => head :: filterOdd_2(tail)
    case _ :: tail => filterOdd_2(tail)
  }
}

// map(List(1,2,3,4,5))((x: Int) => x * 2) -> List(2,4,6,8,10)
def map[A, B](list: List[A])(f: A => B): List[B] = list match {
  case Nil => Nil
  case head :: tail => f(head) :: map(tail)(f)
}
