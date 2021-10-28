package com.example.android.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.musicapp.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        setContentView(root);

        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.saint);

        binding.play.setOnClickListener(view -> {

            // Start song.
            mediaPlayer.start();
        });

        binding.pause.setOnClickListener(view -> {

            // Pause song.
            mediaPlayer.pause();
        });

        binding.stop.setOnClickListener(view -> {

            // Stop song.
            mediaPlayer.stop();
        });

        binding.playlist.setOnClickListener(view -> {

            // Open playlist.
            Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
            startActivity(playlistIntent);

        });

        binding.buy.setOnClickListener(view -> {

            // Open Buy Music tab.
            Intent linkIntent = new Intent(MainActivity.this, MusicBuyingActivity.class);
            startActivity(linkIntent);
        });

        binding.favorite.setOnClickListener(view -> {

            //Open favorite.
            Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
            startActivity(favoriteIntent);

        });

        // Title text setting.
        String titleText = String.format(Locale.US, getString(R.string.title), "Master Of Puppets");
        binding.titleSong.setText(titleText);

        // Album text setting.
        String albumText = String.format(Locale.US, getString(R.string.album), "Master Of Puppets");
        binding.albumSong.setText(albumText);

        // Artist text setting.
        String artistText = String.format(Locale.US, getString(R.string.artist), "Metallica");
        binding.artistSong.setText(artistText);

        // Year text setting.
        String yearText = String.format(Locale.US, getString(R.string.year), 1986);
        binding.yearSong.setText(yearText);

        // Number track setting.
        String numberText = String.format(Locale.US, getString(R.string.track_number), 2);
        binding.numberSong.setText(numberText);

    }

}