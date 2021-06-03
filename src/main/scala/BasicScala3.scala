package scala3

import java.sql.Connection
import scala.annotation.tailrec

package caseclass {
  private[scala3] abstract class Test

  private[scala3] case class MyCaseClass(teste: String, idade: Int) extends Test

  private[scala3] case class Teste(cidade: String) extends Test

  private[scala3] val myCase = Teste("nome")

  object MyCaseClass {
    def apply(): Test = MyCaseClass("nome", 46)
  }

  def meuMatch(caseClass: Test) = caseClass match {
    case myVal@MyCaseClass("nome", 46) => s"objeto igual $myVal"
    case myVal@MyCaseClass(teste, idade) => s"objeto igual: $teste - $idade - ${myVal.teste} - ${caseClass.asInstanceOf[MyCaseClass].teste}"
    case teste: MyCaseClass => s"MyCaseClass: $teste"
    case test: Teste => s"MyCaseClass: $test"
    case _ => s"default"
  }
}

package tailrec {
  @tailrec def sum(ints: List[Int], acc: Int): Int = ints match {
    case Nil => acc
    case (primeiro :: cauda) => sum(cauda, primeiro + acc)
  }

  val result = sum(List(1,2,3,4,5), 0)
}

object BasicScala3 {

  def main(args: Array[String]): Unit = {

    import scala3.caseclass.*
    println(meuMatch(MyCaseClass("nome", 46)))

    import scala3.tailrec.*
    println(result)

    if (2 < 4) then println(3) else println(4)
    if (2 < 4) println(3) else println(4)

    val list = List(1,2,3,4,5)

    for i <- list do println(i)

    val resultFor = for (element <- list if element % 2 == 0)
      yield element

    val teste: Option[Int] = None

    val myOpt: Option[Int] = Some(1)
    val pairs = for {
      num <- List(1,2,3)
      char <- List('a', 'b', 'c')
      optInt <- myOpt
    } yield num + "-" + char + "-" + optInt
    println(s"saida: $pairs")
  }
}
