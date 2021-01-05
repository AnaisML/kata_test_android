package com.example.kata_test_android

/*

Your task is to write a function that takes two arguments, a string and an integer width.

The function returns the string, but with line breaks inserted at just the right places to make sure that no line is longer than the column number. You try to break lines at word boundaries.

Like a word processor, break the line by replacing the last space in a line with a newline.

 */
fun cortarString(cadena: String, size: Int): String {
    return cadena.chunked(size).joinToString(" /n ")
}

fun cortarCadena(cadena: String?, tamaño: Int): String {
    var cadenaNueva: String = ""
    cadena?.let {
        for (num in cadena.indices) {
            if ((num != 0) && (num % tamaño == 0)) {
                cadenaNueva += " /n " + cadena[num]
            } else {
                cadenaNueva += cadena[num]
            }
        }
    }
    return cadenaNueva
}