package fr.istic.si2.tp5

import org.junit.Assert._

/**
 * Type algébrique récursif pour modéliser
 * des nombres entiers positifs ou nuls écrits uniquement avec des bâtons
 *
 * ex: pour représenter l'entier 5, on l'écrirait | | | | |
 */
sealed trait Nombre

case object Zero extends Nombre

case class Baton(n: Nombre) extends Nombre

object ExosBatons extends App {

  /**
   * Le nombre bâtons représentant le zéro
   */
  val zero: Nombre = Baton(Zero)

  /**
   * Le nombre bâtons représentant l'entier 3
   */
  val trois: Nombre = Baton(Baton(Baton(Zero)))

  /**
   * Le nombre bâtons représentant l'entier 6
   */
  val six: Nombre = Baton(Baton(Baton(Baton(Baton(Baton(Zero))))))

  /**
   * @param n un entier positif ou nul
   * @return le nombre bâton correspondant à l'entier n
   */
  def fromInt(n: Int): Nombre = {
    n match {
      case 0 => Zero
      case _ => Baton(fromInt(n - 1))
    }
  }

  /**
   * @param n1 un nombre bâtons
   * @param n2 un nombre bâtons
   * @return le nombre bâton obtenu en faisant la somme de n1 et n2
   */
  def plus(n1: Nombre, n2: Nombre): Nombre = {
    n1 match {
      case Zero => n2
      case Baton(newNumber) => Baton(plus(newNumber, n2))
    }
  }

  /**
   * @param n1 un nombre bâton
   * @param n2 un nombre bâton
   * @return n1 est supérieur ou égal à n2
   */
  def supOuEgal(n1: Nombre, n2: Nombre): Boolean = {
    n1 match {
      case Zero => n2 match {
        case Zero => true
        case _ => false
      }
      case Baton(newNumberN1) => n2 match {
        case Zero => true
        case Baton(newNumberN2) => supOuEgal(newNumberN1, newNumberN2)
      }
    }
  }

  /**
   * @param n un nombre bâton compris entre 0 et Int.MaxValue
   * @return un entier correspondant à n
   */
  def toInt(n: Nombre): Int = {
    n match {
      case Zero => 0
      case Baton(newNumber) => 1 + toInt(newNumber)
    }
  }

}