package com.seersage.homegardenfarms

import com.apollographql.apollo.api.Response
import com.apollographql.apollo.sample.LoginMutation
import com.seersage.homegardenfarms.network.GraphQLHelper
import com.seersage.homegardenfarms.repository.Repository
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class GraphQLTest {

    @Test
    fun loginTest(){
        var response: Response<LoginMutation.Data>? = GraphQLHelper("http://srv.homegardenfarms.com:3000/graphql").login("e@f.com", "12345")

        assertNotNull(response)
    }
}
