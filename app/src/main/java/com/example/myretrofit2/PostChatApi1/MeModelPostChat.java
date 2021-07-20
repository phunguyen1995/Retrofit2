package com.example.myretrofit2.PostChatApi1;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MeModelPostChat {
    @SerializedName("_id")
    String Id;
    String bcrypt;
    String username;
    List<EmailsPostChatModel> emails;
    String status;
    String active;
    @SerializedName("_updatedAt")
    String UpdatedAt;
    List<RolesPostChatModel> roles;
    String tid;
    String workspace;
    String name;
    StatusConnectionModelPostChat StatusConnection;
    @SerializedName("username_t")
    String usernameT;
    String statusConnection;
    int utcOffset;
    String statusDefault;
    String language;
    String avatarUrl;
}
