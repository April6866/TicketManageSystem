package com.example.ticketmanagesystem.data;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class play extends RecyclerView.ViewHolder {
    //电影名称
    private String name;
    //电影作者
    private String author;
    //电影评分
    private float score;
    //图片id
    private int ImageId;

    public play(@NonNull View itemView) {
        super(itemView);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
