data class Estudante (val primeiroNome: String, var ultimoNome: String){

    var registro = ""
    var ano = 0
    var nota = 0.0

    constructor(primeiroNome: String, ultimoNome: String, ano: Int):
            this(primeiroNome, ultimoNome){
                this.ano = ano
    }

    constructor(primeiroNome: String, ultimoNome: String, ano: Int, registro: String):
            this(primeiroNome, ultimoNome, ano){
                this.registro = registro
    }


    fun printNomeCompleto() {
        println("$primeiroNome + $ultimoNome")
    }

    fun checarNota(){
            val Aprovado: Unit
            if (nota >= 60) {
                println("Parabéns, você passou de ano!")
                ano += 1
            }else if (nota < 60){
                println("Você reprovou de ano!")
                ano -= 1
            }
    }


    fun passarDeAno(): Int {
            //TODO implement: the student should advance to the next year if he/she grade is >= 60
            //TODO implement: o aluno deve avançar para o próximo ano se a nota for >= 60
            // Make year = year + 1, and print "Congragulations" if the student has been approved
            // Faça ano = ano + 1, e imprima "Parabéns" se o aluno foi aprovado
            return 0
        }



}