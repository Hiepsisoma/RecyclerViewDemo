package com.example.admin.recyclerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Marvel> mMarvels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        RecyclerView recyclerView = findViewById(R.id.recycler_students);
        mMarvels.add(new Marvel(getString(R.string.title_1), R.drawable.disney_header));
        mMarvels.add(new Marvel(getString(R.string.title_2), R.drawable.avengers));
        mMarvels.add(new Marvel(getString(R.string.title_3), R.drawable.iron_man));
        mMarvels.add(new Marvel(getString(R.string.title_1), R.drawable.disney_header));
        mMarvels.add(new Marvel(getString(R.string.title_2), R.drawable.avengers));
        mMarvels.add(new Marvel(getString(R.string.title_3), R.drawable.iron_man));
        MarvelAdapter marvelAdapter = new MarvelAdapter(mMarvels);
        recyclerView.setAdapter(marvelAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
