package model

fun main() {

    //Método recursivo -> é um método que chama ele mesmo, porém, tem que haver algo para parar o loop, se não, entra em loop infinito
    //A sequência de Fibonacci tem como primeiros termos 0 e 1 e, a seguir, cada termo subsequente é obtido pela soma dos dois termos precedores
    // 0, 1, 1, 2, 3, 5, 8,13, 21, 34...
    //0 + 1 = 1
    //1 + 1 = 2
    //1 + somatorio(2) = 3

    //Recebe o índece da sequência como parâmetro
    fun fibonacci(numero: Int): Int {
        //Pela formula (1 -1) + (1-2) = 1; (2-1) + (2+2) = 1. Por conta disso a condição é menor ou igual a 2.
        if (numero <= 2) {
            return 1
        }
        //Primeiro termo mais o segundo termo.Fórmula = (n - 1) + (n - 2)
        return fibonacci(numero - 1) + fibonacci(numero - 2)
    }
    //Printa o resultado da conta de Fibonacci
    print(fibonacci(9))
}


