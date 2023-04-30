enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel = Nivel.BASICO)

data class Formacao(val nome: String, val conteudos: MutableList<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("O Aluno ${usuario.nome} foi matriculado na formação $nome.")
    }
}

fun main() {
    val usuario1 = Usuario("Herberton ")
    val usuario2 = Usuario("Lauro")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Kotlin Avançado", 120, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Desenvolvimento Kotlin DIO", 180, Nivel.DIFICIL)

    val formacao = Formacao("Desenvolvimento Kotlin DIO", mutableListOf(conteudo1, conteudo2, conteudo3))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}
