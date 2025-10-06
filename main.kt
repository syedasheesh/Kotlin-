// this is Variables chapter-1 

fun main() {
    val syed = "patel"
    val abu = 45
    val asheesh = true
    print("$syed $abu $asheesh")
}
/*
  Kotlin Number Types Quick Reference with Definitions
*/

fun main() {
    // --------- BYTE ---------
    // Byte is an 8-bit signed integer
    // Size: 8 bits (1 byte)
    // Range: -128 to 127
    // Used when memory is a concern or small integer values are needed
    val myByte: Byte = 100
    println("Byte value: $myByte")
    println("Byte max: ${Byte.MAX_VALUE}")   // 127
    println("Byte min: ${Byte.MIN_VALUE}")   // -128
    println("")

    // --------- SHORT ---------
    // Short is a 16-bit signed integer
    // Size: 16 bits (2 bytes)
    // Range: -32,768 to 32,767
    // Used for medium-range integer values, more than Byte but less than Int
    val myShort: Short = 1000
    println("Short value: $myShort")
    println("Short max: ${Short.MAX_VALUE}") // 32767
    println("Short min: ${Short.MIN_VALUE}") // -32768
    println("")

    // --------- INT ---------
    // Int is a 32-bit signed integer
    // Size: 32 bits (4 bytes)
    // Range: -2,147,483,648 to 2,147,483,647
    // Most commonly used integer type in Kotlin
    val myInt: Int = 22
    println("Int value: $myInt")
    println("Int max: ${Int.MAX_VALUE}")     // 2147483647
    println("Int min: ${Int.MIN_VALUE}")     // -2147483648
    println("")

    // --------- LONG ---------
    // Long is a 64-bit signed integer
    // Size: 64 bits (8 bytes)
    // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    // Used for very large integer values beyond Int
    val myLong: Long = 123456789L
    println("Long value: $myLong")
    println("Long max: ${Long.MAX_VALUE}")   // 9223372036854775807
    println("Long min: ${Long.MIN_VALUE}")   // -922337372036854775808
    println("")

    // --------- FLOAT ---------
    // Float is a 32-bit floating-point number
    // Size: 32 bits (4 bytes)
    // Range: approximately ±3.4E38, min positive 1.4E-45
    // Used when fractional numbers are needed and memory is limited
    // Note: Float literals require 'F' suffix
    val myFloat: Float = 3.14F
    println("Float value: $myFloat")
    println("Float max: ${Float.MAX_VALUE}")
    println("Float min: ${Float.MIN_VALUE}")
    println("")

    // --------- DOUBLE ---------
    // Double is a 64-bit floating-point number
    // Size: 64 bits (8 bytes)
    // Range: approximately ±1.7E308, min positive 4.9E-324
    // Used for high-precision fractional numbers
    val myDouble: Double = 3.14159265359
    println("Double value: $myDouble")
    println("Double max: ${Double.MAX_VALUE}")
    println("Double min: ${Double.MIN_VALUE}")
    println("")

    // --------- Binary representation example ---------
    // Shows how an Int value looks in binary (32 bits)
    val binary22 = Integer.toBinaryString(22).padStart(32, '0')
    println("Number 22 in 32-bit binary: $binary22")

    /*Rule of thumb:

     Float → less precise, uses less memory

     Double → more precise, uses more memory*/
    val f: Float = 3.14159265359F
    println(f)  // Output: 3.1415927 → loses some digits

    val d: Double = 3.14159265359
    println(d)  // Output: 3.14159265359 → keeps more digits

}



