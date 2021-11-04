fun main(args: Array<String>) {

    val hosney = Estudante("Hosney", "Oliveira",
        123, 40.0, 2)

    val roberto = Estudante("Hosney", "Oliveira",
        456, 70.0, 6)

    val chris = Estudante("Hosney", "Oliveira",
        789, 90.0, 3)

    val ronaldo = Estudante("Hosney", "Oliveira",
        321, 50.0, 8)

    val vanessa = Estudante("Hosney", "Oliveira",
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


}