package exemplo02

class EnderecoCompleto(
    val cidade: String,
    val estado: String,
    val cep: Int,
    val rua: String,
    val numero: Int
) {
    override fun equals(other: Any?): Boolean {
        return if (other == null || other !is Endereco) {
            false
        } else {
            other.cidade == this.cidade &&
            other.estado == this.estado &&
            other.cep == this.cep &&
            other.rua == this.rua &&
            other.numero == this.numero
        }
    }
}

