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


    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        song = MediaPlayer.create(MainActivity.this, R.raw.master_of_puppets);

        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                song.start();

                if (song.isPlaying()) {

                    song.start();
                }

            }
        });


        ImageView pause = findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                song.pause();
            }
        });

        ImageView stop = findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                song.stop();
                song.reset();
                song.start();
            }
        });


        ImageView playlist = findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);

            }
        });

        TextView titleSong = findViewById(R.id.title_song);
        titleSong.setText("Title: Master Of Puppets");

        TextView albumSong = findViewById(R.id.album_song);
        albumSong.setText("Album: Master Of Puppets");

    }


}
