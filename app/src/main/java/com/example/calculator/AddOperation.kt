package com.example.calculator

import android.icu.util.UniversalTimeScale.toBigDecimal
import java.math.BigDecimal

class AddOperation(private val num1: BigDecimal, private val num2: BigDecimal) {
    private var operationResult = num1 + num2

    fun operationReturn(): BigDecimal {
        println("더하기결과 : $operationResult")
        return operationResult
    }
}