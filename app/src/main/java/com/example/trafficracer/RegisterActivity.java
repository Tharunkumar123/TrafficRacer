package com.example.trafficracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView v2=findViewById(R.id.textView8);


        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent second= new Intent(RegisterActivity.this, LoginPage.class);
                startActivity(second);
            }
        });
    }
}
