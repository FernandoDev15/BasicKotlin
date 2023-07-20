package empresa

import empresa.Funcionario

class Ajudante : Funcionario {
    override fun receber(salario: Int): Double {
        val bonus = salario * 0.10
        return   salario + bonus
    }

}