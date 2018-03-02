package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    // ArrayList naming.
    ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        songs = new ArrayList<>();

        // Playlist Arraylist setting items.
        songs.add(new Song(getString(R.string.master_of_puppets), getString(R.string.master_of_puppets), getString(R.string.metallica), 1986, 2));
        songs.add(new Song(getString(R.string.exercises_in_futility_vi), getString(R.string.exercises_in_futility), getString(R.string.mgla), 2015, 6));
        songs.add(new Song(getString(R.string.wound_upon_wound), getString(R.string.ad_majorem_sathanas_gloriam), getString(R.string.gorgoroth), 2006, 1));
        songs.add(new Song(getString(R.string.future_world), getString(R.string.keeper_of_the_seven_keys_i), getString(R.string.helloween), 1987, 6));
        songs.add(new Song(getString(R.string.beneath_the_burial_surface), getString(R.string.moon_in_scorpio), getString(R.string.limbonic_art), 1996, 1));

        // Custom Adapter definition.
        SongAdapter adapter = new SongAdapter(PlaylistActivity.this, songs);

        // ListView definition.
        ListView songList = (ListView) findViewById(R.id.list_song);

        // ListView setting Adapter.
        songList.setAdapter(adapter);

        // Opens Now Playing screen.
        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(playIntent);

            }
        });

        // Opens Music Buying screen.
        ImageView buy = findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent buyIntent = new Intent(PlaylistActivity.this, MusicBuyingActivity.class);
                startActivity(buyIntent);
            }
        });

        // Opens Favorites screen.
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
