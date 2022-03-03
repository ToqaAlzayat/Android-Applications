package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {

    TextView tv_username,tv_password,tv_phone;
    ImageView iv_showIcon;
    static boolean showIcon=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

         tv_username=findViewById(R.id.tv_username);
        tv_password=findViewById(R.id.tv_password);
        tv_phone=findViewById(R.id.tv_phone);

        iv_showIcon=findViewById(R.id.iv_showIcon);
         if(getIntent()!=null)
           {
               tv_username.setText(getIntent().getStringExtra("username"));
               tv_password.setText(getIntent().getStringExtra("password"));
               tv_phone.setText(getIntent().getStringExtra("phone"));

            }
         tv_phone.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+tv_phone.getText().toString()));
                 startActivity(intent);

             }
         });
            iv_showIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(showIcon==false) {
                        tv_password.setInputType(InputType.TYPE_CLASS_TEXT);
                        iv_showIcon.setImageResource(R.drawable.hide);
                    showIcon=true;
                    }
                    else
                    {
                        tv_password.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        iv_showIcon.setImageResource(R.drawable.show);
                        showIcon=false;
                    }
                }
            });
    }
}