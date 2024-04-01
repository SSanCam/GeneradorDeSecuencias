package org.example

/**
 * Clase generador de secuecia
 * @property sec String Son las palabras que iremos obteniendo para luego devolver la secuencia de palabras concatenadas
 * en una frase.
 */
class GeneradorSecuencias(var info: IEntradaSalida): IEntradaSalida {
    private lateinit var sec: Sequence<String>
    // Métodos de clase

    /**
     * Line sequence
     * TODO todo...
     */
    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    /**
     * Frase incremental
     * Recibirá el número de palabras que tendrá la fase, utilizará la función lineSequence para actualizar el valor del
     * atributo sec y mostrará una a una cada palabra que se va a ir insertando en la secuencia hasta finalmente tomar la frase completa.
     */
    fun fraseIncremental() {
            consola.imprimir("Introduce un número entero:")
            var num = readLine()?.toInt()
            while (num == null){
                consola.imprimir("Debes introducir un número entero.\nInténtalo de nuevo.")
            }
    }

    /**
     * Frase final
     * Iguan que fraseIncremental, pero mostrará sólo la frase una vez completada la secuencia.
     */
    fun fraseFinal() {

    }

    /**
     * Get sec
     * Retornará el contenido del atributo sec en una sola línea separando sus elementos por un espacio.
     */
    fun getSec() {

    }

    /**
     * Mostrar sec
     * Mostrará la salida del contenido de sec.
     */
    fun mostrarSec() {

    }

    override fun consola() {

    }

    override fun pedirNumero() {

    }

}