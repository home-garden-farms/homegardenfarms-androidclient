package com.seersage.homegardenfarms.data

data class User (
    val id: String,
    var roles: List<UserRole>,
    var username: String,
    var wants: List<Category>,
    var offers: List<Category>,
    var icon: String,
    var title: String,
    var description: String,
    var location: Address,
    var profile: Profile,
    var url: String
)