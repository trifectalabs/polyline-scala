package main

import main.{Polyline, LatLng}
import org.scalatest.WordSpec

class PolylineTest extends WordSpec {
  val pl = new Polyline
  val coordinates1 = List(
    LatLng(38.5, -120.2),
    LatLng(40.7, -120.95),
    LatLng(43.252, -126.453))
  val coordinates2 = List(
    LatLng(43.525524, -80.288602),
    LatLng(44.285024, -81.294820)
  )

  "A Polyline" when {
    "encoding" should {
      "encode a list of coordinates to a polyline string (#1)" in {
        assert(pl.encode(coordinates1) == "_p~iF~ps|U_ulLnnqC_mqNvxq`@")
      }
      "encode a list of coordinates to a polyline string (#2)" in {
        assert(pl.encode(coordinates2) == "oathGvj`iN{isCzocE")
      }
    }

    "decoding" should {
      "decode a polyline string to a list of coordinates (#1)" in {
        assert(pl.decode("_p~iF~ps|U_ulLnnqC_mqNvxq`@") == coordinates1)
      }
      "decode a polyline string to a list of rounded coordinates (#2)" in {
        assert(pl.decode("oathGvj`iN{isCzocE") == List(
          LatLng(43.52552, -80.28860),
          LatLng(44.28502, -81.29482)
        ))
      }
    }
  }
}
