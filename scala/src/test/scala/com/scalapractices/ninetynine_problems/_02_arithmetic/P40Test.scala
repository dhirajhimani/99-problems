package com.scalapractices.ninetynine_problems._02_arithmetic

import org.scalatest.{FunSpec, Matchers}

class P40Test extends FunSpec with Matchers {

  describe("P40 Spec"){
    it("phi of 10 is 4"){
      val p = P40.phi(10)
      p should be(4)
    }

    it("phi of 9 is 6"){
      val p = P40.phi(9)
      p should be(6)
    }

    it("phi of 99 is 60"){
      val p = P40.phi(99)
      p should be(60)
    }

    it("phi of 10090 is 4032") {
      val p = P40.phi(10090)
      p should be(4032)
    }
  }

}