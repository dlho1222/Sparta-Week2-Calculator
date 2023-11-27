package com.example.calculator

class DivideOperation(private val num1 : Double, private val num2 : Double) {
    private var operationResult = num1 / num2
    fun operationReturn(): Double {
        println("결과 : $operationResult")
        return operationResult
    }
}