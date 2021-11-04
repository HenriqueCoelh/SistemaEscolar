class Cursos(nomeDoCurso: String?,
             nomeDoProfessor: String?,
             ano: Int) {

    // '?' considera os valores nulos
    val listaEstudante = mutableListOf<Estudante?>()

    fun matricular(estudante: Estudante?){
        listaEstudante.add(estudante)
        println("Estudante matriculado com sucesso!")
    }
    fun matricular(estudantes: Array<Estudante?>?){
        if (estudantes != null){
            for(i in estudantes){
                listaEstudante.add(i)
            }
        }
        println("Estudantes matriculados com sucesso!")
    }

    fun desmatricular(estudante: Estudante){
        if(listaEstudante.contains(estudante)){
            listaEstudante.remove(estudante)
            println("Estudante desmatriculado com sucesso!")
        }else{
            println("Esse estudante não existe na lista.")
        }

    }

    fun contarEstudantes(): Int {
        println("O número de estudantes cadastrados no curso é " +
                "${listaEstudante.size}")
        return 0
    }

    fun melhorNota(){
        var melhorNota = listaEstudante[0]?.nota
        for(i in listaEstudante){
            if(i?.nota!! > melhorNota!!){
                melhorNota = i.nota
            }
        }
        println("A maior nota desse curso é: $melhorNota")
    }

}