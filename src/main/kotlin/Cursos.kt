class Cursos {

    var nomeDoCurso = ""
    var nomeDoProfessor = ""
    var ano = 0
    var lista = mutableListOf<String>()

    fun matricular (nome: String ){
        println("Digite seu nome: ")
        var nome = readLine()!!

        while (true){
            println("Para ver as opções, digite 'sim'. " +
                    "E para sair ecerrar o acesso, digite 'nao': ")
            val simNao = readLine()!!

            if (simNao != "sim"){
                break
            }
        }
    }
}