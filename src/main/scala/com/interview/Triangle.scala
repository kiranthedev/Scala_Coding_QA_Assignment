package com.interview

object Triangle extends App {

  sealed trait TriangleType
  case object Equilateral extends TriangleType
  case object Isosceles  extends TriangleType
  case object Scalene extends TriangleType

  sealed trait Exception extends Serializable with Product

  final case object NotValidTriangle extends Exception

  def triangleType(length1: Int, length2: Int, length3: Int) =  {
    if(length1 <= 0 || length2 <= 0 || length3 <= 0 || length1 + length2 < length3 || length2 + length3 < length1 || length3 + length1 < length2) {
      NotValidTriangle
    } else if(length1 == length2 && length2 == length3) {
      Equilateral
    } else if(length1 == length2 || length2 == length3 || length3 == length1) {
      Isosceles
    } else {
      Scalene
    }
  }

}
