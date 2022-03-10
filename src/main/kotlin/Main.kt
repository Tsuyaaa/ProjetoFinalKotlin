fun main() {
    println("Cartela de vacinação obrigatória: ")
    print("Você possui gato ou cachorro?\nR.: ")
    val animalEscolhido = readLine()!!.lowercase()

    println("O seu animal é $animalEscolhido")
    print("\nDigite o nome: ")
    val nome = readLine()!!

    /*
    print("Digite a idade: ")
    var idade = readLine()!!.toInt()

     */

    print("Digite o peso: ")
    val peso = readLine()!!

    print("Digite o sexo: ")
    val sexo = readLine()!!

    print("Digite a raça: ")
    val raca = readLine()!!

    if(animalEscolhido == "gato"){
        val cat = Gato(nome, 0, peso, sexo, raca)
        cat.age()
        cat.obrig()

    }else if(animalEscolhido == "cachorro" || animalEscolhido == "cão"){
        val dog = Cachorro(nome, 0, peso, sexo, raca)
        dog.age()
        dog.obrig()
    }





}