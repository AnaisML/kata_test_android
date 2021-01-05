package com.example.kata_test_android

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CutUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun cutString1() {
        assertEquals(cortarString("string Super Largo", 10), "string Sup /n er Largo")
    }

    @Test
    fun cortarCadena() {
        assertEquals( "string Sup /n er Largo", cortarCadena("string Super Largo", 10),)
    }
}