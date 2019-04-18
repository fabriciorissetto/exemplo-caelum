package exemplo02

data class Endereco(
    val cidade: String,
    val estado: String,
    val cep: Int,
    val rua: String,
    val numero: Int
)

fun main() {
    val endereco1 = Endereco("São Paulo", "SP", 123, "Rua Santos", 100)
    val endereco2 = Endereco("São Paulo", "SP", 123, "Rua Santos", 100)

    println(endereco1 == endereco2)
}