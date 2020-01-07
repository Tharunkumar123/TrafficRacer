package com.example.trafficracer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context=context;
    }

    public int[] slide_image = {
            R.drawable.money,
            R.drawable.sgas,
            R.drawable.meetf,
            R.drawable.traff,
            R.drawable.searth1,
    };

    public  String[] slide_heading = {
            "Saving Money",
            "Saving Gasoline",
            "Meet New Friends",
            "Decrease Traffic",
            "Decrease Pollution"
    };

    public String[] slide_descs = {

            "The ability to save money is the cornerstone of building wealth. It's also essential for one's sense of security.",
            "The ability to save money is the cornerstone of building wealth. It's also essential for one's sense of security.",
            "The ability to save money is the cornerstone of building wealth. It's also essential for one's sense of security.",
            "The ability to save money is the cornerstone of building wealth. It's also essential for one's sense of security.",
            "The ability to save money is the cornerstone of building wealth. It's also essential for one's sense of security.",

    };


    @Override
    public int getCount()
    {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view==(ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.fragment1, container,false);

        ImageView imageView=(ImageView) view.findViewById(R.id.imageView2);
        TextView textView=(TextView) view.findViewById(R.id.text_heading);
        TextView textView1=(TextView) view.findViewById(R.id.textView2);

        imageView.setImageResource(slide_image[position]);
        textView.setText(slide_heading[position]);
        textView1.setText(slide_descs[position]);

        container.addView(view);


        return  view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((ConstraintLayout) object);
    }

}