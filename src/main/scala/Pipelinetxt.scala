object Pipelinetxt {
  def main(args: Array[String]): Unit = {

    def pipelinetxt(txt: String): Map[String, Int] = {
      txt.split("\\s+")
        .map(_.toLowerCase)
        .filter(_.length >= 4)
        .groupBy(identity)
        .view.mapValues(_.length)
        .toMap
    }

    val txt = "Scala is great and scala is functional"
    println(pipelinetxt(txt))
  }
}