import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class Character(val name: String, var health: Int, var strength: Int, val defense: Int, val inventory: ArrayBuffer[String]){
  def attack(character: Character): Unit =
    character.takeDamage(strength - Random.nextInt(strength+1))

  def takeDamage(attackAmount: Int): Unit =
    health -= attackAmount

  def isDead: Boolean =
    health <= 0

  def showHealth: Unit =
    println(s"$name's health: ${health}")

  def addItemToInventory(item: String): Unit =
    inventory += item
}