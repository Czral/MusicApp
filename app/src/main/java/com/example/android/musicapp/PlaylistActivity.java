package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        songs = new ArrayList<>();

        songs.add(new Song("Master Of Puppets", "Master Of Puppets", "Metallica", 1986, 2));

        songs.add(new Song("Exercises In Futility VI", "Exercises In Futility", "Mgla", 2015, 6));

        songs.add(new Song("Wound Upon Wound", "Ad Majorem Sathanas Gloriam", "Gorgoroth", 2006, 1));

        songs.add(new Song("Future World", "Keeper Of The Seven Keys I", "Helloween", 1987, 6));

        songs.add(new Song("Beneath The Burial Surface", "Moon In The Scorpio", "Limbonic Art", 1996, 1));


        SongAdapter adapter = new SongAdapter(PlaylistActivity.this, songs);

        ListView songList = (ListView) findViewById(R.id.list_song);

        songList.setAdapter(adapter);

        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(playIntent);

            }
        });

        ImageView buy = findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent buyIntent = new Intent(PlaylistActivity.this, MusicBuyingActivity.class);
                startActivity(buyIntent);
            }
        });

        ImageView favorite = findViewById(R.id.favorite);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent favoriteIntent = new Intent(PlaylistActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });


    }
}
