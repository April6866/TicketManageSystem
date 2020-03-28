package com.example.ticketmanagesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ticketmanagesystem.Adapters.custom_concert_adapter;
import com.example.ticketmanagesystem.data.Concert;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class customConcertActivity extends AppCompatActivity {
    private RecyclerView mRecyclerview;
    custom_concert_adapter mAdapter;
    private List<Concert> list;
    DataHelper helper;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concert_custom);
        helper = new DataHelper(this);
        int id=getIntent().getIntExtra("id",0);
        list = helper.queryConcertByMovieId(id);
        init();
    }

    private void init() {
        mRecyclerview=findViewById(R.id.rv);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this,    LinearLayoutManager.VERTICAL, false));
        mRecyclerview.addItemDecoration(new DividerItemDecoration(customConcertActivity.this,
                DividerItemDecoration.VERTICAL_LIST));
        mAdapter = new custom_concert_adapter(this);
        mAdapter.setList(list);
        mRecyclerview.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new custom_concert_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent=new Intent(customConcertActivity.this, SeatcustomAcvitity.class);

                startActivity(intent);
            }
        });
    }
}
