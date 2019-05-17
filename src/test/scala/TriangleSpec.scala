import com.interview.Triangle.triangleType
import org.specs2.mutable._

class TriangleSpec extends Specification {

  "Given Triangle " should {
    sealed trait TriangleType
    case object Equilateral extends TriangleType
    case object Isosceles  extends TriangleType
    case object Scalene extends TriangleType

    "is of type Isosceles " in {
      val typeOfTriangle = triangleType(3, 3 , 5)
      typeOfTriangle.toString.must_===(Isosceles.toString)

    }
  }

}
