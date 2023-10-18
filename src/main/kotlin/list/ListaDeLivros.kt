package list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro5 = Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacao = 1938,
        editora = "Editora A"
    )

    val livro6 = Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacao = 1979,
        editora = "Editora B"
    )

    val livro7 = Livro(
        titulo = "O Cortiço",
        autor = "Aluísio Azevedo",
        anoPublicacao = 1890,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4, livro5, livro6, livro7)
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )
    println(livros.imprimeComMarcadores())
    livros.remove(livro1)
    println(livros.imprimeComMarcadores())

    val ordenadoAnoPublicacao = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()


    var titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
//        .imprimeComMarcadores()
        .map { it.titulo }
    println(titulos)
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ### Lista de Livros ### \n$textoFormatado")
}