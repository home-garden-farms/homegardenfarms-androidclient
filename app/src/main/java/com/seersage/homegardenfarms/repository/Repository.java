package com.seersage.homegardenfarms.repository;

import com.apollographql.apollo.ApolloClient;
import okhttp3.OkHttpClient;

public class Repository {
    private static final String BASE_URL = "https://api.githunt.com//graphql";

    OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

    ApolloClient apolloClient = ApolloClient.builder()
            .serverUrl(BASE_URL)
            .okHttpClient(okHttpClient)
            .build();

}
