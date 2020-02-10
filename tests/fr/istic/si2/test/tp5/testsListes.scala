package fr.istic.si2.test.tp5

import org.junit.Test
import org.junit.Assert._
import fr.istic.si2.scribble._
import fr.istic.si2.testerApp._
import fr.istic.si2.moreAssertions._
import fr.istic.si2.tp5._
import fr.istic.si2.tp5.ExosListes._

class TestsExosListes {

  val _ = new AppInit(ExosListes) // Ne pas supprimer


  /**
   * Test de la fonction nfois : Liste remplie de 1 de taille 0
   */
  @Test(timeout = 100)
  def nfois0Test() {
    assertEquals(List(), nfois(0, 1))
  }
  /**
   * Test de la fonction nfois : Liste remplie de 1 de taille 1
   */
  @Test(timeout = 100)
  def nfois1Test() {
    assertEquals(List(1), nfois(1, 1))
  }
  /**
   * Test de la fonction nfois : Liste remplie de 1 de taille 2
   */
  @Test(timeout = 100)
  def nfois2Test() {
    assertEquals(List(1, 1), nfois(2, 1))
  }




  /**
   * Test de la fonction concat : produit une chaine de caractère video
   */
  @Test(timeout = 100)
  def concat0Test() {
    assertEquals("", concat(List()))
  }
  /**
   * Test de la fonction concat : produit la chaine de caractère first (1 elements)
   */
  @Test(timeout = 100)
  def concat1Test() {
    assertEquals("first", concat(List("first")))
  }
  /**
   * Test de la fonction concat : produit la chaine de caractère firstsecond (2 elements)
   */
  @Test(timeout = 100)
  def concat2Test() {
    assertEquals("firstsecond", concat(List("first", "second")))
  }
  /**
   * Test de la fonction concat : produit la chaine de caractère firstsecondthird (3 elements)
   */
  @Test(timeout = 100)
  def concat3Test() {
    assertEquals("firstsecondthird", concat(List("first", "second", "third")))
  }



}
