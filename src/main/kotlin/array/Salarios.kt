package array

fun main() {
//   val idades = IntArray(5)
//    idades[0] = 25
//    idades[1] = 19
//    idades[2] = 33
//    idades[3] = 20
//    idades[4] = 55
//    var maiorIdade = 0
//    for(idade in idades) {
//        if(idade > maiorIdade){
//         maiorIdade = idade
//        }
//    }
//    println(maiorIdade)

//    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55)
//    var menorIdade = Int.MAX_VALUE
//    idades.forEach { idade ->
//        if(idade < menorIdade) {
//            menorIdade = idade
//        }
//    }
//    println(menorIdade)

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1
//    var indice = 0
//    for(salario in salarios) {
//        salarios[indice] = salario * aumento
//        indice++
//    }
//    println(salarios.contentToString())
//    for(indice in salarios.indices){
//        salarios[indice] = salarios[indice] * aumento
//    }
//    println(salarios.contentToString())
    salarios.forEachIndexed{i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}