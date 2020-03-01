package com.appshive


expect fun platformName(): String

class Greetings{
    fun greeting():String = "Hello ${platformName()}"
}

