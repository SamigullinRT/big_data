package zoo
import scala.util.Random

object ZOO {
  val sleepTime = 3000

  def main(args: Array[String]): Unit = {
    println("Starting animal runner")

    val Seq(animalName, hostPort, partySize) = args.toSeq

    val animal = Animal(animalName, hostPort, "/zoo", partySize.toInt) //создаем объект

    // взаимодействие с ZooKeeper
    try {
      //связь ZooKeeper
      animal.enter()
      println(s"${animal.name} entered.")
      // сообщение о работе процесса
      for (i <- 1 to Random.nextInt(20)) {
        Thread.sleep(sleepTime)
        println(s"${animal.name} is running...")
      }
      animal.leave()

    } catch {
      case e: Exception => println("Animal was not permitted to the zoo." + e)
    }
  }

}