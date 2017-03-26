package main.traits

/**
  * Created by Led on 26/03/2017.
  */
object TestSpeedometer {
  def main(args: Array[String]) {
    val speedometer: Dashboard = new Dashboard(5)
    println(s"inital speed = > ${speedometer.showSpeed}")
    speedometer.increaseSpeed(6)
    speedometer.decreaseSpeed(9)

    val speedometer2: GenericDashboard[Double] = new GenericDashboard(25.1  )
    println(s"inital speed = > ${speedometer2.showSpeed}")
    speedometer2.increaseSpeed(10)
    speedometer2.decreaseSpeed(11)
  }
}
