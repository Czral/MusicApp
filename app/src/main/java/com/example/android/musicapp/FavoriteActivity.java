package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

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
