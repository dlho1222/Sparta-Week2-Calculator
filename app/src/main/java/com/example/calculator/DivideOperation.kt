package com.example.calculator

import java.math.BigDecimal

class DivideOperation:AbstractOperation() {


    override fun operate(num1: BigDecimal, num2: BigDecimal): BigDecimal {
        val operationResult = num1 / num2
        println("나누기 결과 : $operationResult")
        return operationResult
    }
}