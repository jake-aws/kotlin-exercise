
fun occurence(){
    println("Input word or phrases")
    var string:String = readln()

    string = string.lowercase().filterNot { it.isWhitespace() }
    val char: ArrayList<Char> = ArrayList<Char>()
    val occurrence:ArrayList<Int> = ArrayList<Int>()

    string.forEach { if(!char.contains(it)) {
        char.add(it)
        occurrence.add(1)
        occurrence[char.indexOf(it)] +=1

    }else{
        occurrence[char.indexOf(it)] +=1
    }}
    for ((index:Int ,value:Char )in char.withIndex() ){
        println("${value.uppercase()} has ${occurrence[index]} occurences")
    }
//    var set = string.toSet().toList().sorted()
//    print(set)

}