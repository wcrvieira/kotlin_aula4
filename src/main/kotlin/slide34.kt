fun main() {
    var x = 2 * 2

    println(x)

    // Concatenção
    println("result: "+x)

    // Interpolação
    println("result: $x")
    println("result: ${x}")

    // Interpolação com pós e pré incremento
    println("result: ${x++}")
    println("result: ${++x}")

    // Interpolação com pós e pré decremento
    println("result: ${--x}")
    println("result: ${x--}")
}