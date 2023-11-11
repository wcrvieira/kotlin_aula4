fun main() {
    val frase = "Batatinha quando nasce..."

    println(frase)

    // Substitui o texto "..." por novo conteúdo
    val newFrase = frase.replace("...", newValue = ", esparrama pelo chão")

    println(newFrase)
}