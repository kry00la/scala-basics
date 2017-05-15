package main.traits

/**
  * Created by Led on 26/03/2017.
  */
class Dashboard(var speed:Float) extends Speedometer {
  def showSpeed: Float = speed
  def increaseSpeed(rate:Float) = println(s"increasing speed at $rate")
  def decreaseSpeed(rate:Float) = println(s"decreasing speed at $rate")
}

class GenericDashboard[T] (var speed:T) extends GenericSpeedometer[T] {
  def showSpeed: T = speed
  def increaseSpeed(rate:T) = println(s"increasing speed at $rate")
  def decreaseSpeed(rate:T) = println(s"decreasing speed at $rate")
}


class CarDashboard {
  // Start of trait example 1
  val speedometer: Dashboard = new Dashboard(5)
  println(s"inital speed = > ${speedometer.showSpeed}")
  speedometer.increaseSpeed(6)
  speedometer.decreaseSpeed(9)

  val speedometer2: GenericDashboard[Double] = new GenericDashboard(25.1  )
  println(s"inital speed = > ${speedometer2.showSpeed}")
  speedometer2.increaseSpeed(10)
  speedometer2.decreaseSpeed(11)
  // End of trait sample 1
}