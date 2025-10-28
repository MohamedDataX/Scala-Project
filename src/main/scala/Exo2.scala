import scala.util.Random
import scala.io.StdIn

object Exo2 {
  def main(args: Array[String]): Unit = {

    val secretNumber = Random.between(0, 101)
    var attempts = 0
    var guess = -1

    println("Guess a number between 0 and 100!")

    while (guess != secretNumber) {
      print("Your guess: ")
      guess = StdIn.readInt()
      attempts += 1

      if (guess < secretNumber) println("Too low !")
      else if (guess > secretNumber) println("Too high !")
      else println(s"Congrats! You found it in $attempts attempts ")
    }
  }
}
