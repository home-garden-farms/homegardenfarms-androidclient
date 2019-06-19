package com.seersage.homegardenfarms.data

data class Address(
    override val id: String,
    override var icon: String,
    override var title: String,
    override var description: String,
    override var locationType: List<LocationTypeEnum>,
    override var lat: Float,
    override var lon: Float
) : INode, IMapLocation, IObjectSummary