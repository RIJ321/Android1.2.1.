package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Values> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add(new Values("1", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("2", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("3", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("4", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("5", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("6", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("7", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("8", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("9", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("10", "asdasd", "aervafds", "vshnl"));
        list.add(new Values("11", "asdasd", "aervafds", "vshnl"));
        init();

    }


    private void init() {
        recyclerView = findViewById(R.id.recycle);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
        adapter.setData(list);
    }
}