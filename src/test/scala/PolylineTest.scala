import main.{Polyline, LatLng}
import org.scalatest.WordSpec

class PolylineTest extends WordSpec {
  val pl = new Polyline
  val coordinates = List(
    LatLng(38.5, -120.2),
    LatLng(40.7, -120.95),
    LatLng(43.252, -126.453)
  )

  "A Polyline" when {
    "encoding" should {
      "encode a list of coordinates to a polyline string" in {
        assert(pl.encode(coordinates) == "_p~iF~ps|U_ulLnnqC_mqNvxq`@")
      }
    }
    "decoding" should {
      "decode a polyline string to a list of coordinates" in {
        assert(pl.decode("_p~iF~ps|U_ulLnnqC_mqNvxq`@") == coordinates)
      }
    }
  }
}