package fr.istic.si2.test.tp5

import org.junit.Test
import org.junit.Assert._
import fr.istic.si2.scribble._
import fr.istic.si2.testerApp._
import fr.istic.si2.moreAssertions._
import fr.istic.si2.tp5._
import fr.istic.si2.tp5.ExosListesNonVides._

class TestsExosListesNonVides {

  val _ = new AppInit(ExosListesNonVides) // Ne pas supprimer

  /**
   * Test de la fonction dernier avec une liste avec un element
   */
  @Test(timeout = 100)
  def dernierList1Element() {
    assertEquals(1, dernier(List(1)))
  }

  /**
   * Test de la fonction dernier avec une liste avec deux element
   */
  @Test(timeout = 100)
  def dernierList2Element() {
    assertEquals(1, dernier(List(2, 1)))
  }

  /**
   * Test de la fonction dernier avec une liste avec trois element
   */
  @Test(timeout = 100)
  def dernierList3Element() {
    assertEquals(1, dernier(List(3, 2, 1)))
  }


  /**
   * Test de la fonction dernier avec une liste custom avec un element
   */
  @Test(timeout = 100)
  def dernierCustomList1Element() {
    assertEquals(1, dernier(LastElement(1)))
  }

  /**
   * Test de la fonction dernier avec une liste custom avec deux element
   */
  @Test(timeout = 100)
  def dernierCustomList2Element() {
    assertEquals(1, dernier(Element(2, LastElement(1))))
  }

  /**
   * Test de la fonction dernier avec une liste custom avec trois element
   */
  @Test(timeout = 100)
  def dernierCustomList3Element() {
    assertEquals(1, dernier(Element(12, Element(2, LastElement(1)))))
  }


}
