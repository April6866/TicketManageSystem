package com.example.ticketmanagesystem;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.ticketmanagesystem.Adapters.custom_play_adapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class infoActivity extends AppCompatActivity {
    custom_play_adapter mAdapter;
    RecyclerView mRecyclerView;
   //  FrameLayout frameLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        initWeights();
    }

    private void initWeights() {
       // frameLayout=findViewById(R.id.fl);
        mRecyclerView = findViewById(R.id.custom_rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(infoActivity.this,
                DividerItemDecoration.VERTICAL_LIST));
        mAdapter = new custom_play_adapter(this);
        mRecyclerView.setAdapter(mAdapter);
        //监听点击事件
        mAdapter.setOnItemClickListener(new custom_play_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(infoActivity.this, "点击第" + (position + 1) + "条",
                        Toast.LENGTH_SHORT).show();
              /** FragmentManager manager=getFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
               transaction.add(R.id.fl, new concert_costumer());
                transaction.commit();*/
                Intent intent=new Intent(infoActivity.this,customConcertActivity.class);
                startActivity(intent);
            }
        });
    }
}