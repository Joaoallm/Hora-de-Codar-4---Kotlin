fun main() {
    val planetas = arrayOf("Terra", "Venus", "Plutão", "Marte", "júpiter", "Saturno")
                    // arrayof, usada para criação de listas pré definidas
    println("Digite o nome de um planeta ")

    val planeta2 = readln()


    if (planetas.contains(planeta2)) { // -> essa função serve para vericar se o elemento da lista está na coleção
        println("$planeta2 está na lista de planetas")
    } else {
        println("$planeta2 não está na lista de planetas")

    }
}