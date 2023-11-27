package com.example.calculator

fun main() {
    class Calculator {
        var num1 = readln().toInt()
        var operator : String = readln()
        var num2 = readln().toInt()
        fun operation() {
            var result = when(operator){
                "+"->   num1 + num2
                "-"->   num1 - num2
                "*"->   num1 * num2
                "/"->   num1 / num2
                else-> num1 % num2
            }
            println("계산결과 $result ")
        }
    }
    Calculator().operation()
}
