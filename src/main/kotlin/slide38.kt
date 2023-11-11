fun main() {
    val temp = 32.toFloat()

    // Utilizando a estrutura when
    var resultado = when (temp) {
        in 20f..25f -> "Tempo bom e tranquilo"
        in 26f..32f -> "Começando a esquentar"
        in 33f..36f -> "Muito quente"
        else -> "Derretendo tudo"
    }
    println(resultado)
}