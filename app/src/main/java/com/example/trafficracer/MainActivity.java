package com.example.trafficracer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rd.PageIndicatorView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private SliderAdapter sliderAdapter;
    private WormDotsIndicator dotsIndicator;
    private ImageView mPager;
    private PageIndicatorView pageIndicatorView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager1);
        pageIndicatorView =findViewById(R.id.pageIndicatorView);
        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
        pageIndicatorView.setViewPager(viewPager);
//dotsIndicator.setStrokeDotsIndicatorColor(R.color.grey);
        mPager = (ImageView) findViewById(R.id.HView);
        mPager.setBackgroundResource(R.drawable.background1);
        TextView v3 = findViewById(R.id.textView2);


        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent second = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(second);
            }
        });

    }


    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };


}
