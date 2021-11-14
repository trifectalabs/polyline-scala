package com.trifectalabs.polyline

import org.scalatest.wordspec.AnyWordSpec

class PolylineTest extends AnyWordSpec {
  val coordinates1 = List(LatLng(38.5, -120.2), LatLng(40.7, -120.95), LatLng(43.252, -126.453))
  val coordinates2 = List(
    LatLng(43.525524, -80.288602),
    LatLng(44.285024, -81.294820)
  )
  val coordinates3 = List(
    LatLng(43.44659, -80.54960),
    LatLng(43.44715, -80.55008),
    LatLng(43.44734, -80.55029),
    LatLng(43.44734, -80.55029),
    LatLng(43.44782, -80.55087),
    LatLng(43.44790, -80.55097),
    LatLng(43.44790, -80.55097),
    LatLng(43.44808, -80.55068),
    LatLng(43.44835, -80.55009),
    LatLng(43.44835, -80.55009),
    LatLng(43.44841, -80.54993),
    LatLng(43.44841, -80.54993),
    LatLng(43.44992, -80.55118),
    LatLng(43.44992, -80.55118),
    LatLng(43.45082, -80.55192),
    LatLng(43.45082, -80.55192),
    LatLng(43.45196, -80.55291),
    LatLng(43.45196, -80.55291),
    LatLng(43.45251, -80.55339),
    LatLng(43.45251, -80.55339),
    LatLng(43.45361, -80.55441),
    LatLng(43.45368, -80.55448),
    LatLng(43.45368, -80.55448),
    LatLng(43.45412, -80.55488),
    LatLng(43.45457, -80.55523),
    LatLng(43.45457, -80.55523),
    LatLng(43.45513, -80.55560),
    LatLng(43.45513, -80.55560),
    LatLng(43.45541, -80.55579),
    LatLng(43.45541, -80.55579),
    LatLng(43.45545, -80.55567),
    LatLng(43.45557, -80.55555),
    LatLng(43.45571, -80.55545),
    LatLng(43.45605, -80.55524),
    LatLng(43.45605, -80.55524),
    LatLng(43.45604, -80.55520),
    LatLng(43.45604, -80.55511),
    LatLng(43.45606, -80.55500),
    LatLng(43.45651, -80.55371),
    LatLng(43.45659, -80.55358),
    LatLng(43.45669, -80.55347),
    LatLng(43.45681, -80.55339),
    LatLng(43.45711, -80.55328)
  )

  "A Polyline" when {
    "encoding" should {
      "encode a list of coordinates to a polyline string (#1)" in {
        assert(Polyline.encode(coordinates1) == "_p~iF~ps|U_ulLnnqC_mqNvxq`@")
      }
      "encode a list of coordinates to a polyline string (#2)" in {
        assert(Polyline.encode(coordinates2) == "oathGvj`iN{isCzocE")
      }
      "encode a list of coordinates to a polyline string containing '?'s (#3)" in {
        assert(
          Polyline.encode(
            coordinates3
          ) == "etdhG~isjNoB~Ae@h@??_BrBOR??c@y@u@uB??K_@??mHxF??sDrC??cFdE??mB~A??{EjEML??wAnAyAdA??oBhA??w@d@??GWWW[ScAi@??@G?QCUyAaGOYSUWO{@U"
        )
      }
    }

    "decoding" should {
      "decode a polyline string to a list of coordinates (#1)" in {
        assert(Polyline.decode("_p~iF~ps|U_ulLnnqC_mqNvxq`@") == coordinates1)
      }
      "decode a polyline string to a list of rounded coordinates (#2)" in {
        assert(
          Polyline.decode("oathGvj`iN{isCzocE") == List(
            LatLng(43.52552, -80.28860),
            LatLng(44.28502, -81.29482)
          )
        )
      }
      "deocde a polyline string containing '?'s to a list of rounded coordinates (#3)" in {
        assert(
          Polyline.decode(
            "etdhG~isjNoB~Ae@h@??_BrBOR??c@y@u@uB??K_@??mHxF??sDrC??cFdE??mB~A??{EjEML??wAnAyAdA??oBhA??w@d@??GWWW[ScAi@??@G?QCUyAaGOYSUWO{@U"
          ) == List(
            LatLng(43.44659, -80.54960),
            LatLng(43.44715, -80.55008),
            LatLng(43.44734, -80.55029),
            LatLng(43.44734, -80.55029),
            LatLng(43.44782, -80.55087),
            LatLng(43.44790, -80.55097),
            LatLng(43.44790, -80.55097),
            LatLng(43.44808, -80.55068),
            LatLng(43.44835, -80.55009),
            LatLng(43.44835, -80.55009),
            LatLng(43.44841, -80.54993),
            LatLng(43.44841, -80.54993),
            LatLng(43.44992, -80.55118),
            LatLng(43.44992, -80.55118),
            LatLng(43.45082, -80.55192),
            LatLng(43.45082, -80.55192),
            LatLng(43.45196, -80.55291),
            LatLng(43.45196, -80.55291),
            LatLng(43.45251, -80.55339),
            LatLng(43.45251, -80.55339),
            LatLng(43.45361, -80.55441),
            LatLng(43.45368, -80.55448),
            LatLng(43.45368, -80.55448),
            LatLng(43.45412, -80.55488),
            LatLng(43.45457, -80.55523),
            LatLng(43.45457, -80.55523),
            LatLng(43.45513, -80.55560),
            LatLng(43.45513, -80.55560),
            LatLng(43.45541, -80.55579),
            LatLng(43.45541, -80.55579),
            LatLng(43.45545, -80.55567),
            LatLng(43.45557, -80.55555),
            LatLng(43.45571, -80.55545),
            LatLng(43.45605, -80.55524),
            LatLng(43.45605, -80.55524),
            LatLng(43.45604, -80.55520),
            LatLng(43.45604, -80.55511),
            LatLng(43.45606, -80.55500),
            LatLng(43.45651, -80.55371),
            LatLng(43.45659, -80.55358),
            LatLng(43.45669, -80.55347),
            LatLng(43.45681, -80.55339),
            LatLng(43.45711, -80.55328)
          )
        )
      }
    }
  }
}
