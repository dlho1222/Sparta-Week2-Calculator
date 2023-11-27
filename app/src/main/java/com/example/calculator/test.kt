package com.example.calculator

fun main() {
    class Calculator {
        var num1 = readln().toInt()
        var operator: String = readln()
        var num2 = readln().toInt()

        fun operation() {
            val result = when (operator) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> num1 / num2
                "%" -> num1 % num2
                else -> println("잘못된 연산자 입니다.")
            }
            println("계산결과 $result ")
        }


    }
    Calculator().operation()


}
