package com.example.ticketmanagesystem;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ticketmanagesystem.Adapters.manage_concert_adapter;
import com.example.ticketmanagesystem.Adapters.manager_play_adapter;
import com.example.ticketmanagesystem.data.Concert;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ManageConcertActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    manage_concert_adapter mAdapter;
    private List<Concert> list;
    private Button addCon;
    int id;
    DataHelper   dataHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concert_manager);
          dataHelper =new DataHelper(this);
        addCon= findViewById(R.id.addCon);

         id=getIntent().getIntExtra("id",0);

        list = dataHelper.queryConcertByMovieId(id);


        init();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        getDataByDb();
        if(mAdapter!=null){
            list=dataHelper.queryConcertByMovieId(id);
            mAdapter.setList(list);
            mAdapter.notifyDataSetChanged();
        }
    }

    private void getDataByDb() {
        list=dataHelper.queryAllConcertData();

    }

    private void init() {
        //getDataByDb();
        mRecyclerView=findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,   LinearLayoutManager.VERTICAL,false));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(ManageConcertActivity.this,
                DividerItemDecoration.VERTICAL_LIST));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter=new manage_concert_adapter(this);
        mAdapter.setList(list);
        //监听点击事件
        mAdapter.setOnItemClickListener(new manage_concert_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(ManageConcertActivity.this,"点击第"+(position+1)+"条",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, final int position) {
                new AlertDialog.Builder(ManageConcertActivity.this)
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

        addCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Concert concert=new Concert();
                mAdapter.addData(0,concert);
            }
        });


    }
}
