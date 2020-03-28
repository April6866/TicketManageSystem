package com.example.ticketmanagesystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ticketmanagesystem.data.Movie;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class changeMovieActivity  extends AppCompatActivity {
   private EditText changeName;

   private EditText changeAuthor;

   private Button confirm1;
   DataHelper helper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        helper=new DataHelper(this);
        setContentView(R.layout.change_movie);
        changeName=findViewById(R.id.changeName);
        changeAuthor=findViewById(R.id.changeAuthor);
        confirm1=findViewById(R.id.confirm1);

         confirm1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String name=changeName.getText().toString().trim();
                 String author=changeAuthor.getText().toString().trim();
                 int id=getIntent().getIntExtra("id",0);
                 Movie movie=new Movie();
                 movie.setAuthor(author);
                 movie.setMovieName(name);
                 movie.set_ID(id);
                 helper.updateMovieById(movie);
                 Toast.makeText(changeMovieActivity.this,"修改成功",Toast.LENGTH_SHORT).show();
             }
         });
    }
}
