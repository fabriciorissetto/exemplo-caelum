package exemplo03

class Pessoa(val nome: String?) {
    fun quantidadeDeLetras() {
        if (nome == null)
            return

        println("Meu nome tem ${nome.length} letras!")
        outraFuncao(nome)
    }

    fun outraFuncao(nome: String) {
        //...
    }
}


fun main() {
    val pessoa = Pessoa(null)
    pessoa.quantidadeDeLetras()
}

//class Pessoa(val nome: String?) {
//    fun quantidadeDeLetras() {
//        if (nome == null)
//            return
//
//        println("Meu nome tem ${nome.length} letras!")
//        outraFuncao(nome)
//    }
//
//    fun outraFuncao(nome: String) {
//        //...
//    }
//}
//
//fun main() {
//    val pessoa = Pessoa(null)
//    pessoa.quantidadeDeLetras()
//}