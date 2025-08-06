package com.example.todoapp.kmmtodoapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform