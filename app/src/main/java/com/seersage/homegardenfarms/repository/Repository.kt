package com.seersage.homegardenfarms.repository

import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.apollographql.apollo.sample.LoginMutation
import com.seersage.homegardenfarms.network.GraphQLClientProvider
import com.seersage.homegardenfarms.network.GraphQLHelper
import kotlin.coroutines.suspendCoroutine


class Repository{
    val baseURL: String = "http://srv.homegardenfarms.com:3000/graphql"

    suspend fun login(userName:String, password:String): Response<LoginMutation.Data>?=
        suspendCoroutine {
            var client: ApolloClient = GraphQLClientProvider(baseURL).getClientInstance();
            var callback = object: ApolloCall.Callback<LoginMutation.Data>(){

                override fun onResponse(response: Response<LoginMutation.Data>) {
                    println(response.data())
                }

                override fun onFailure(e: ApolloException) {
                    println(e.toString())
                }
            }

            client.mutate(LoginMutation.
                builder()
                .email("e@f.com")
                .password("12345")
                .build())
                .enqueue(callback)
        }
}



//GraphQLHelper("http://srv.homegardenfarms.com:3000/graphql")?.login(userName, password)
