package model

fun main() {

    fun fibonacci(numero: Int): Int {

        if (numero <= 2) {
            return 1
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2)
    }

    //Aprensentando todos os valores de Fibonacci
    for (i in 0..20) {
        println("$i : ${fibonacci(i)}" )
    }
}