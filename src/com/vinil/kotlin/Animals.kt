package com.vinil.kotlin

abstract class Animal {
    abstract val image :String
    abstract val food :String
    abstract val habitat :String
    var hunger = 10

    open fun makeNoise(){
        println("The Annimal is making noice")
    }

    open fun roam(){
        println("The Animal is roaming")
    }

    open fun eat(){
        println("The Animal is eating")
    }

    fun sleep(){
        println("The Animal is sleeping")
    }
}

class Hippo:Animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"
    override fun makeNoise(){
        println("Grunt!!!")
    }
    override fun eat(){
        println("Hippo is eating $food")
    }
}

abstract class Canine:Animal(){
    override fun roam(){
        println("The Canine is roaming")
    }
}

class Wolf:Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forest"
    override fun makeNoise(){
        println("Hoooowl!!!")
    }
    override fun eat(){
        println("Wolf is eating $food")
    }
}

class Vet {
    fun giveShot(animal: Animal){
        animal.makeNoise()
    }
}

fun main(args:Array<String>){
    val animals = arrayOf(Hippo(),Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }
    val vet = Vet()
    vet.giveShot(Hippo())
    vet.giveShot(Wolf())
}
