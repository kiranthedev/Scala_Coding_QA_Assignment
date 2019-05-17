package com.interview

import scala.collection.mutable.Stack

object LinkedList {

  def nthElementOfAList[A](list: List[A], nthElem: Int): Option[A] = {

    assert(!list.isEmpty)
    assert(nthElem > 0)

    val mutableStack = Stack[A]()
    mutableStack.pushAll(list)

    def recursive(n : Int): Option[A] = n match {
      case 1  => Some(mutableStack.pop())
      case _ => {
        mutableStack.pop()
        recursive(n-1)}
    }
    recursive(nthElem)
  }

}