package com.example.kotlinintermedio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinintermedio.ui.theme.KotlinIntermedioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinIntermedioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }

        // Clase Enum
        enumClasses()

        // Clases anidadas(nested) y internas(inner)
        nestedAndInnerClases()

    }

    // Lección 1 Kotlin Intermedio Enum Classes.

    enum class Direction(val dir: Int) {

        NORTH(0), SOUTH(180), EAST(90), WEST(360);

        fun descripcion() : String {

            return when (this) {
                NORTH -> "La dirección es Norte"
                SOUTH -> "La dirección es Sur"
                EAST -> "La dirección es Este"
                WEST -> "La dirección es Oeste"
            }
        }

    }

    // Lección 1 kotlin intermedio: Clases de enumeracion.
    private fun enumClasses() {

        var userDirection: Direction? = null
        println("Dirección: $userDirection")

        userDirection = Direction.EAST
        println("Dirección: $userDirection")

        // Propiedades por defecto.
        println("Propiedad name: ${userDirection.name}")
        println("Propiedad ordinal: ${userDirection.ordinal}")

        // Metodos (funciones de la clase)
        println(userDirection.descripcion())

        // Inicialización.
        println(userDirection.dir)

    }

    // Lección 2 kotlin intermedio: Clases anidadas e internas.
    private fun nestedAndInnerClases() {

        // Clase anidada (nested)
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val suma = myNestedClass.suma(5,5)
        println("La suma es $suma")

        // Clase interna (inner)
        val myInnerClass: MyNestedAndInnerClass.MyInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumaDos : Int = myInnerClass.sumaDos(10)
        println("El resultado de sumar dos es: $sumaDos")

    }

}

