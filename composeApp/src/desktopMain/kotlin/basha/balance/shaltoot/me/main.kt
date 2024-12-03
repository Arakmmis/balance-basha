package basha.balance.shaltoot.me

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Balance Basha",
    ) {
        App()
    }
}