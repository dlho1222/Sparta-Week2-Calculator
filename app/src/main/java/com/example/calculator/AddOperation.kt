package com.example.calculator

class AddOperation(private val num1: Int, private val num2: Int) {
    private var operationResult = num1 + num2

    fun operationReturn(): Int {
        println("결과 : $operationResult")
        return operationResult
    }
}