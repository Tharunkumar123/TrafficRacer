package com.example.trafficracer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_IMAGE_URL = "EXTRA_IMAGE_URL";
    ArrayList<DataItems> dataItems;
    private Object EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);



        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        final ActionBar action = getSupportActionBar();
//        action.setHomeAsUpIndicator(R.drawable.ic_menu_back);
//        action.setDisplayHomeAsUpEnabled(true);
        ImageView imageView=findViewById(R.id.back);
        Intent intent = getIntent();

        if (intent != null) {
            final String name;
            name = intent.getStringExtra(EXTRA_NAME);
            int image = intent.getIntExtra(EXTRA_IMAGE_URL, 0);

            CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
            collapsingToolbar.setTitle(name);
            loadBackdrop(image);
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v2=new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(v2);
            }
        });


    }

    private void loadBackdrop(int image) {
        final ImageView imageView = findViewById(R.id.backdrop);

        Glide.with(this)
                .load(image)
                .placeholder(R.drawable.steve_mama)
                .apply(RequestOptions.centerCropTransform())
                .into(imageView);
    }


}
