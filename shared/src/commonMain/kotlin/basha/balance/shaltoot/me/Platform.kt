package basha.balance.shaltoot.me

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform