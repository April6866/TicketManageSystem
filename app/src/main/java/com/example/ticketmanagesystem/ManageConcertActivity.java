package com.example.ticketmanagesystem;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ticketmanagesystem.Adapters.manage_concert_adapter;
import com.example.ticketmanagesystem.Adapters.manager_play_adapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ManageConcertActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    manage_concert_adapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concert_manager);
        init();
    }

    private void init() {
        mRecyclerView=findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(ManageConcertActivity.this,
                DividerItemDecoration.VERTICAL_LIST));
        mAdapter=new manage_concert_adapter(this);
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
    }
}
