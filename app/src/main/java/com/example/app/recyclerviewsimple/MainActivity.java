package com.example.app.recyclerviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList contries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        senddata();


    }
    private void senddata(){
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        contries =new ArrayList<>();
        contries.add("India");
        contries.add("Australia");
        contries.add("England");
        contries.add("Canada");
        contries.add("South Africa");
        contries.add("North America");
        contries.add("USA");
        contries.add("India");
        contries.add("Australia");
        contries.add("England");
        contries.add("Canada");
        contries.add("South Africa");
        contries.add("North America");
        contries.add("USA");
        contries.add("India");
        contries.add("Australia");
        contries.add("England");
        contries.add("Canada");
        contries.add("South Africa");
        contries.add("North America");
        contries.add("USA");
        RecyclerView.Adapter adapter=new adapter(contries);
        recyclerView.setAdapter(adapter);

    }
}
