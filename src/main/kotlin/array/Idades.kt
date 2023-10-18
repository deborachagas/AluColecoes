package array

fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 67)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val mediaIdade = idades.average()
    println("Média idade: $mediaIdade")

    val todosMaiores = idades.all{ it > 18 }
    println("Todos maiores idade? $todosMaiores")

    val existeMaior = idades.any{ it > 18 }
    println("Algum maior de idade? $existeMaior")

    val maiores = idades.filter { it > 18 }
    println("Maiores: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca: $busca")
}