import com.interview.ListCompare.listCompare
import org.specs2.mutable._

class ListCompareSpec extends Specification {

  "Compare" should {

    "given two lists : all element of second list is present in first list - true " in {
      val same = listCompare(List(1, 3, 6, 2), List(1, 2, 3))
      same must_=== (true)
    }

    "given two lists : all element of second list(1, 2) is present in first list(1, 2, 3) - true" in {
      val notSame = listCompare(List(1, 2, 3), List(1, 2))
      notSame must_=== (true)
    }

    "given two lists : all element of second list(1, 5) is not present in first list(1, 2, 3) - false" in {
      val notSame = listCompare(List(1, 2, 3), List(1, 5))
      notSame must_=== (false)
    }
  }

}
