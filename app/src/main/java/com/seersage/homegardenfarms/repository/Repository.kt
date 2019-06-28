package com.seersage.homegardenfarms.repository

import com.apollographql.apollo.api.Response
import com.apollographql.apollo.sample.LoginMutation
import com.seersage.homegardenfarms.network.GraphQLHelper


class Repository{

    fun login(userName:String, password:String): Response<LoginMutation.Data>?{
        return GraphQLHelper("http://srv.homegardenfarms.com:3000/graphql")?.login(userName, password)
    }


}