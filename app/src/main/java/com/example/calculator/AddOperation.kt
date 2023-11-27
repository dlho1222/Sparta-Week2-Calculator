package com.example.calculator

import android.icu.util.UniversalTimeScale.toBigDecimal
import java.math.BigDecimal

class AddOperation:AbstractOperation(){
    override fun operate(num1: BigDecimal, num2: BigDecimal): BigDecimal {
        val operationResult = num1 + num2
        println("더하기결과 : $operationResult")
        return operationResult
    }
}