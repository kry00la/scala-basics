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
