package com.seersage.homegardenfarms.data

data class Profile(
    override val id: String,
    override var icon: String,
    override var description: String,
    override var title: String,
    var firstName: String,
    var lastName: String,
    var mobile: String,
    var im: String,
    var home: Address,
    var locations: List<Address>
) : INode, IObjectSummary