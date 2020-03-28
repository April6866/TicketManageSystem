package com.example.ticketmanagesystem;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.ticketmanagesystem.data.Concert;
import com.example.ticketmanagesystem.data.Movie;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

public class DataHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "movieAndAuthor db";
    public static final int DATABASE_VERSION =10;

    public DataHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void initTable(SQLiteDatabase db) {
        db.execSQL("drop table if exists  movies"); //这个是将表删除

        String createTable = "create table if not exists movies (" +
                "_ID integer primary key autoincrement,"
                + "movieName text not null,"
                + "imgId integer,"
                + "author text)";

        db.execSQL(createTable);

        //  final ByteArrayOutputStream os = new ByteArrayOutputStream();
        // InputStream is = context.getResources().openRawResource(resourceID);
        // Resources res = getResources();
        // Bitmap bmp = BitmapFactory.decodeResource(res, R.drawable.first);
        // bmp.compress(Bitmap.CompressFormat.PNG, 100, os);


        ContentValues values = new ContentValues();
        values.put("movieName", "倩女幽魂");
        values.put("imgId", R.drawable.first);
        values.put("author", "徐克");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "赵氏孤儿");
        values.put("imgId", R.drawable.second);
        values.put("author", "陈凯歌");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "十月围城");
        values.put("imgId", R.drawable.third);
        values.put("author", "陈可辛");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "花样年华");
        values.put("imgId", R.drawable.forth);
        values.put("author", "王家卫");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "大话西游");
        values.put("imgId", R.drawable.fifth);
        values.put("author", "周星驰");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "在清朝");    //6
        values.put("imgId", R.drawable.sixth);
        values.put("author", "贾樟柯");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "我不是潘金莲");
        values.put("imgId", R.drawable.seventh);
        values.put("author", "冯小刚");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "碟中谍2");
        values.put("imgId", R.drawable.eighth);
        values.put("author", "吴宇森");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "金陵十三钗");   //9
        values.put("imgId", R.drawable.ninth);
        values.put("author", "张艺谋");
        db.insert("movies", null, values);
        values.clear();
        values.put("movieName", "色戒");
        values.put("imgId", R.drawable.tenth);
        values.put("author", "李安");
        db.insert("movies", null, values);

        //创建第二张表（演出厅）
        db.execSQL("drop table if exists concerts");
        String createTable2 = "create table if not exists concerts(" +
                "_ID integer primary key autoincrement,"
                + "movieName text not null,"     //放映的电影对应关系
                + "concertName text not null,"
                + "showTime text)";
        db.execSQL(createTable2);

        ContentValues values1 = new ContentValues();
        values1.put("movieName", "倩女幽魂");
        values1.put("concertName", "百花放映厅");
        values1.put("showTime", "8:00-10:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "倩女幽魂");
        values1.put("concertName", "朝暮放映厅");
        values1.put("showTime", "8:00-10:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "倩女幽魂");
        values1.put("concertName", "水镜放映厅");
        values1.put("showTime", "10:00-12:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "赵氏孤儿");
        values1.put("concertName", "百花放映厅");
        values1.put("showTime", "10:00-13:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "赵氏孤儿");
        values1.put("concertName", "冰清放映厅");
        values1.put("showTime", "8:00-11:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "十月围城");
        values1.put("concertName", "春芊放映厅");
        values1.put("showTime", "8:00-10:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "花样年华");
        values1.put("concertName", "百花放映厅");
        values1.put("showTime", "13:00-15:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "花样年华");
        values1.put("concertName", "百花放映厅");
        values1.put("showTime", "15:00-17:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "在清朝");        //9
        values1.put("concertName", "春芊放映厅");
        values1.put("showTime", "8:00-10:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "在清朝");
        values1.put("concertName", "百花放映厅");     //10
        values1.put("showTime", "18:00-20:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "金陵十三钗");     //9
        values1.put("concertName", "百花放映厅");
        values1.put("showTime", "12:30-14:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "我不是潘金莲");
        values1.put("concertName", "水镜放映厅");
        values1.put("showTime", "17:00-19:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "我不是潘金莲");
        values1.put("concertName", "朝暮放映厅");
        values1.put("showTime", "8:00-10:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "大话西游");
        values1.put("concertName", "百花放映厅");
        values1.put("showTime", "20:00-22:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "大话西游");
        values1.put("concertName", "朝暮放映厅");
        values1.put("showTime", "13:00-15:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "大话西游");
        values1.put("concertName", "水镜放映厅");
        values1.put("showTime", "6:00-8:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "碟中谍2");
        values1.put("concertName", "百花放映厅");
        values1.put("showTime", "19:00-21:00");
        values1.clear();
        values1.put("movieName", "碟中谍2");
        values1.put("concertName", "紫晶放映厅");
        values1.put("showTime", "8:00-10:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "色戒");
        values1.put("concertName", "紫晶放映厅");
        values1.put("showTime", "11:00-13:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "色戒");
        values1.put("concertName", "水镜放映厅");
        values1.put("showTime", "17:00-19:00");
        db.insert("concerts", null, values1);
        values1.clear();
        values1.put("movieName", "色戒");
        values1.put("concertName", "百花放映厅");
        values1.put("showTime", "21:00-23:00");
        db.insert("concerts", null, values1);


        //创建电影 放映厅 中间表

        db.execSQL("drop table if exists moviesAndconcerts");
        String moviesAndconcertsSql = "create table if not exists moviesAndconcerts(" +
                "_ID integer primary key autoincrement,"
                + "movieId integer,"     //电影ID
                + "concertId integer)";   //放映厅ID
        db.execSQL(moviesAndconcertsSql);

        values1.clear();
        values1.put("movieId", 0);
        values1.put("concertId", 1);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 1);
        values1.put("concertId", 1);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 1);
        values1.put("concertId", 2);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 1);
        values1.put("concertId", 3);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 2);
        values1.put("concertId", 4);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 2);
        values1.put("concertId", 5);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 3);
        values1.put("concertId", 6);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 4);
        values1.put("concertId", 7);
        db.insert("moviesAndconcerts", null, values1);


        values1.clear();
        values1.put("movieId", 5);   //大话西游
        values1.put("concertId", 15);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 6);      //在清朝
        values1.put("concertId", 9);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 6);
        values1.put("concertId", 10);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 7);    //我不是潘金连
        values1.put("concertId", 12);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 7);
        values1.put("concertId", 10);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 9);
        values1.put("concertId", 11);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 8);
        values1.put("concertId", 16);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 8);
        values1.put("concertId", 17);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 10);
        values1.put("concertId", 18);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 10);
        values1.put("concertId", 19);
        db.insert("moviesAndconcerts", null, values1);

        values1.clear();
        values1.put("movieId", 10);
        values1.put("concertId", 20);
        db.insert("moviesAndconcerts", null, values1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        initTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        initTable(db);
    }

    public SQLiteDatabase getDataBase() {
        return getWritableDatabase();
    }

    public List<Concert> queryConcertByMovieId(int movieId) {
        String sqlwhereSql = " movieId=?";

        Cursor cursor = getWritableDatabase().query(
                "moviesAndconcerts", null, sqlwhereSql,
                new String[]{movieId + ""},
                null, null, null, null);
        List<Concert> concertList = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                int concertId = cursor.getInt(cursor.getColumnIndex("concertId"));

                 Concert concert= queryConcertById(concertId);

                concertList.add(concert);


            } while (cursor.moveToNext());
        }

        cursor.close();
        getWritableDatabase().close();

        return concertList;
    }

    public List<Movie> queryAllMovieData() {
        Cursor cursor = getWritableDatabase().query("movies", null, null,
                null, null, null, null);
        List<Movie> list = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                int _ID = cursor.getInt(cursor.getColumnIndex("_ID"));
                String movieName = cursor.getString(cursor.getColumnIndex("movieName"));
                int imgId = cursor.getInt(cursor.getColumnIndex("imgId"));
                String author = cursor.getString(cursor.getColumnIndex("author"));

                Movie movie = new Movie();
                movie.set_ID(_ID);
                movie.setMovieName(movieName);
                movie.setImgId(imgId);
                movie.setAuthor(author);

               // List<Concert> concertList=queryConcertByMovieId(_ID);
                //movie.setConcertList(concertList);
           // System.out.println("concertList : "+concertList);
                list.add(movie);
            } while (cursor.moveToNext());
        }
        System.out.println(list);
        cursor.close();
        getWritableDatabase().close();

        return list;
    }

    public Concert queryConcertById(int id) {
        Cursor cursor = getWritableDatabase().query("concerts", null, "_ID=?"
                , new String[]{id + ""}, null, null, null);
        if (cursor.moveToNext()) {
            return getConcertByCursor(cursor);
        }
        cursor.close();
        getWritableDatabase().close();
        return null;
    }

    public List<Concert> queryAllConcertData() {
        Cursor cursor = getWritableDatabase().query("concerts", null, null
                , null, null, null, null);
        List<Concert> list = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Concert concert = getConcertByCursor(cursor);
                list.add(concert);
            } while (cursor.moveToNext());

        }
        cursor.close();
        getWritableDatabase().close();
        return list;
    }
    //修改数据
    public void updateMovieById(Movie movie) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("movieName", movie.getMovieName());
        cv.put("imgId", movie.getImgId());
        cv.put("author", movie.getAuthor());

        db.update("movies", cv, "_id=? ", new String[]{movie.get_ID() + ""});
        db.close();
    }

    public void updateConcertById(Concert concert){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("concertName",concert.getConcertName());
       // cv.put("movieName",concert.getMovieName());
        cv.put("showTime",concert.getShowTime());

        db.update("concerts",cv,"_id=?",new String[]{concert.get_ID()+""});
        db.close();
    }



    public Movie queryMovieById(int id){
        String sqlwhereSql= "_ID=?";
        Cursor cursor = getWritableDatabase().query("movies", null, sqlwhereSql,
                new String[]{id + ""}, null, null, null);

        if (cursor.moveToNext()) {

            int _ID = cursor.getInt(cursor.getColumnIndex("_ID"));
            String movieName = cursor.getString(cursor.getColumnIndex("movieName"));
            int imgId = cursor.getInt(cursor.getColumnIndex("imgId"));
            String author = cursor.getString(cursor.getColumnIndex("author"));

            Movie movie = new Movie();
            movie.set_ID(_ID);
            movie.setMovieName(movieName);
            movie.setImgId(imgId);
            movie.setAuthor(author);

            return movie;
        }

        cursor.close();
        getWritableDatabase().close();

        return null;
    }
    private Concert getConcertByCursor(Cursor cursor) {
        int _ID = cursor.getInt(cursor.getColumnIndex("_ID"));
        String movieName = cursor.getString(cursor.getColumnIndex("movieName"));
        String concertName = cursor.getString(cursor.getColumnIndex("concertName"));
        String showTime = cursor.getString(cursor.getColumnIndex("showTime"));
        Concert concert = new Concert();

        concert.set_ID(_ID);
        concert.setConcertName(concertName);
        concert.setMovieName(movieName);
        concert.setShowTime(showTime);
        return concert;
    }
}
