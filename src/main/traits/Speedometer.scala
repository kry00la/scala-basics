package main.traits

/**
  * Created by Led on 26/03/2017.
  */
trait Speedometer {
  protected var speed: Float
  def showSpeed: Float
  def increaseSpeed(rate:Float)
  def decreaseSpeed(rate:Float)
}

trait GenericSpeedometer[T] {
  protected var speed: T
  def showSpeed: T
  def increaseSpeed(rate:T)
  def decreaseSpeed(rate:T)
}
