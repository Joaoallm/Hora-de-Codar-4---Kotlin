fun main() {
    // 1
    //Crie um programa onde o usuário possa cadastrar estudantes sem limites,
    // e, em seguida, Se o usuário digitar "PARE"
    // o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.

    val lista = mutableListOf<String>()

    while (true) {
        println("Informe os nomes para o cadastro: ")
        val nomes = readln()
        if (nomes == "pare") {
            break
        }
    else {
        lista.add(nomes)
        }
    }
    println("Você digitou as seguintes frutas: $lista, no totao são ${lista.size} nomes cadastrados")
}