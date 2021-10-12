fun main() {
    println(" Enter first number :")
    val num1 = readLine()!!.toInt()
    println("Please Enter second number :")
    val num2 = readLine()!!.toInt()
    println("Please enter operation (+,-,*,/) : ")
    val op = readLine()!!

    if (op == "+") {
        println((num1+num2))
    }
    else if (op == "-") {
        println((num1-num2))
    }
    else if (op == "*") {
        println((num1*num2))
    }    else if (op == "/") {
        println((num1/num2))
    }
    }


