package com.seersage.homegardenfarms

import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.apollographql.apollo.sample.LoginMutation
import com.seersage.homegardenfarms.network.GraphQLClientProvider
import com.seersage.homegardenfarms.network.GraphQLHelper
import com.seersage.homegardenfarms.repository.Repository
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class GraphQLTest {
    lateinit var repository: Repository

    @Before
    fun init(){
        repository = Repository()
    }



    @Test
    fun loginTest(){
        var loginResponse = runBlocking{
            val job = launch{repository.login("e@f.com", "12345")}
            job.cancelAndJoin()
        }

        assertNotNull(loginResponse)


    }
}
