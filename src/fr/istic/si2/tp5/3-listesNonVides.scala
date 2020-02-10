package fr.istic.si2.tp5

import org.junit.Assert._

/**
 * Type algébrique récursif permettant de modéliser
 * des listes d'entiers non vides
 */
sealed trait ListeNVE
//TODO Compléter ici la définition du type algébrique ListeNVE

object ExosListesNonVides extends App {

  /**
   * @param l une liste non vide d'entiers
   * @return le dernier élément de l
   */
  // TODO 
  def dernier(l: List[Int]): Int = ???

  /**
   * @param l une ListeNVE quelconque
   * @return le dernier élément de l
   */
  // TODO 
  def dernier(l: ListeNVE): Int = ???

}