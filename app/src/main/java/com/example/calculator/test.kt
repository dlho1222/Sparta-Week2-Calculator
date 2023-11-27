package com.example.calculator

fun main() {
    class Calculator {
        var num1 = readln().toInt()
        var operator: String = readln()
        var num2 = readln().toInt()
        var result = 0
        fun operation(): Int {
            when (operator) {
                "+" -> result = AddOperation(num1, num2).operationReturn()
                "-" -> SubstractOperation(num1, num2)
                "*" -> MultiplyOperation(num1, num2)
                "/" -> DivideOperation(num1, num2)
                else -> print("잘못된 연산 입니다.")
            }

            println("추가 계산 하려면 연산자를 입력해 주세요")

            val addOperation = readln()
            val num3 = readln()!!.toInt()
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