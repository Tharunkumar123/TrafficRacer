package com.example.trafficracer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CustomAdaptor1 extends RecyclerView.Adapter<CustomAdaptor1.ViewHolder>{
    private ArrayList<DataItems1> dataItems1;
    CustomAdaptor1(ArrayList<DataItems1> dataItems1){
        this.dataItems1=dataItems1;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment22, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {


        DataItems1 objDataItems1= dataItems1.get(position);
        holder.title.setText(objDataItems1.title);
        holder.content.setText(objDataItems1.content);
        holder.time.setText(objDataItems1.time);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, ThirdActivity.class);
                intent.putExtra(ThirdActivity.EXTRA_NAME, dataItems1.get(holder.getAdapterPosition()).title);
                intent.putExtra(ThirdActivity.EXTRA_IMAGE_URL, dataItems1.get(holder.getAdapterPosition()).poster);
                context.startActivity(intent);
            }
        });
//            holder.poster.setImageDrawable(ContextCompat.getDrawable(holder.poster.getContext(),objDataItems1.poster));
        Glide.with(holder.poster.getContext())
                .load(objDataItems1.poster)
                .apply(RequestOptions.circleCropTransform())
                .into(holder.poster);
    }


    @Override
    public int getItemCount() {
        return dataItems1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView content;
        TextView time;
        ImageView poster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView);
            content = itemView.findViewById(R.id.textView3);
            time = itemView.findViewById(R.id.textView4);
            poster = itemView.findViewById(R.id.imageView);
        }
    }
}

