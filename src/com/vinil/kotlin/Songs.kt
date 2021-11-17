package com.vinil.kotlin

class Song(val title : String,val artist :String){
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun pause() {
        println("Stopped playing $title")
    }
}

fun main(args : Array<String>){
    val palPal = Song("Pal Pal Dil ke Paas","Kishore Kumar")
    val mukkala = Song("Mukkala Mukkabla","AR Rahman")
    palPal.play()
    mukkala.play()
    palPal.pause()
}
