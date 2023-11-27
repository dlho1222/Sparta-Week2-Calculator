package com.example.calculator

import java.math.BigDecimal

class MultiplyOperation(private val num1 : BigDecimal, private val num2 : BigDecimal) {
    private var operationResult = num1 * num2
    fun operationReturn(): BigDecimal {
        println("결과 : $operationResult")
        return operationResult
    }
}