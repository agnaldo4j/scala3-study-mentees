
object TypeClassScala3 {
  case class Circle(radius: Double)

  case class Rectangle(width: Double, length: Double)

  trait Shape[A]:
    extension (shape: A)
      def area(plus: Int): Double

  given Shape[Circle] with
    extension (shape: Circle)
      def area(plus: Int): Double = (math.Pi * math.pow(shape.radius, 2) + plus)

  given Shape[Rectangle] with
    extension (shape: Rectangle)
      def area(plus: Int): Double = (shape.width * shape.length) + plus

  def areaOf[A: Shape](shape: A): Double = shape.area(10)
}

@main def mainTypeClassScala3 = {
  import TypeClassScala3._
  println(areaOf(Circle(10)))
  println(areaOf(Rectangle(5, 5)))
}
