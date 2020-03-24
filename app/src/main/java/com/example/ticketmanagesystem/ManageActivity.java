package com.example.ticketmanagesystem;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.ticketmanagesystem.Adapters.manager_play_adapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ManageActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    private manager_play_adapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager);
        initWeights();
    }

    private void initWeights() {
        mRecyclerView=findViewById(R.id.mana_rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(ManageActivity.this,
               DividerItemDecoration.VERTICAL_LIST));
        mAdapter=new manager_play_adapter(this);
        //监听点击事件
        mAdapter.setOnItemClickListener(new manager_play_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(ManageActivity.this,"点击第"+(position+1)+"条",
                        Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ManageActivity.this,ManageConcertActivity
                        .class);
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
    }
}
