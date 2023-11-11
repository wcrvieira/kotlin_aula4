fun main() {
    val nota1 = 5
    val nota2 = 3
    val media = (nota1 + nota2)/2
    var resultado : String

    /*
    Uso de estrutura de decisão com o apoio de
    operaodr ternário com Kotlin
     */
    if (media >= 6) resultado = "Aprovado"
        else if (media >= 4) resultado = "Em recuperação"
            else resultado = "Reprovado"

    println(resultado)
}