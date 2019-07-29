package com.seersage.homegardenfarms.network;

import android.content.Context;
import android.util.Log;
import com.apollographql.apollo.ApolloClient;
import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphQLClientProvider {

    private static ApolloClient clientInstance;


    public GraphQLClientProvider(String baseURL, final Context context) {
        ClearableCookieJar cookieJar =
                new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(context));
        if(clientInstance == null){
            OkHttpClient okHttpClient = new OkHttpClient.Builder().cookieJar(cookieJar).build();

            ApolloClient apolloClient = ApolloClient.builder()
                    .serverUrl(baseURL)
                    .okHttpClient(okHttpClient)
                    .build();
            clientInstance = apolloClient;
        }
    }

    public ApolloClient getClientInstance() {
        return clientInstance;
    }

}


