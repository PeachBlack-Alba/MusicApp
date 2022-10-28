package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class KitchenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Sultanas de Mercadillo", "Ojos de brujo"));
        songs.add( new Song ("Me gusta", "Queralt Lahoz"));
        songs.add(new Song ("Bandido", "Azucar Moreno"));
        songs.add(new Song ("Como el agua", "Camaron de la isla"));
        songs.add(new Song ("Volver", "Estrella Morente"));
        songs.add(new Song("Ojitos negros", "Sergio Contreras"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button playNext = findViewById(R.id.playNext);

        playNext.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent workout = new Intent(KitchenActivity.this, DaleMamiActivity.class);

                startActivity(workout);
            }
        });

    }
}

