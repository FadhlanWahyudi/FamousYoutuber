package com.example.famousyoutuber;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class ListYoutuber extends AppCompatActivity {

    RecyclerView rvfav;
    private MovieAdapter movieAdapter;


    ArrayList<ModelMovie> arrayList;
    private String[] id = {"ATTA HALILINTAR",
            "JESS NO LIMIT",
            "RIA RICIS", "MIAWAUG", "YUDIST ARDHANA", "SAIIH HALILINTAR",
            "RRQ LEMON", "THORIQ HALILINTAR", "FATEH HALILINTAR", "YOSHIOLO"};

    private String[] nama_nama = {"ATTA HALILINTAR", "JESS NO LIMIT", "RIA RICIS", "MIAWAUG", "YUDIST ARDHANA", "SAIIH HALILINTAR",
            "RRQ LEMON", "THORIQ HALILINTAR", "FATEH HALILINTAR", "YOSHIOLO"};

    private int[] gambar = {R.drawable.atta, R.drawable.jess, R.drawable.riaricis, R.drawable.miaw, R.drawable.yudist,
            R.drawable.saih, R.drawable.lemon, R.drawable.thoriq, R.drawable.fateh, R.drawable.yosh};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_youtuber);

        arrayList = new ArrayList<>();
        rvfav = findViewById(R.id.rvfav);
        setData();
        movieAdapter = new MovieAdapter(arrayList);
        rvfav.setLayoutManager(new LinearLayoutManager(this));
        rvfav.setAdapter(movieAdapter);


    }


    private void setData() {
        int count = 0;
        for (String id : id) {
            arrayList.add(new ModelMovie(id, nama_nama[count], gambar[count]));
            count++;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                startActivity(new Intent(ListYoutuber.this,AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);

    }
}
