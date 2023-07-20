package empresa



object Empresa {
    fun qualFuncao(func: Funcionario): Double = when (func) {
        is Atendente -> func.receber(1750)
        is Ajudante -> func.receber(1330)
        else -> {0.0}
    }
}



