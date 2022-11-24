
fun checkPalindrome() {
    println("Input word or phrases")
    val originalString:String = readln()
    val trimmedOriginalString = originalString.filterNot { it.isWhitespace() }
    val reverseString = trimmedOriginalString.reversed()
    if (trimmedOriginalString.equals(reverseString,ignoreCase = true)){
        print("$originalString and $reverseString are equal")
    }else{
        println("$originalString is not a palindrome")
    }
}