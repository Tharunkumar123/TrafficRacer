package com.example.trafficracer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChildFragment1 extends Fragment {
    ArrayList<DataItems1> dataItems1;
    Context context;
    LinearLayoutManager linearLayoutManager;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable  ViewGroup container,@Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.dummy1, container, false);

        RecyclerView rv_data= rootView.findViewById(R.id.recycler_view);
        dataItems1=new ArrayList<>();


        dataItems1.add(new DataItems1("John Wick","Just accepted your invitation","2 hours ago",R.drawable.steve_mama));
        dataItems1.add(new DataItems1("Harry","Just accepted your invitation","2 hours ago",R.drawable.burgerking));
        dataItems1.add(new DataItems1("Mark","Just accepted your invitation","2 hours ago",R.drawable.kfc));
        dataItems1.add(new DataItems1("Virat Kohli","Just accepted your invitation","2 hours ago",R.drawable.dominos));
        dataItems1.add(new DataItems1("MS Dhoni","Just accepted your invitation","2 hours ago",R.drawable.mcdonalds));
        dataItems1.add(new DataItems1("Suresh Raina","Just accepted your invitation","2 hours ago",R.drawable.steve_mama));
        dataItems1.add(new DataItems1("Steve Jobs","Just accepted your invitation","2 hours ago",R.drawable.burgerking));
        dataItems1.add(new DataItems1("Sachin Tendulkar","Just accepted your invitation","2 hours ago",R.drawable.kfc));
        dataItems1.add(new DataItems1("John Wick","Just accepted your invitation","2 hours ago",R.drawable.dominos));
        dataItems1.add(new DataItems1("Harry","Just accepted your invitation","2 hours ago",R.drawable.mcdonalds));
        dataItems1.add(new DataItems1("Potter","Just accepted your invitation","2 hours ago",R.drawable.steve_mama));
        dataItems1.add(new DataItems1("Jack Sparrow","Just accepted your invitation","2 hours ago",R.drawable.burgerking));
        dataItems1.add(new DataItems1("Percy Jackson","Just accepted your invitation","2 hours ago",R.drawable.kfc));
        dataItems1.add(new DataItems1("Olympus","Just accepted your invitation","2 hours ago",R.drawable.dominos));
        dataItems1.add(new DataItems1(" Mike Pen","Just accepted your invitation","2 hours ago",R.drawable.mcdonalds));
        dataItems1.add(new DataItems1("Narendhra Modi","Just accepted your invitation","2 hours ago",R.drawable.steve_mama));


        linearLayoutManager =new LinearLayoutManager(getActivity());
        CustomAdaptor1 objCustomAdapter1 = new  CustomAdaptor1(dataItems1);

        rv_data.setLayoutManager(linearLayoutManager);
        rv_data.setAdapter(objCustomAdapter1);

        return rootView;
    }

}
