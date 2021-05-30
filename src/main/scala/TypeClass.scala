object TypeClass {
  case class Circle(radius: Double)

  case class Rectangle(width: Double, length: Double)

  trait Shape[A] {
    def area(shape: A): Double
  }

  implicit object CircleShape extends Shape[Circle] {
    override def area(shape: Circle): Double = math.Pi * math.pow(shape.radius, 2)
  }

  implicit object RectangleShape extends Shape[Rectangle] {
    override def area(shape: Rectangle): Double = shape.width * shape.length
  }

  def areaOf[A](shape: A)(implicit shapeImpl: Shape[A]): Double = shapeImpl.area(shape)
}

@main def main = {
  import TypeClass._
  println(areaOf(Circle(10)))
  println(areaOf(Rectangle(5, 5)))
}
