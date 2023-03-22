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

    private fun enumClasses() {

        var userDirection: Direction? = null
        println("Dirección: $userDirection")

        userDirection = Direction.SOUTH
        println("Dirección: $userDirection")

        println("Propiedad name: ${userDirection.name}")
        println("Propiedad ordinal: ${userDirection.ordinal}")

        println(userDirection.descripcion())

    }

}

