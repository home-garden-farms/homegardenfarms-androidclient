package com.seersage.homegardenfarms.data

data class Profile(
    val id: String,
    var icon: String,
    var description: String,
    var title: String,
    var firstName: String,
    var lastName: String,
    var mobile: String,
    var im: String,
    var home: Address,
    var locations: List<Address>
)