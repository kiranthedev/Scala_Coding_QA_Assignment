package com.interview

object ListCompare {

  def listCompare(list1: List[Int], list2: List[Int]): Boolean = {

    assert(!list1.isEmpty)
    assert(!list2.isEmpty)

    val sortedList1 = list1.sortWith((x, y) => x < y)
    val sortedList2 = list2.sortWith((x, y) => x < y)
    helper(sortedList1, sortedList2)

  }

  def helper(list1: List[Int], list2: List[Int]): Boolean = {
    val zipped: List[(Int, Int)] = list1.zip(list2)
    zipped.forall { case (x, y) => x == y }
  }

}
