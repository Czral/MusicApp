package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Song> songs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                songs = new ArrayList<>();

                songs.add(new Song("Freezing Moon", "De Mysteriis Dom Sathanas", "Mayhem", 1993, 2));

                songs.add(new Song("Exercises In Futility VI", "Exercises In Futility", "Mgla", 2015, 6));

                songs.add(new Song("Wound Upon Wound", "Ad Majorem Sathanas Gloriam", "Gorgoroth", 2006, 1));



                SongAdapter adapter = new SongAdapter(MainActivity.this, songs);

                ListView songList = (ListView) findViewById(R.id.list_songs);

                songList.setAdapter(adapter);

                return;


            }
        });



        ImageView playlist = findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                playlistIntent.putExtra("SONGS", songs);
                startActivity(playlistIntent);
            }
        });


    }


}
