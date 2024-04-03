package org.example

/**
 * Clase generador de secuecia
 * @property sec String Son las palabras que iremos obteniendo para luego devolver la secuencia de palabras concatenadas
 * en una frase.
 */
class GeneradorSecuencias() : IEntradaSalida {
    private lateinit var sec: Sequence<String>
    private val numLimit = pedirNumero()
    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(numLimit)

    /**
     * Consola, heredada de IEntradaSalida, imprimirá lo que le enviemos a la función.
     * @param mensaje Any Recibe datos de cualquier tipo.
     * @return El mensaje como una cadena de caracteres.
     */
    override fun consola(mensaje: Any) {
        val imprimir = println(mensaje)
        return imprimir
    }

    /**
     * Pedir números
     * Irá pidiendo un número entero hasta que el dato sea correcto, éste número será el límite para el número de palabras de la secuencia.
     * @return num Int Devuelve el número entero que hemos pedido.
     */
    override fun pedirNumero(): Int {
        var num: Int?
        do {
            consola("Introduce un número entero: ")
            num = readLine()?.toInt()
        } while (num == null)
        return num
    }

    /**
     * Frase incremental
     * Recibirá el número de palabras que tendrá la fase, utilizará la función lineSequence para actualizar el valor del
     * atributo sec y mostrará una a una cada palabra que se va a ir insertando en la secuencia hasta finalmente tomar la frase completa.
     */
    fun fraseIncremental() {
        consola("Introduce palabras en secuencia seguidas de *intro*  :")
        val palabras = mutableListOf<String>()
        var i = 0
        repeat(numLimit) {
            palabras.add(readLine().toString())
            consola(palabras[i])
            i++
        }
        sec = palabras.asSequence()
    }

    /**
     * Frase final
     * Iguan que fraseIncremental, pero mostrará sólo la frase una vez completada la secuencia.
     */
    fun fraseFinal() {
        consola("Introduce seguidamente las palabras de la frase:         ")
        sec = generateSequence { readLine() }.take(numLimit)
    }

    /**
     * Get sec
     * Retornará el contenido del atributo sec en una sola línea separando sus elementos por un espacio.
     */
    private fun getSec(): String {
        return (sec.joinToString(" ") { it })

    }

    /**
     * Mostrar sec
     * Mostrará la salida del contenido de sec.
     */
    fun mostrarSec() {
        consola("La secuencia completa es:\n")
        consola(getSec())
    }


}