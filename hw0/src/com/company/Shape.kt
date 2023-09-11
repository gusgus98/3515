package com.company

abstract class Shape(_name: String) : Dimensionable {
    var name = _name
    fun getArea(): Double {
        return 0.0;
    }

    // Additional instructions
    constructor(name: String, length: Double, height: Double) : this(name) {
        this.length = length
        this.height = height
    }

    fun setDimensions(length: Double, height: Double) {
        this.length = length
        this.height = height
    }

    // Other methods
}

interface Dimensionable {
    fun printDimensions()
}

abstract class Square (_name: String, val Length:Double, val Height: Double) : Shape(_name){

}

abstract class Circle (_name: String, val radius:Double) : Shape(_name){

}

abstract class Triangle (_name: String,val side1:Double,val side2:Double,val side3:Double) : Shape(_name){

}

abstract class EquilateralTriangle (_name: String,val side:Double) : Triangle(_name){

}
