object ProcessNumbers {
  def main(args: Array[String]): Unit = {

    def processList(input: List[Int]): Int = {
      val result = input
        .filter(_ % 2 == 0)
        .map(_ * 3)
        .sum
      result
    }

    val numbers = List(1, 2, 3, 4, 5, 6)
    println(processList(numbers))
  }
}