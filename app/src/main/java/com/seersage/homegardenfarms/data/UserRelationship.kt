package com.seersage.homegardenfarms.data

data class UserRelationship(
    override val id: String,
    var usr1: User,
    var usr2: User,
    override var icon: String,
    override var title: String,
    override var description: String

) : INode, IObjectSummary