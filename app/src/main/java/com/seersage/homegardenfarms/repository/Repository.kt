package com.seersage.homegardenfarms.repository

import android.content.Context
import android.util.Log
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.apollographql.apollo.sample.LoginMutation
import com.seersage.homegardenfarms.network.GraphQLClientProvider

    val baseURL: String = "http://srv.homegardenfarms.com:3000/graphql"

    fun login(userName:String, password:String, context: Context){
        Log.d("Login", "starting login")
        var client: ApolloClient = GraphQLClientProvider(baseURL, context).getClientInstance()
        var callback = object : ApolloCall.Callback<LoginMutation.Data>() {

            override fun onResponse(response: Response<LoginMutation.Data>) {
                Log.d("Login", "received response with : " + response.data())

            }

            override fun onFailure(e: ApolloException) {
                Log.e("Login", e.toString())
            }
        }

        client.mutate(
            LoginMutation.builder()
                .email(userName)
                .password(password)
                .build()
        )
            .enqueue(callback)


        Log.d("Login", "finished login")
    }






