fun main() {

    println("Cartela de vacinação obrigatória\n")
    print("Olá! O seu pet é um gato ou um cachorro?\nR: ")
    val animalEscolhido = readLine()!!.lowercase()

    println("Ok! O seu pet é $animalEscolhido")
    print("Por favor, digite o nome do seu pet:\nR: ")
    val nome = readLine()!!

    /*
    print("Digite a idade: ")
    var idade = readLine()!!.toInt()
     */

    print(
        "Digite o peso:\n" +

                "R: "
    )
    val peso = readLine()!!

    print(
        "Qual o sexo do animal?\n" +

                "R: "
    )
    val sexo = readLine()!!

    print(
        "Digite a raça: ")
    val raca = readLine()!!

    if (animalEscolhido == "gato") {
        val cat = Gato(nome, 0, peso, sexo, raca)

        cat.age()

        cat.obrig()


    } else if (animalEscolhido == "cachorro" || animalEscolhido == "cão") {
        val dog = Cachorro(nome, 0, peso, sexo, raca)

        dog.age()

        dog.obrig()
    }


}