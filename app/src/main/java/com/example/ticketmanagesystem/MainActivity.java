package com.example.ticketmanagesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ticketmanagesystem.entity.User;
import com.example.ticketmanagesystem.util.ACache;

public class MainActivity extends AppCompatActivity {
      Button signin_button;
      EditText account;
      EditText password;
      Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin_button=findViewById(R.id.signin_button);
        account=findViewById(R.id.account);
        //修改光标起始位置
        account.setSelection(account.getText().length());
        password=findViewById(R.id.password);
        password.setSelection(password.getText().length());
        login_button=findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String acc=  account.getText().toString().trim();
             String pass=password.getText().toString().trim();
             if(TextUtils.isEmpty(acc)||TextUtils.isEmpty(pass)){
                 Toast.makeText(getBaseContext(), "账号和密码不得为空",Toast.LENGTH_SHORT).show();
             }
             //多个activity共享sp
             /**  SharedPreferences prefs= getSharedPreferences("config",MODE_PRIVATE);
                String s=prefs.getString("account","value");
                String t=prefs.getString("password","value");*/
                ACache aCache=ACache.get(getBaseContext());
                User user1= (User) aCache.getAsObject("user");
                if(user1!=null && acc.equals(user1.getAccount())&&pass.equals(user1.getPassword())){
                    if(user1.getType()==1){
                        Intent intent=new Intent(MainActivity.this,ManageActivity.class);
                        startActivity(intent);
                    }
                    if(user1.getType()==2){
                        Intent intent=new Intent(MainActivity.this,infoActivity.class);
                        startActivity(intent);
                    }
                }



            }
        });
        signin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             Intent intent=new Intent(MainActivity.this, SigninAcvitity.class);
             startActivity(intent);
            }
        });

    }


}
