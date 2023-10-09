class Character(val name: String, var health: Int, val strength: Int, val defense: Int, val inventory: ArrayBuffer[String]){
  def attack(character: Character): Unit =
    character.takeDamage(strength)

  def takeDamage(attackAmount: Int): Unit =
    health -= attackAmount

  def addItemToInventory(item: String): Unit =
    inventory += item
}