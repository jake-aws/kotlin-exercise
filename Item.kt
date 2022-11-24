class Item(var name:String, var num:Int) {
    fun addStock(quantity:Int){
        num += quantity
    }
}