package com.example.myretrofit2;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyRetrofit3 {
    private static ApiService2 apiService2;
    public static ApiService2 instance() {
        if(apiService2 == null){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://chat.d-soft.com.vn/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            //api/v1/login
            apiService2=retrofit.create(ApiService2.class);

        }
        return apiService2;
    }

}
