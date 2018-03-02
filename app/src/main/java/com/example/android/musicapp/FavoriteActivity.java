package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    //Arraylist naming.
    ArrayList<Song> favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        favorite = new ArrayList<>();

        // Arraylist setting items.
        favorite.add(new Song(getString(R.string.exercises_in_futility_vi), getString(R.string.exercises_in_futility), getString(R.string.mgla), 2015, 6));
        favorite.add(new Song(getString(R.string.beneath_the_burial_surface), getString(R.string.moon_in_scorpio), getString(R.string.limbonic_art), 1996, 1));

        // Custom Adapter setting.
        SongAdapter adapter = new SongAdapter(this, favorite);

        // ListView definition.
        ListView favoriteList = findViewById(R.id.list_song);

        // ListView setting Adapter.
        favoriteList.setAdapter(adapter);

        // Opens Now Playing screen.
        ImageView play = findViewById(R.id.favorite);
        play.setImageResource(R.drawable.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playIntent = new Intent(FavoriteActivity.this, MainActivity.class);
                startActivity(playIntent);
            }
        });

        // Opens Playlist screen.
        ImageView playlist = findViewById(R.id.play);
        playlist.setImageResource(R.drawable.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playlistIntent = new Intent(FavoriteActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Opens Music Buying screen.
        ImageView buy = findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent buyIntent = new Intent(FavoriteActivity.this, MusicBuyingActivity.class);
                startActivity(buyIntent);
            }
        });

    }
}
