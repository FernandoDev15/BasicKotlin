package empresa



class Atendente : Funcionario {

    override fun receber(salario: Int): Double {
        val bonus = salario * 0.15
        return salario + bonus
    }

}