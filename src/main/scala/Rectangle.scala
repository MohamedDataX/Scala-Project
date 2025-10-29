object Rectangle {

  var width: Double = 0
  var height: Double = 0


  def area(width: Double, height: Double): Double = width * height


  def perimeter(width: Double, height: Double): Double = 2 * (width + height)


  def main(args: Array[String]): Unit = {
    width = 5
    height = 3

    println(s"Width: $width, Height: $height")
    println(s"Area: ${area(width, height)}")
    println(s"Perimeter: ${perimeter(width, height)}")
  }
}
