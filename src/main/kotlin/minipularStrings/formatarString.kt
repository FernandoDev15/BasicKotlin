package minipularStrings


//______________________________________________________________________________________________________________________
fun main() {
    //    \n = quebra a linha
    val phase = "Bom dia \n Como você está?"

//______________________________________________________________________________________________________________________



    // aspas triplas tras a String na maneira em que está formatada
    val aspasTriplas = """
        Bom dia
        Como você está?
    """.trimIndent()
    /*
     * A função trimIndent() é uma função de extensão da classe String
     *  em Kotlin que detecta um traço mínimo comum de todas as linhas de entrada,
     *  remove-o de cada linha e também remove a primeira e a última linha se estiverem em branco
     */


//______________________________________________________________________________________________________________________
    /*
     *  Função replaceIndent() é uma função da linguagem de programação Kotlin
     * que detecta um recuo mínimo comum e o substitui pelo novo recuo especificado.
     *  A função retorna uma nova string com o recuo substituído
     */

    val formulario = """
        ola 
        bem 
        vindo  
    """.replaceIndent(".")


}