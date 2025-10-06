fun main() {
    var x = 5
    val y = 3
    
    // operators in kotlin - here we are doing operations 
    /**/
    println("3 + 5 = ${x + y}")
    println("3 - 5 = ${x - y}")
    println("3 * 5 = ${x * y}")
    println("3 / 5 = ${x / y}")
    println("3 % 5 = ${x % y}")

    var result = x + y
    result = result + 2
    println("result = $result")

    result = result - 2
    println("result = $result")

    result = result * 2
    println("result = $result")

    result = result / 2
    println("result = $result")

    result = result % 2
    println("result = $result")

    println("3 + 3 * 4 = ${(3 + 3) * 4}")

    // increment and decrement variable
    x = 2
    println("x = ${x++}") // post-increment
    println("x = ${++x}") // pre-decrement
    
    println("x = ${x--}") // post-increment
    println("x = ${--x}") // pre-decrement
}


// if conditions 

fun main(){
    val myNumber = 200
    if(myNumber >= 150) {
        println("Greater than 150")
    }else if (myNumber >= 90){
        println("Greater than 90")
    }else {
        println("All the conditions failed")
    }
}
