package com.example.coffee.data

import java.io.Serializable

class Recipe (
    val key : Int,
    val title : String,
    val contents : String,
    val pic : String
): Serializable