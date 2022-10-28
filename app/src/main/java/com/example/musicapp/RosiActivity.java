package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class RosiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Bizcochito", "La Rosalia"));
        songs.add( new Song ("La noche de anoche", "La Rosalia"));
        songs.add(new Song ("Candy", "La Rosalia"));
        songs.add(new Song ("Saoko", "La Rosalia"));
        songs.add(new Song ("La combi Versace", "La Rosalia"));
        songs.add(new Song("Con altura", "La Rosalia"));
        songs.add(new Song("Yo x ti, tu x mi", "La Rosalia"));
        songs.add(new Song("Como un G", "La Rosalia"));
        songs.add(new Song("Baghdad", "La Rosalia"));
        songs.add( new Song("Chicken teriyaki", "La Rosalia"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button playNext = findViewById(R.id.playNext);

        playNext.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent rosi = new Intent(RosiActivity.this, SongsForRainyDays.class);

                startActivity(rosi);
            }
        });

    }
}

