package com.example.ticketmanagesystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ticketmanagesystem.data.Concert;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class changeConcertActivity extends AppCompatActivity {
    private Button confirm;
    DataHelper helper;
    private EditText changeConcert;
    private EditText changeTime;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_concert);
        confirm=findViewById(R.id.confirm);
        changeConcert=findViewById(R.id.changeConcert);
        changeTime=findViewById(R.id.changeTime);
        helper=new DataHelper(this);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String concerta=changeConcert.getText().toString().trim();
                String time=changeTime.getText().toString().trim();
                int id=getIntent().getIntExtra("id",0);
                Concert concert=new Concert();
                concert.setConcertName(concerta);
                concert.setShowTime(time);
                concert.set_ID(id);
                helper.updateConcertById(concert);
                Toast.makeText(changeConcertActivity.this,"修改成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
