package com.example.android.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //Sets Media player.
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Media player initialiazing song.
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.master_of_puppets);

        // Play button
        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Start song.
                mediaPlayer.start();

            }
        });

        // Pause button.
        ImageView pause = findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Pause song.
                mediaPlayer.pause();
            }
        });

        // Stop button.
        ImageView stop = findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Stop song.
                mediaPlayer.stop();
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
        String titleText = String.format(Locale.US, getString(R.string.title), "Master Of Puppets");
        TextView titleSong = findViewById(R.id.title_song);
        titleSong.setText(titleText);

        // Album text setting.
        String albumText = String.format(Locale.US, getString(R.string.album), "Master Of Puppets");
        TextView albumSong = findViewById(R.id.album_song);
        albumSong.setText(albumText);

        // Artist text setting.
        String artistText = String.format(Locale.US, getString(R.string.year), "Metallica");
        TextView artistSong = findViewById(R.id.artist_song);
        artistSong.setText(artistText);

        // Year text setting.
        String yearText = String.format(Locale.US, getString(R.string.year), "1986");
        TextView yearSong = findViewById(R.id.year_song);
        yearSong.setText(yearText);

        // Number track setting.
        String numberText = String.format(Locale.US, getString(R.string.track_number), "2");
        TextView numberSong = findViewById(R.id.number_song);
        numberSong.setText(numberText);

    }

}