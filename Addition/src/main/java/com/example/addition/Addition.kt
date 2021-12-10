package com.example.addition

import android.util.Log

class Addition : OnClickAddition {

    fun input(a: Int, b: Int) : Int {
        return a + b
    }

    override fun threeNumAddition(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    override fun twoNumAddition(a: Int, b: Int): Int {
        return a + b
    }

    override fun twoNumberDivision(a: Int, b: Int): Int {
        return a/b
    }

    override fun twoNumberMultiplication(a: Int, b: Int): Int {
        return a * b
    }

}