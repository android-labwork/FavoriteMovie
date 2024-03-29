package com.aitekteam.developer.favoritemovie.datas;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TVShow implements Serializable {
    // DEFAULT DATA
    @SerializedName("id")
    private int id;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("overview")
    private String overview;

    // EXTRA DATA
    @SerializedName("name")
    private String name;
    @SerializedName("first_air_date")
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
