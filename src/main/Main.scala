package scala.basic

import main.traits.{GenericDashboard, Dashboard}
import scala.basic.abstraction._
/**
  * Created by Led on 09/04/2017.
  */
object Main {
  def main(args: Array[String]) {


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

    // Start of abstraction example 1
    println("**** Generic Hero ****")
    var hero = new SuperHero
    hero.chargeSuperWeapon()
    hero.useSuperWeapon()

    println("**** VoltesV ****")
    hero = new VoltesV
    hero.chargeSuperWeapon("Ultra magnetic top")
    hero.useSuperWeapon("Ultra magnetic top")

    println("*** MazingerZ ***")
    val mz = new MazingerZ
    mz.chargeSuperWeapon("Rocket Punch")
    mz.useSuperWeapon("Rocket Punch")
    // End of abstraction example 1
  }
}
