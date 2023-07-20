package tipoNull

import java.util.Scanner

fun main() {

    var rebeceNull: String? = null

    // tratar o valor caso nulo não tras nada
    if (rebeceNull != null) rebeceNull.length

    var numero: Int? = 10

    // Posso usar um valor padrão se caso for null
    if (numero != null) numero + 3 else 0

    //
    val inNome: String? = null

    // elvis é um padão kotlin que substituir o if/else para null
    val outName = inNome ?: "Erro"

    println(outName)
}
