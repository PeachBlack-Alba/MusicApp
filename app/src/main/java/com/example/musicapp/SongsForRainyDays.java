package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsForRainyDays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Memories", "Ayra Star"));
        songs.add( new Song ("Free my mind", "Omah Lay"));
        songs.add(new Song ("Play", "Alewya"));
        songs.add(new Song ("Curame", "Rauw Alejandro"));
        songs.add(new Song ("Replay", "Tems"));
        songs.add(new Song("Santorini coffee", "Melvitto"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button playNext = findViewById(R.id.playNext);

        playNext.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent rainy = new Intent(SongsForRainyDays.this, KitchenActivity.class);

                startActivity(rainy);
            }
        });

    }

}

