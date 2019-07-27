package com.seersage.homegardenfarms


import android.util.Log
import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import com.seersage.homegardenfarms.repository.login


import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class LoginInstrumentedTest {
    @Before
    fun setup(){
        Log.d("Login", "Setting up login tests")
        login("e@f", "12345")


    }


    @Test
    fun test() {
        assert(true)
    }
}
