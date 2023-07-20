package funOrdemSuperior

fun main() {
    val a = "Fernando"
    ordemSuperior(a){
        println("Welcome ${ it.uppercase() }")
    }

    println("olá mundo. oiiii")
}

// A função tem como parametro outra função lambda que recebe como parametro o paramentro esta na função principal como um callback
fun ordemSuperior(name: String, resName: (String) -> Unit) = resName(name)