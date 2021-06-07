

object MyApp extends App {
  val nameVal = "Agnaldo"

  var nome = "agnaldo"
  nome = "novo"

  val blocoDeCodigo = { (par: Int) =>
    val teste = par
    println(nome)
    println(teste)
  }

  val blocoDeCodigo2 = { (par: Int) =>
    val teste = par
    println(nome)
    println(teste)
  }

  val blocoDeCodigo3 = { (par: Int) =>
    val teste = par
    println(nome)
    println(teste)
  }

  def metodoCurring(par1: Int, par2: String): String = {
    s"numero: $par1 - texto $par2"
  }

  val curring = metodoCurring(10, _)
  println(curring("Agnaldo"))

  def outroMetodo(fun: Int => Unit) = fun(10)

  outroMetodo(blocoDeCodigo)

  val imprimeOlaScala = println("Olá scala")

  def novoMetodo(numero: Int) = ("numero", numero * 2)

  println(imprimeOlaScala)
  def blocoDeCodigometodo(): Function[Int, Unit] = {
    { (par: Int) =>
      val teste = par
      println(teste)
    }
  }

  blocoDeCodigo(10)
  blocoDeCodigometodo()(10)

  println( 2.+(2) == 2 + 2)

  val (nomeTupla, valorTupla) = novoMetodo(30)
  println(s"nome: $nomeTupla - valor: $valorTupla")

  import scala.annotation.tailrec
  @tailrec def rec(acc: Int, n: Int): Int = {
    if (n == 0) acc
    else rec(n * acc, n - 1)
  }

  val curring2 = rec(1, _)

  println(curring2(10))

  /*
  class Animal {
    String name = ""
    public Animal(String name) {
      this.name = name
    }
  }

  class Vaca extends Animal {
    public Vaca(String name) {
      super(name)
    }
  }
  */

  class Animal(val nome: String) {}
  val animal = new Animal("Vaca")

  trait Herbivoro {
    val nome: String
    val idade: Int
    def comePlantas(): Unit
    def muge(): Unit = println("Muuuuu")
  }

  class Vaca() extends Animal("Vaca")

  object Vaca {
    def apply(): Vaca = new Vaca

    def apply(nome: String) : Animal = new Animal(nome)
  }

  val herbivoro = new Herbivoro {
    override val nome: String = "Teste"
    override val idade: Int = 2

    override def comePlantas(): Unit = println("sim")
  }

  val novaVaca = Vaca()

  def testeObject(vaca: Vaca.type): Vaca = vaca()

  extension(vaca: Int)
    def muge(): String = "muuuuuuuu"

  testeObject(Vaca)

  println(s"hamando extension function ${2.muge()}")

  abstract class MyList[T] {
    def come(animal: T) = println(animal)
  }

  class MyListOfVaca extends MyList[Animal]

  val teste = new MyListOfVaca()
  teste.come(new Vaca())

  List[Int](2,3,4,5,6)
  List("A", "B")
}

import scala.annotation.tailrec

object MyApp2 {
  def main(args: Array[String]) = {
    val result = sum(List(1,2,3,4,5), 0)
    println(s"The sum is: $result")
  }

  @tailrec def sum(ints: List[Int], acc: Int): Int = ints match {
    case Nil => acc
    case (head :: tail) => sum(tail, head + acc)
  }
}
