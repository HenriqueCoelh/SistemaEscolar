package aluno

//Encapsulamento de dados
class Estudante (var nome: String?,
                 private var sobrenome: String?,
                 private var ra: Int) {

    var nota = 0.0
    private var ano = 0

    constructor(nome: String?, sobrenome: String?,
                ra: Int, nota: Double): this(nome, sobrenome, ra){
                    this.nota = nota
                }

    constructor(nome: String?, sobrenome: String?,
                ra: Int, nota: Double, ano: Int): this(nome, sobrenome, ra, nota){
                    this.ano = ano
                }


    fun nomeCompleto() {
        println("$nome $sobrenome")
    }

    val aprovado: Boolean
        get() {
            return nota >= 60
        }

    fun mudarAnoSeAprovado(){

        if(aprovado) {
            ano += 1
            println("Parabéns, você foi aprovado!")
        }else{
            println("Você foi reprovado! Não passará de ano.")
        }
    }


}