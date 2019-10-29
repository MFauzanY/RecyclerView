package com.example.reclyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaAdapter adapter;
    private ArrayList<keluarga>keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recylerview);
        adapter = new keluargaAdapter(keluargaArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Sigit Adibrata","Bapak", R.drawable.bapak));
        keluargaArrayList.add(new keluarga("Nunung Suproyatin", "Ibu", R.drawable.mama));
        keluargaArrayList.add(new keluarga("Muhammad Fauzan Yunianto","Anak ke-1", R.drawable.fotoku));
        keluargaArrayList.add(new keluarga("Fauziah Sukma Febrianti","Anak ke-2", R.drawable.nesa));
    }
}
