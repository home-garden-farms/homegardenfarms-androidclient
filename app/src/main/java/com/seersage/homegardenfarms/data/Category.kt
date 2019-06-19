package com.seersage.homegardenfarms.data



data class Category (
    override val id: String,
    var image: String,
    var name: String,
    var description: String,
    override var childCount: Int,
    var parent: Category,
    var path: String,
    var sort: Int,
    var units: CategoryUnitsEnum

) : INode, IComposite