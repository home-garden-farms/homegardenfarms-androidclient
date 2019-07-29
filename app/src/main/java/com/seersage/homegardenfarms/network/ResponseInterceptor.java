package com.seersage.homegardenfarms.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashSet;

public class ResponseInterceptor implements Interceptor {


    @Override public Response intercept(Interceptor.Chain chain) throws IOException {
        Log.d("Login", "response sucessfully intercepted");
        Request request = chain.request();

        Response response = chain.proceed(request);
        Log.d("Login", "response headers: " + response.headers().toString());

        if (!response.headers("Set-Cookie").isEmpty()) {
            HashSet<String> cookies = new HashSet<>();
            for (String header : response.headers("Set-Cookie")) {
                cookies.add(header);
            }
            // Save the cookies (I saved in SharedPrefrence), you save whereever you want to save
            for(String cookie : cookies){
                Log.d("Login", "cookie info: " + cookie);
            }

        }else{
            Log.d("Login", "No cookies sent");
        }

        return response;
    }
}