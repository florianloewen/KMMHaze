package de.florianloewen.kmmhaze

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform