package com.vinil.kotlin

fun main(args :Array<String>) {
    println("Hello World")
    var x = 3
    val name = "Vinil"
    x = x*10
    print("x is $x")
    while(x>20){
        x=x-1
        print("x is now $x")

    }
    var smallNum :Byte
    var z: Short = 6
    //var x: Int = 3.12
    var k: Long = z.toLong()
    
    println()
    println(if(x>y) "x is greater than y" else "x is less than y ")
    println("-------------")

    var myArray = arrayOf(1,2,3)
    myArray.forEach { a -> println(a) }
}
