fun main() {
   // Declarando uma lista de String
    var tarefas = ArrayList<String>()

    // Adicionado elementos na lista
    tarefas.add("Pescar no Pantanal")
    tarefas.add("Conhecer o Nordeste")
    tarefas.add("Correr uma maratona")
    tarefas.add("Escalar o Kilimanjaro")

    // Laço para percorrer a lista e imprimir os elementos
    for (i in tarefas)
        println("Lista de desejos: $i")

    println("")
    println("######################################")
    println("Lista de tarefas ordenada")
    tarefas.sort() // Ordenando a lista de tarefas
    // Laço para percorrer a lista e imprimir os elementos
    for (o in tarefas)
        println("Lista de desejos: $o")
}