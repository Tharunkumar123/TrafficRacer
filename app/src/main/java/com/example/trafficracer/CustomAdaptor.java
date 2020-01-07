package com.example.trafficracer;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.ViewHolder>{
    private ArrayList<DataItems> dataItems;
    CustomAdaptor(ArrayList<DataItems> dataItems){
        this.dataItems=dataItems;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment12, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position){

        DataItems objDataItems= dataItems.get(position);
        holder.title.setText(objDataItems.title);
        holder.content.setText(objDataItems.content);
        holder.time.setText(objDataItems.time);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, ThirdActivity.class);
                intent.putExtra(ThirdActivity.EXTRA_NAME, dataItems.get(holder.getAdapterPosition()).title);
                intent.putExtra(ThirdActivity.EXTRA_IMAGE_URL, dataItems.get(holder.getAdapterPosition()).poster);
                context.startActivity(intent);
            }
        });
//        holder.poster.setImageDrawable(ContextCompat.getDrawable(holder.poster.getContext(),objDataItems.poster));
        Glide.with(holder.poster.getContext())
                .load(objDataItems.poster)
                .apply(RequestOptions.circleCropTransform())
                .into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView content;
        TextView time;
        ImageView poster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView);
            content = itemView.findViewById(R.id.textView4);
            time = itemView.findViewById(R.id.textView3);
            poster = itemView.findViewById(R.id.imageView);
        }
    }
}