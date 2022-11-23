fun main() {
    val myInventoryManagement=InventoryManagement()
    val items = arrayOf(Item("Choco",12),Item("Oranges",12),Item("Apples",12),)

    myInventoryManagement.addItems(items)
//    myInventoryManagement.addItem()
//    myInventoryManagement.removeItem("Choco")
    myInventoryManagement.getAllItems()
    myInventoryManagement.removeItem("Choco")
    myInventoryManagement.getAllItems()
    myInventoryManagement.findItem("Choco")
}