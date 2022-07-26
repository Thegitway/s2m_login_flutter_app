package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Guessous Mohamed Tariq on 2020-08-06.
 */

public class News implements Serializable {


    @SerializedName("title")
    private String title = "";
    @SerializedName("desc")
    private String description = "";
    @SerializedName("photoLink")
    private String image;
    @SerializedName("date")
    private String date = "";
    @SerializedName("dateExpir")
    private String dateExpir = "";
    @SerializedName("newsLink")
    private String newsLink = "";


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateExpir() {
        return dateExpir;
    }

    public void setDateExpir(String dateExpir) {
        this.dateExpir = dateExpir;
    }

    public String getNewsLink() {
        return newsLink;
    }

    public void setNewsLink(String newsLink) {
        this.newsLink = newsLink;
    }
}
