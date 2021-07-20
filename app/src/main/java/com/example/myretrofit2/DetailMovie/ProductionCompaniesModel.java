package com.example.myretrofit2.DetailMovie;

import com.google.gson.annotations.SerializedName;

public class ProductionCompaniesModel {
    int id;
    @SerializedName("logo_path")
    String logoPath;
    String name;
    @SerializedName("origin_country")
    String originCountry;
}
