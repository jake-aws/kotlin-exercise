class Item(var name:String, var num:Int) {
    private val brand:String = name
    private var stock:Int = num

    fun addStock(quantity:Int){
        stock += quantity
    }
}