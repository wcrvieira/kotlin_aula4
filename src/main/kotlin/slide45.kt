fun main() {
    // Laço for para preencher com range de valores
    for (m in 'a'..'z')
        // Laço externo que preenche de a até z
        for(n in 1..23 )
            // Laço interno de varia de 1 até 23
        println("$m$n")
}