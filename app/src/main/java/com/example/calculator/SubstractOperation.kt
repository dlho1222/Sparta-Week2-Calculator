package com.example.calculator

import java.math.BigDecimal

class SubstractOperation:AbstractOperation() {



    override fun operate(num1: BigDecimal, num2: BigDecimal): BigDecimal {
        val operationResult = num1 - num2
        println("빼기 결과 : $operationResult")
        return operationResult
    }
}