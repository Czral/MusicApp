package com.example.android.musicapp;

import android.content.Intent;
import android.database.Cursor;
import android.media.MediaMetadata;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.MediaScannerConnection;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//Sets Media player.
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Media player initialiazing song.
        song = MediaPlayer.create(MainActivity.this, R.raw.master_of_puppets);

        // Play button
        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Start song.
                song.start();
            }
        });

        // Pause button.
        ImageView pause = findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Pause song.
                song.pause();
            }
        });

        // Stop button.
        ImageView stop = findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Stop song.
                song.stop();
            }
        });

        // Playlist button.
        ImageView playlist = findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Open playlist.
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);

            }
        });

        // Buy music button.
        ImageView link = findViewById(R.id.buy);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Open Buy Music tab.
                Intent linkIntent = new Intent(MainActivity.this, MusicBuyingActivity.class);
                startActivity(linkIntent);
            }
        });

        // Favorite button.
        ImageView favorite = findViewById(R.id.favorite);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open favorite.
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);

            }
        });


        // Title text setting.
        TextView titleSong = findViewById(R.id.title_song);
        titleSong.setText(getString(R.string.title) + " " + "Master Of Puppets");

        // Album text setting.
        TextView albumSong = findViewById(R.id.album_song);
        albumSong.setText(getString(R.string.album) + " " + "Master Of Puppets");

        // Artist text setting.
        TextView artistSong = findViewById(R.id.artist_song);
        artistSong.setText(getString(R.string.artist) + " " + "Metallica");

        // Year text setting.
        TextView yearSong = findViewById(R.id.year_song);
        yearSong.setText(getString(R.string.year) + " " + "1986");

        // Number track setting.
        TextView numberSong = findViewById(R.id.number_song);
        numberSong.setText(getString(R.string.track_number) + " " + "2");


    }


}
