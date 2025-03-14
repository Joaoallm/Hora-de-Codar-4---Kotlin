fun main(){
        //3
        //Vamos criar uma lista de compras.
        //Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
        //Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
        //Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
        //Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".
        //Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".

        val frutas = mutableListOf("maça", "pera", "uva")
        println("A sua lista de frutas é: $frutas")

        while (true) { // --> Esta funçao cria um loop que se encerra quando a lista ficar vazia

            if (frutas.isEmpty()) {
                println("Mercado encerrado")
                break
            }
            println("Informe uma fruta: ")


            val frutasUsu = readln()

            // Pedir ao usuário para remover uma fruta
            if (frutas.contains(frutasUsu)) {
                println("A Fruta $frutasUsu foi retirada da lista:")
                frutas.remove(frutasUsu)
                println(frutas)
            } else {
                println("A fruta $frutasUsu não esta disponivel no nosso mercado.")
            }
        }
    }
