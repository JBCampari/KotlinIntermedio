package com.example.kotlinintermedio

class MyNestedAndInnerClass {

    private val uno = 1

    private fun devuelveUno () : Int {

        return uno

    }

    // Clase Anidada (Nested Class)
    class MyNestedClass {

        fun suma (primerSum: Int, segundoSum: Int): Int {

            return primerSum + segundoSum

        }

    }

    // Clase Interna (Inner Class)
    inner class MyInnerClass {

        fun sumaDos (numero: Int): Int {

            return numero + uno + devuelveUno()

        }

    }

}