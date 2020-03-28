package com.example.ticketmanagesystem;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.ticketmanagesystem.Adapters.manager_play_adapter;
import com.example.ticketmanagesystem.data.Movie;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ManageActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    private manager_play_adapter mAdapter;

    private DataHelper dataHelper;
    private List<Movie> list;
    private Button btn_add;

    SQLiteDatabase  db;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager);
        dataHelper =new DataHelper(this);
        initWeights();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        getDataByDb();
        if(mAdapter!=null){
            mAdapter.setList(list);
            mAdapter.notifyDataSetChanged();
        }
    }

    private void getDataByDb() {
        list=dataHelper.queryAllMovieData();

    }

    private void initWeights() {

        btn_add=findViewById(R.id.btn_add);
         getDataByDb();

        list= dataHelper.queryAllMovieData();

        mRecyclerView=findViewById(R.id.mana_rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(ManageActivity.this,
               DividerItemDecoration.VERTICAL_LIST));

        //设置item增加和删除时候的动画‘
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter=new manager_play_adapter(this);
        mAdapter.setList(list);
        //监听点击事件
        mAdapter.setOnItemClickListener(new manager_play_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {



                Toast.makeText(ManageActivity.this,"点击第"+(position+1)+"条",  Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ManageActivity.this,ManageConcertActivity  .class);
               //item的点击事件，里面需要把点击的电影id传过去，所以需要把list放在外面

                intent.putExtra("id",list.get(position).get_ID());
                startActivity(intent);
            }

            @Override
            public void onItemLongClick(View view, final int position) {
                 new AlertDialog.Builder(ManageActivity.this)
                         .setTitle("确认删除吗？")
                         .setNegativeButton("取消",null)
                         .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int i) {
                                mAdapter.removeData(position) ;
                             }
                         }).show();
            }
        });
        mRecyclerView.setAdapter(mAdapter);
//点击按钮添加
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position =0;
                Movie movie=new Movie();
            mAdapter.addData(position,movie);
                mRecyclerView.scrollToPosition(0);
               // db=dataHelper.getWritableDatabase();
               // ContentValues values=new ContentValues();
               // values.put("movieName", "笑傲江湖");
              //  values.put("imgId", R.drawable.first);
                //values.put("author", "徐克");
               // db.insert("movies",null,values);
            }
        });

    }
}
