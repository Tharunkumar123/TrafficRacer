package com.example.trafficracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        TextView v2=findViewById(R.id.textView4);


        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent second= new Intent(LoginPage.this, RegisterActivity.class);
                startActivity(second);
            }
        });
        Button v3=findViewById(R.id.imageButton2);


        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent second= new Intent(LoginPage.this, SecondActivity.class);
                startActivity(second);
            }
        });
    }
}
