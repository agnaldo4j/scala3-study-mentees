

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
    else rec(n - 1, n * acc)
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

  class Vaca extends Animal("Vaca")

  object Vaca {
    def apply(): Vaca = new Vaca

    def apply(nome: String) : Animal = new Animal(nome)
  }

  val novaVaca = Vaca()

  val vaca = new Vaca() with Herbivoro {
    override val idade: Int = 10

    override def comePlantas(): Unit = println("ok")
  }

  def testeObject(vaca: Vaca.type): Vaca = vaca()

  testeObject(Vaca)

  vaca.isInstanceOf[Herbivoro]
  vaca.nome
}
