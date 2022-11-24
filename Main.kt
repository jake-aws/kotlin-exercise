fun main() {

    checkPalindrome()
    occurence()
    val myInventoryManagement=InventoryManagement()
    val items = arrayOf(Item("choco",12),Item("oranges",12),Item("apples",12),)
    myInventoryManagement.addItems(items)
    myInventoryManagement.menu()


}