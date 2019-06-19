package com.seersage.homegardenfarms.data

data class User (
    override val id: String,
    var roles: List<UserRole>,
    var username: String,
    var wants: List<Category>,
    var offers: List<Category>,
    override var icon: String,
    override var title: String,
    override var description: String,
    var location: Address,
    var profile: Profile,
    var url: String
) : INode, IObjectSummary