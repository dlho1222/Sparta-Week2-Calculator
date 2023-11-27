package com.example.calculator

import java.math.BigDecimal

abstract class AbstractOperation {
    abstract fun operate(num1 : BigDecimal, num2 : BigDecimal) : BigDecimal

}