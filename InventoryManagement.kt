import java.util.LinkedList

class InventoryManagement {
    private var inventory = LinkedList<Item>()

    fun success(result: Boolean) = if( result ){
        println("Operation was successful.") }else{println("Operation failed.")}

    private fun findItem(name:String): Boolean {
        for (item in inventory){
            if (item.name == name) {
                return true
            }
        }
        return false
    }
    fun findItem(name: String?):Unit{
        for (item in inventory){
            if (item.name == name) {
                println("${item.name} : ${item.num}")
                return
            }
        }
        println("$name not found.")

    }
    fun addItems(items:Array<Item>){
        items.forEach { inventory.add(it) }
    }
    fun addItem(){
        print("Input item name: ")
        val name = readln()
        print("Input item stock: ")
        val num = readln()
        val newItem = Item(name,num.toInt())
        if (!findItem(name)) {
            inventory.add(newItem)
            println("Item added to inventory!")
        }else{
            println("Item already exists!")
        }
    }
    fun getAllItems(){
        for (item in inventory){
            println("${item.name} : ${item.num}")
        }
    }
    fun removeItem(name: String) {
        if (findItem(name)){
            inventory.removeIf { it.name == name }
            println("Item removed to inventory!")
        }else{
            println("Operation failed!")
        }

    }

}