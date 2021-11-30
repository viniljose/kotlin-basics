# kotlin-basics
This repo is to learn basics of Kotlin

Use `fun` to define a function.  
Use `var` to define a variable whose value may change.  
Use `val` to define a value whose value will stay the same.  
You create an array using the `arrayOf()` function.   
A variable holds a reference to an object.  
Kotlin has a number of basic types: `Byte, Short, Int, Long, Float, Double, Boolean, Char and String`  

 *In Java, numbers are primitives, so a variable holds the actual number. Is that not the case with Kotlin?*   
`No, it’s not. In Kotlin, numbers are objects, and the variable holds a reference to the object, not the object itself.`  

# Class  
Initializer blocks are executed when the object is initialized, immediately after the constructor is called, and they’re prefixed with the `init` keyword.
you must initialize properties before you try to use them  

*In Java, you don’t have to initialize the variables that you declare inside a class. Is there a way of not initializing class properties in Kotlin?*
`lateinit` tells the compiler that you’re aware that the property hasn’t been initialized yet.  

Before you can use a class as a superclass, you must declare it `open`. You must also declare any properties and functions you want to override as open.  
Use `:` to specify a subclass’s superclass.  
Override properties and functions in the subclass by prefixing them with `override`.  
Overridden functions and properties stay open until they’re declared `final`.  
Class `Any` is the mother of all classes:

