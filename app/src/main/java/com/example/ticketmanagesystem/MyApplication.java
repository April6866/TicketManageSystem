package com.example.ticketmanagesystem;

import android.app.Application;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import io.realm.Realm;

public class MyApplication extends Application {
    public SQLiteDatabase database;
    public DataHelper helper;
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
         helper = new DataHelper(this);
         database = helper.getDataBase();
    }
}
