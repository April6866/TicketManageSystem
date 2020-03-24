package com.example.ticketmanagesystem.data;

import android.database.Cursor;

import com.example.ticketmanagesystem.MyApplication;

import java.util.List;

public class Movie {
    private String movieName;

    private String author;

    public int getImgId() {
        return imgId;
    }



    private int imgId;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void setImgId(int imgId) {
        this.imgId=imgId;
    }
}
