package com.vinil.kotlin

class Dog (val name: String,
            weight_param: Int,
            breed_param: String){
init {
    print("Dog $name has been created.")
}
    var activities = arrayOf("Walks")
    val breed = breed_param.uppercase()
    var weight = weight_param
    set(value) {
        if(value>0) field = value
    }
    val weightInKgs: Double
    get() = weight/2.2
    fun bark(){
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}
fun main(args : Array<String>){
    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")

    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities)
        println("My Dog enjoys $item")
}
