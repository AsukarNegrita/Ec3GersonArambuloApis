package com.gerson.ec3gersonarambuloapis.model

data class Skin(
    val uuid: String,
    val displayName: String,
    val displayIcon: String="",
    val isFavorite: Boolean=false
)
fun getData(): List<Skin> = listOf(
    Skin("121231232312-1211","Odin","https://media.valorant-api.com/weaponskins/89be9866-4807-6235-2a95-499cd23828df/displayicon.png"),
    Skin("121231232312-1211","Odin","https://media.valorant-api.com/weaponskins/89be9866-4807-6235-2a95-499cd23828df/displayicon.png"),
    Skin("121231232312-1211","Odin","https://media.valorant-api.com/weaponskins/89be9866-4807-6235-2a95-499cd23828df/displayicon.png")


)