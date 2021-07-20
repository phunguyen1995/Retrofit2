package com.example.myretrofit2.DetailMovie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DetailMovieResponseModel {
    boolean adult;
    @SerializedName("backdrop_path")
    String backdropPath;
    @SerializedName("belongs_to_collection")
    String belongsToCollection;
    int budget;
    List<GenresModel> genres;
    String homepage;
    int id;
    @SerializedName("imdb_id")
    String imdbId;
    @SerializedName("original_language")
    String originalLanguage;
    @SerializedName("original_title")
    String originalTitle;
    String overview;
    float popularity;
    @SerializedName("poster_path")
    String posterPath;
    @SerializedName("production_companies")
    List<ProductionCompaniesModel> productionCompanies;
    @SerializedName("production_countries")
    List<ProductionContriesModel> productionCountries;
    @SerializedName("release_date")
    String releaseDate;
    int revenue;
    int runtime;
    @SerializedName("spokenLanguages")
    List<SpokenLanguagerModel> spokenLanguages;
    String status;
    String tagline;
    String title;
    boolean video;
    @SerializedName("voteAverage")
    float vote_average;
    @SerializedName("voteCount")
    int vote_count;


}
