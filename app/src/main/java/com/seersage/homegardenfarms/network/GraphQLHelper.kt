package com.seersage.homegardenfarms.network;

import android.util.Log
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.apollographql.apollo.sample.LoginMutation


class GraphQLHelper (baseURL:String){

    var client: ApolloClient


    init{
        client = GraphQLClientProvider(baseURL).getClientInstance();
    }

    fun login(userName:String, passWord: String):Response<LoginMutation.Data>?{

        var callback = object: ApolloCall.Callback<LoginMutation.Data>(){
            var loginResponse: Response<LoginMutation.Data>? = null
            override fun onResponse(response: Response<LoginMutation.Data>) {
                Log.d("Login", response.data()?.toString())
                loginResponse = response
            }

            override fun onFailure(e: ApolloException) {
                Log.e("Login", e.toString());
                loginResponse = null
            }
        }

        client.mutate(LoginMutation.
            builder()
            .email(userName)
            .password(passWord)
            .build())
            .enqueue(callback)


        return callback.loginResponse
    }

}
