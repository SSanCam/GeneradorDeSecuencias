package org.example

class Consola() {
    fun imprimir (texto: Any, saltoLinea: Boolean = false) {
        val printText = println(texto)
        return printText
    }
}