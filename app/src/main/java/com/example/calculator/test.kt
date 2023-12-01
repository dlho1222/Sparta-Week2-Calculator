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
                    "+" -> result = AddOperation().operate(num1, num2)
                    "-" -> result = SubstractOperation().operate(num1, num2)
                    "*" -> result = MultiplyOperation().operate(num1, num2)
                    "/" -> result = DivideOperation().operate(num1, num2)
                    else -> println("잘못된 연산 입니다.")
                }

                println("추가 계산 하려면 연산자를 입력해 주세요")
                while(true) {  // 계산 누적
                    val addOperation = readln()
                    val num3 = readln()!!.toBigDecimal()
                    when (addOperation) {
                        "+" -> result = AddOperation().operate(result, num3)
                        "-" -> result = SubstractOperation().operate(result, num3)
                        "*" -> result = MultiplyOperation().operate(result, num3)
                        "/" -> result = DivideOperation().operate(result, num3)
                        else -> print("잘못된 연산 입니다.")
                    }
                }
                print("추가 계산결과 : $result")

                return result
            }

    }
    println("숫자를 입력해주세요")
    Calculator().operation()

}