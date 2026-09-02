package com.example.weatherapichallenge

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform