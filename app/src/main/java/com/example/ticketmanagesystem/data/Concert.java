package com.example.ticketmanagesystem.data;

public class Concert {
    private String ConcertName;

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    private int _ID;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    private String movieName;

    public String getConcertName() {
        return ConcertName;
    }

    public void setConcertName(String concertName) {
        ConcertName = concertName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    private String showTime;
}
