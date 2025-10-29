object Exo3 {

  case class Record(city: String, date: String, temperature: Double, humidity: Double)

  val data = List(
    Record("Paris", "2025-03-01", 12.3, 0.65),
    Record("Paris", "2025-03-02", 15.1, 0.60),
    Record("Lyon", "2025-03-01", 10.5, 0.7),
    Record("Lyon", "2025-03-02", 9.8, 0.75),
    Record("Marseille", "2025-03-01", 17.2, 0.55),
    Record("Marseille", "2025-03-02", 18.4, 0.58)
  )


  def averageTemperature(data: List[Record]): Double = {
    val temps = data.map(_.temperature)
    temps.sum / temps.length
  }


  def averageTemperatureByCity(data: List[Record]): Map[String, Double] = {
    data
      .groupBy(_.city)
      .map { case (city, records) =>
        val avgTemp = records.map(_.temperature).sum / records.length
        city -> avgTemp
      }
  }


  def hottestCity(data: List[Record]): String = {
    val cityTemps = averageTemperatureByCity(data)
      cityTemps.maxBy(_._2)._1
  }


  def normalizeTemp(data: List[Record]): List[Record] ={
    data
      .map(r => r.copy(temperature = r.temperature * 9/5 + 32))

  }


  def filterByTemperature(data: List[Record], min: Double, max: Double): List[Record] = {
    return data.filter(_.temperature< max).filter(_.temperature> min)

  }






  def main(args: Array[String]): Unit = {
    println(f"Average.Temp: ${averageTemperature(data)}%.2f°C")
    println(s"Average.Temp by city: ${averageTemperatureByCity(data)}")
    println(s"Hottest city: ${hottestCity(data)}")
    println(s"Fahrenheit: ${normalizeTemp(data)}")
    println(s"filterByTemperature: ${filterByTemperature(data,1, 10)}")
  }
}
