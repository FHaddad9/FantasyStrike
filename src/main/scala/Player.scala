import scala.collection.mutable.ArrayBuffer

class Player(val name: String, var health: Int, val strength: Int, val defense: Int, val inventory: ArrayBuffer[String])
  extends Character(name, health, strength, defense, inventory) {
  def displayInventory(): Unit = {
    inventory.foreach(x => println(s"$x"))
  }

  def useItem(item: String): String = {
    item match {
      case "Potion" =>
        health += 20
        s"Used potion, Health +20!"
      case "Hero's Drink" =>
        strength += 1
        s"Used Hero's Drink, Strength +1!"
      case _ =>
        s"Item not found"
    }
  }

}
