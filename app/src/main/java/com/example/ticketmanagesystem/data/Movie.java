package com.example.ticketmanagesystem.data;

import android.database.Cursor;

import com.example.ticketmanagesystem.MyApplication;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int _ID;
    private String movieName;

    private String author;
    private  List<Concert> concertList = new ArrayList<>();
    public int getImgId() {
        return imgId;
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public List<Concert> getConcertList() {
        return concertList;
    }

    public void setConcertList(List<Concert> concertList) {
        this.concertList = concertList;
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
