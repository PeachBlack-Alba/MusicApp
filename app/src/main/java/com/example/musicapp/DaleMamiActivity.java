package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class DaleMamiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Rico Rico", "Mis Nina"));
        songs.add( new Song ("Como un bebe", "J Balvin"));
        songs.add(new Song ("Titi me pregunto", "Bad Bunny"));
        songs.add(new Song ("Yo perreo sola", "Bad Bunny"));
        songs.add(new Song ("Punto 40", "Rauw Alejandro"));
        songs.add(new Song("Mariposa", "isabella Lovestory"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button playNext = findViewById(R.id.playNext);

        playNext.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent favoriteSongs = new Intent(DaleMamiActivity.this, RosiActivity.class);

                startActivity(favoriteSongs);
            }
        });

    }

}
