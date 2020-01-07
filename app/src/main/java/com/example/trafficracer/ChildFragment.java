package com.example.trafficracer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




import java.util.ArrayList;

public class ChildFragment extends Fragment {
    ArrayList<DataItems> dataItems;
    Context context;
    LinearLayoutManager linearLayoutManager;


    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.dummy, container, false);

        RecyclerView rv_data= rootView.findViewById(R.id.recycler_view1);
        dataItems=new ArrayList<>();


        dataItems.add(new DataItems("Steve Jobs","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.steve_mama));
        dataItems.add(new DataItems("Harry","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.burgerking));
        dataItems.add(new DataItems("Mark","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.kfc));
        dataItems.add(new DataItems("Virat Kohli","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.mcdonalds));
        dataItems.add(new DataItems("MS Dhoni","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.dominos));
        dataItems.add(new DataItems("Suresh Raina","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.steve_mama));
        dataItems.add(new DataItems("Sachin Tendulkar","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.burgerking));
        dataItems.add(new DataItems("John Wick","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.kfc));
        dataItems.add(new DataItems("Steve Jobs","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.mcdonalds));
        dataItems.add(new DataItems("Narendhra Modi","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.dominos));
        dataItems.add(new DataItems("Jack Sparrow","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.steve_mama));
        dataItems.add(new DataItems("Narendhra Modi","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.burgerking));
        dataItems.add(new DataItems("Percy Jackson","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.kfc));
        dataItems.add(new DataItems("Mike Pen","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.mcdonalds));
        dataItems.add(new DataItems("Olympus","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.dominos));
        dataItems.add(new DataItems("Steve Jobs","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.steve_mama));
        dataItems.add(new DataItems("Potter","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.burgerking));
        dataItems.add(new DataItems("Mike Pen","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.kfc));
        dataItems.add(new DataItems("Narendhra Modi","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.mcdonalds));
        dataItems.add(new DataItems("Mike Pen","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.dominos));
        dataItems.add(new DataItems("Harry","Hi Alex,How is it going? I hope every thing is ok","2h",R.drawable.steve_mama));


        linearLayoutManager =new LinearLayoutManager(getActivity());
        CustomAdaptor objCustomAdaptor = new CustomAdaptor(dataItems);
        rv_data.setLayoutManager(linearLayoutManager);
        rv_data.setAdapter(objCustomAdaptor);

        return rootView;
    }

}
