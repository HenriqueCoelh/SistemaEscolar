import aluno.Estudante
import ensino.Cursos

fun main(args: Array<String>) {

/*
1 - Pegar o projeto do exercício da aula passada
2 - Separar as classes Student e Courses em pacotes diferentes
3 - Usar o encapsulamento para esconder os dados da classe Student e Courses (assim como a lista de estudantes)

4 - Na classe Courses, criar um método para verificar se um objeto Student existe na lista de estudantes.
Caso o estudante não exista, retorne uma exception

 fun verificarAluno(student: Student){
        //TODO implementar o código
    }

Dica: Use o throw Exception() se o aluno não existir na lista

5 - No Main, chame a função verificarAluno, usando um try catch para não permitir
que o programa retorne um erro e feche.
 */

    val hosney = Estudante("Hosney", "Oliveira",
        123, 40.0, 2)

    val roberto = Estudante("Roberto", "Camargo",
        456, 70.0, 6)

    val chris = Estudante("Chris", "Fagundes",
        789, 90.0, 3)

    val ronaldo = Estudante("Ronaldo", "da Costa",
        321, 50.0, 8)

    val vanessa = Estudante("Vanessa", "Almeida",
        654, 95.0, 7)








    val cursoIngles = Cursos ("Inglês", "Henrique", 7)

    cursoIngles.matricular(hosney)
    cursoIngles.matricular(chris)

    cursoIngles.contarEstudantes()

    cursoIngles.desmatricular(roberto)

    val estudantes: Array<Estudante?> = arrayOf(vanessa, roberto)
    cursoIngles.matricular(estudantes)
    cursoIngles.contarEstudantes()

    cursoIngles.melhorNota()

    try {
        //Nós queremos tentar executar uma função
        //Pois caso essa nossa função de erro, nós queremos manipular esse erro
        //Sem a necessidade do nosso programa fechar (crashar)
        cursoIngles.verificarAluno(vanessa)
    }catch (e: Exception){
        //Nós recuperamos a excessão, e exibimos a mensagem dela
        println(e.message)
    }

}