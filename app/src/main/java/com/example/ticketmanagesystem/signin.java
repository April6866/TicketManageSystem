package com.example.ticketmanagesystem;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ticketmanagesystem.R;
import com.example.ticketmanagesystem.entity.User;

import java.io.FileNotFoundException;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class signin extends AppCompatActivity {
    CheckBox manager;
    CheckBox customer;
    EditText account;
    EditText password;
    EditText pass_confirm;
    Button signin;

   public static SharedPreferences sharedPreferences;
    public ACache aCache;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        account = findViewById(R.id.account);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.signin);
        pass_confirm = findViewById(R.id.pass_conform);
        manager=findViewById(R.id.check_manager);
        customer=findViewById(R.id.check_customer);


            signin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final SharedPreferences.Editor editor;
                    String acc = account.getText().toString().trim();
                    String pass = password.getText().toString().trim();
                    String pass_conf = pass_confirm.getText().toString().trim();
                    if(!pass_conf.equals(pass)){
                        Toast.makeText(getBaseContext(),"密码不一致，请重输",Toast.LENGTH_SHORT).show();
                        return;
                    }
                 /**   sharedPreferences = getSharedPreferences("config", MODE_PRIVATE);
                    if(manager.isChecked()){
                       manager_account=acc;
                       manager_password=pass;
                    }
                    if(customer.isChecked()){
                        user_account=acc;
                        user_password=pass;

                    }


                    //将用户名和密码存起来
                    //获取编辑器
                    editor = sharedPreferences.edit();
                    //写内容
                    editor.putString("account", acc);
                    editor.putString("password", pass);
                    editor.commit();

                    editor.apply();*/
                 User user=new User();

                 if(manager.isChecked()){
                     user.setType(1);
                     user.setAccount(acc);
                     user.setPassword(pass);
                      aCache= ACache.get(getBaseContext());
                     
                         aCache.put("user",user);
                         User user1= (User) aCache.getAsObject("user");

                 }

                 if(customer.isChecked()){
                     user.setType(2);
                     user.setAccount(acc);
                     user.setPassword(pass);
                      aCache= ACache.get(getBaseContext());
                         aCache.put("user",user);
                         User user1= (User) aCache.getAsObject("user");

                 }
                    Intent intent = new Intent(signin.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }

}
