import com.interview.LinkedList.nthElementOfAList
import org.specs2.mutable._

class LinkedListTestSpec extends Specification {

  "LinkedList" should  {

    "Return the  5th last Element from the list" in {
      val nthElem = nthElementOfAList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4)
      nthElem must_===(Some(7))
    }
  }


}
