package com.example.myretrofit2;
import com.google.gson.annotations.SerializedName;
public class LoginResponse {
    @SerializedName("UserId")
    public String UserId;
    @SerializedName("Password")
    public String Password;
    public LoginResponse(String UserId, String Password) {
        this.UserId = UserId;
        this.Password = Password;
    }
}
