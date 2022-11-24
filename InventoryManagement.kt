import java.util.*

class InventoryManagement {
    private var inventory = LinkedList<Item>()
    private fun pressEnterToContinue() {
        println("Press Enter key to continue...")
        try {
            System.`in`.read()
        } catch (e: Exception) {
            println(e)
        }
    }
    private fun findItem(name:String): Boolean {
        for (item in inventory){
            if (item.name == name) {
                return true
            }
        }
        return false
    }
    private fun findItem() {
        print("Input item name: ")
        val name = readln()
        for (item in inventory){
            if (item.name == name) {
                println("${item.name} : ${item.num}")
                return
            }
        }
        println("$name not found.")
        pressEnterToContinue()

    }
    fun addItems(items:Array<Item>){
        items.forEach { inventory.add(it) }
    }
    private fun addItem(){
        print("Input item name: ")
        val name = readln()
        print("Input item stock: ")
        val num = readln()
        val newItem = Item(name.lowercase(),num.toInt())
        if (!findItem(name)) {
            inventory.add(newItem)
            println("Item added to inventory!")
        }else{
            println("Item already exists!")
        }
        pressEnterToContinue()
    }
    private fun getAllItems(){

        for (item in inventory){
            println("${item.name} : ${item.num}")
        }
        pressEnterToContinue()
    }
    private fun removeItem() {
        print("Input item name: ")
        val name = readln()
        if (findItem(name)){
            inventory.removeIf { it.name == name }
            println("Item removed to inventory!")
        }else{
            println("Operation failed!")
        }
        pressEnterToContinue()

    }
    private fun updateItem(){
        print("Input item name: ")
        val name = readln()
        var itemFound = false
        for (item in inventory){
            if (item.name == name) {
                itemFound = true
                print("Input item stock (+/- N): ")
                val num = readln()
                item.addStock(num.toInt())
                println("Item Updated")
            }
        }

        if (!itemFound)println("Item not found!")
        pressEnterToContinue()


    }

    fun menu(){
        do {
            println("Inventory Management Menu")
            println("1 : Add product")
            println("2 : Remove product")
            println("3 : Find product")
            println("4 : Update product")
            println("5 : List products")
            println("6 : Exit")
            println("Choose your desired operation:")
            val operation:Int = readln().toInt()

            when(operation){
                Operations.ADD.value -> addItem()
                Operations.REMOVE.value -> removeItem()
                Operations.FIND.value -> findItem()
                Operations.UPDATE.value -> updateItem()
                Operations.READ_ALL.value -> getAllItems()
                Operations.STOP.value -> println("Closing System.")
                else -> println("Invalid selection.")
            }

        }while(operation != Operations.STOP.value)
    }

}

enum class Operations(val value: Int){
    ADD(1),REMOVE(2),FIND(3), UPDATE(4), READ_ALL(5),STOP(6)
}