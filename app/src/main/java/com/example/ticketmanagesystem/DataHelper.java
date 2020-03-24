package com.example.ticketmanagesystem;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.ticketmanagesystem.data.Movie;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

public class DataHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="movieAndAuthor db";
    public static final int DATABASE_VERSION=7;

    public DataHelper(@Nullable Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
    }

    public void initTable(SQLiteDatabase db){
        db.execSQL("drop table if exists  movies" ); //这个是将表删除

        String createTable = "create table if not exists movies (" +
                "_ID integer primary key autoincrement,"
                +"movieName text not null,"
                +"imgId integer,"
                + "author text)";

        db.execSQL(createTable);

        //  final ByteArrayOutputStream os = new ByteArrayOutputStream();
        // InputStream is = context.getResources().openRawResource(resourceID);
        // Resources res = getResources();
        // Bitmap bmp = BitmapFactory.decodeResource(res, R.drawable.first);
        // bmp.compress(Bitmap.CompressFormat.PNG, 100, os);


        ContentValues values = new ContentValues();
        values.put("movieName","倩女幽魂");
        values.put("imgId",R.drawable.first);
        values.put("author","徐克");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","赵氏孤儿");
        values.put("imgId",R.drawable.second);
        values.put("author","陈凯歌");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","十月围城");
        values.put("imgId",R.drawable.third);
        values.put("author","陈可辛");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","花样年华");
        values.put("imgId",R.drawable.forth);
        values.put("author","王家卫");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","大话西游");
        values.put("imgId",R.drawable.fifth);
        values.put("author","周星驰");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","在清朝");
        values.put("imgId",R.drawable.sixth);
        values.put("author","贾樟柯");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","我不是潘金莲");
        values.put("imgId",R.drawable.seventh);
        values.put("author","冯小刚");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","碟中谍2");
        values.put("imgId",R.drawable.eighth);
        values.put("author","吴宇森");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","金陵十三钗");
        values.put("imgId",R.drawable.ninth);
        values.put("author","张艺谋");
        db.insert("movies",null,values);
        values.clear();
        values.put("movieName","色戒");
        values.put("imgId",R.drawable.tenth);
        values.put("author","李安");
        db.insert("movies",null,values);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        initTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        initTable(db);
    }

    public SQLiteDatabase getDataBase(){
        return getWritableDatabase();
    }

    public List<Movie> queryAllMovieData(){
        Cursor cursor=getWritableDatabase().query("movies",null,null,
                null,null,null,null);
        List<Movie> list= new ArrayList<>();
        if(cursor.moveToFirst()){
            do{
                String movieName=cursor.getString(cursor.getColumnIndex("movieName"));
                int imgId=cursor.getInt(cursor.getColumnIndex("imgId"));
                String author=cursor.getString(cursor.getColumnIndex("author"));

                Movie movie=new Movie();
                movie.setMovieName(movieName);
                movie.setImgId(imgId);
                movie.setAuthor(author);

                list.add(movie);
            }while(cursor.moveToNext());
        }
        System.out.println(list);
        cursor.close();
        getWritableDatabase().close();

        return list;
    }
}
