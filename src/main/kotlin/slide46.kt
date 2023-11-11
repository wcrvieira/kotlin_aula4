fun main() {
    semaforo(cor="Amarelo")
    semaforo(cor="Verde")
    semaforo(cor="Vermelho")
}

// Criando função que recebe parâmetro String
    fun semaforo(cor: String) {
        if (cor == "Verde")
            println("Pode proseeguir. Dirija com atenção!")
        else if (cor == "Amarelo")
            println("Muita atenção. Acione os freios!")
        else
            println("Pare e aguarde com paciência!")
    }
