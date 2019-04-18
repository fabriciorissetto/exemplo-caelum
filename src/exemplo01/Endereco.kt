package exemplo01.kt

class Endereco {
    private var rua: String
    private var numero: Int

    constructor(rua :String, numero :Int) {
        this.rua = rua
        this.numero = numero
    }

    fun getRua(): String {
        return rua
    }

    fun getNumero(): Int {
        return numero
    }
}
