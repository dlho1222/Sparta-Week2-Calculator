package com.example.calculator

import java.math.BigDecimal

fun main() {
    class Calculator {
        var num1 = readln().toBigDecimal()
        var operator: String = readln()
        var num2 = readln().toBigDecimal()
        var result = 0.0.toBigDecimal()
        fun operation(): BigDecimal {
            when (operator) {
                "+" -> result = AddOperation(num1, num2).operationReturn()
                "-" -> result = SubstractOperation(num1, num2).operationReturn()
                "*" -> result = MultiplyOperation(num1, num2).operationReturn()
                "/" -> result = DivideOperation(num1, num2).operationReturn()
                else -> println("잘못된 연산 입니다.")
            }

            println("추가 계산 하려면 연산자를 입력해 주세요")

            val addOperation = readln()
            val num3 = readln()!!.toBigDecimal()
            when (addOperation) {
                "+" -> result = AddOperation(result, num3).operationReturn()
                "-" -> result = SubstractOperation(result, num3).operationReturn()
                "*" -> result = MultiplyOperation(result, num3).operationReturn()
                "/" -> result = DivideOperation(result, num3).operationReturn()
                else -> print("잘못된 연산 입니다.")
            }
            print("추가 계산결과 : $result")
            return result
        }
    }
    Calculator().operation()
}