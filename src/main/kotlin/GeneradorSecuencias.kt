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
     * Consola, heredada de IEntradaSalida
     * @return mensaje Any como una cadena de caracteres.
     */
    override fun consola(mensaje: Any) {
        val imprimir = println(mensaje)
        return imprimir
    }

    /**
     * Pedir números
     * @return num Int Devuelve el número, que será el límite para el número de palabras de la secuencia.
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
        consola("Introduce un número entero:")
        var num = readLine()?.toInt()
        while (num == null) {
            consola("Debes introducir un número entero.\nInténtalo de nuevo.")
        }
    }

    /**
     * Frase final
     * Iguan que fraseIncremental, pero mostrará sólo la frase una vez completada la secuencia.
     */
    fun fraseFinal() {
        consola("Introduce seguidamente las palabras de la frase:         ")
        sec = lineSequence()
        consola(sec)
    }

    /**
     * Get sec
     * Retornará el contenido del atributo sec en una sola línea separando sus elementos por un espacio.
     */
    private fun getSec(): String {
        return sec.joinToString { " " }
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