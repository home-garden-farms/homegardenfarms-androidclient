package com.seersage.homegardenfarms.networking;

import com.apollographql.apollo.ApolloClient;
import okhttp3.OkHttpClient;

public class OKHttpClientBuilder {

    private String BASE_URL;
    private ApolloClient client;

    OKHttpClientBuilder(String baseURL) {
        BASE_URL = baseURL;
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

        ApolloClient apolloClient = ApolloClient.builder()
                .serverUrl(BASE_URL)
                .okHttpClient(okHttpClient)
                .build();
        client = apolloClient;
    }

    public ApolloClient getClient() {
        return client;
    }

}
