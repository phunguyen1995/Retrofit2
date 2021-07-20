package com.example.myretrofit2;

import com.example.myretrofit2.PostChatApi1.PostChatApi;
import com.example.myretrofit2.PostChatApi1.RequestLogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService2 {
    @POST("api/v1/login")
    @FormUrlEncoded
    Call<PostChatApi> createUser(@Field("user") String user, @Field("password") String password);
}
