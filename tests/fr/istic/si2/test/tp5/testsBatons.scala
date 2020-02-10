package fr.istic.si2.test.tp5

import org.junit.Test
import org.junit.Assert._
import fr.istic.si2.scribble._
import fr.istic.si2.testerApp._
import fr.istic.si2.moreAssertions._
import fr.istic.si2.tp5._
import fr.istic.si2.tp5.ExosBatons._

class TestsExosBatons {

  val _ = new AppInit(ExosBatons) // Ne pas supprimer

  /**
   * Tests de la fonction plus : 0 = 0 + 0 
   */
  @Test(timeout = 100)
  def plusZero() {
    assertEquals(Zero, plus(Zero, Zero))
  }

  /**
   * Tests de la fonction plus : 1 = 1 + 0 
   */
  @Test(timeout = 100)
  def plusTest1() {
    assertEquals(Baton(Zero), plus(Baton(Zero), Zero))
  }

  // A vous de compléter les jeux de test pour tester vos fonctions !
  // Inspirez-vous des exemples ci-dessus

  /**
   * Tests de la fonction fromInt : 0
   */
  @Test(timeout = 100)
  def fromIntZero() {
    assertEquals(Zero, fromInt(0))
  }

  /**
   * Tests de la fonction fromInt : 1
   */
  @Test(timeout = 100)
  def fromInt1() {
    assertEquals(Baton(Zero), fromInt(1))
  }

  /**
   * Tests de la fonction fromInt : 2
   */
  @Test(timeout = 100)
  def fromInt2() {
    assertEquals(Baton(Baton(Zero)), fromInt(2))
  }


  /**
   * Tests de la fonction plus : a + b avec a et b variant de 0 à 100
   */
  @Test(timeout = 100)
  def plusTest2() {
    for (a <- 0 to 100) {
      for (b <- 0 to 100) {
        assertEquals(fromInt(a + b), plus(fromInt(a), fromInt(b)))
      }
    }
  }
  /**
   * Tests de la fonction supOuEgal : a >= b avec a et b variant de 0 à 100
   */
  @Test(timeout = 100)
  def supOuEgalTest1() {
    for (n1 <- 0 to 100) {
      for (n2 <- 0 to 100) {
        assertEquals(n1 >= n2, supOuEgal(fromInt(n1), fromInt(n2)))
      }


    }
  }


  /**
   * Tests de la fonction toInt : a avec a variant de 0 à 100
   */
  @Test(timeout = 100)
  def toIntTest1() {
    for (a <- 0 to 100) {
      assertEquals(a, toInt(fromInt(a)))
    }
  }


}
