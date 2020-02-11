package fr.istic.si2.tp5

import org.junit.Assert._

/**
 * Type algébrique récursif permettant de modéliser
 * des listes d'entiers non vides
 */
sealed trait ListeNVE

case class Element(element: Int, children: ListeNVE) extends ListeNVE

case class LastElement(element: Int) extends ListeNVE

object ExosListesNonVides extends App {

  /**
   * @param l une liste non vide d'entiers
   * @return le dernier élément de l
   */
  def dernier(l: List[Int]): Int = {
    l match {
      case firstElementOfTheList :: theRest => theRest.length match {
        case 0 => firstElementOfTheList
        case _ => dernier(theRest)
      }
    }
  }

  println(dernier(List(1, 2, 3, 4, 5, 6, 7, 8)))

  /**
   * @param l une ListeNVE quelconque
   * @return le dernier élément de l
   */
  def dernier(l: ListeNVE): Int = {
    l match {
      case Element(_, children) => dernier(children)
      case LastElement(element) => element
    }
  }

  println(dernier(Element(5, Element(12, Element(7, LastElement(9))))))

}