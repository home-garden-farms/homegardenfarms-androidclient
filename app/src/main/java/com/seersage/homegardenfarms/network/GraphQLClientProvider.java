package com.seersage.homegardenfarms.network;

import com.apollographql.apollo.ApolloClient;
import okhttp3.OkHttpClient;

public class GraphQLClientProvider {

    private static ApolloClient clientInstance;

    public GraphQLClientProvider(String baseURL) {
        if(clientInstance == null){
            OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

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
