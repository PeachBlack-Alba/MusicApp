package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView rosi = (TextView) findViewById(R.id.rosi);

        rosi.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rosiIntent = new Intent(MainActivity.this, RosiActivity.class);

                startActivity(rosiIntent);
            }
        });

        TextView songsforrainydays = (TextView) findViewById(R.id.songsForRainyDays);

        songsforrainydays.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsForRainyDaysIntent = new Intent(MainActivity.this, SongsForRainyDays.class);

                startActivity(songsForRainyDaysIntent);
            }
        });

        TextView kitchen = (TextView) findViewById(R.id.kitchenSongs);

        kitchen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kitchenIntent = new Intent(MainActivity.this, KitchenActivity.class);

                startActivity(kitchenIntent);
            }
        });

        TextView daleMami = (TextView) findViewById(R.id.daleMami);

        daleMami.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daleMamiIntent = new Intent(MainActivity.this, DaleMamiActivity.class);

                startActivity(daleMamiIntent);
            }
        });
    }

}

