package com.seersage.homegardenfarms.data

data class Address(
    val id: String,
    var icon: String,
    var title: String,
    var description: String,
    var locationType: List<LocationTypeEnum>,
    var lat: Float,
    var lon: Float
)