package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.android.musicapp.databinding.ActivityPlaylistBinding;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityPlaylistBinding binding = ActivityPlaylistBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        setContentView(root);

        ArrayList<Song> favorite = new ArrayList<>();

        // Arraylist setting items.
        favorite.add(new Song(getString(R.string.exercises_in_futility_vi), getString(R.string.exercises_in_futility), getString(R.string.mgla), 2015, 6));
        favorite.add(new Song(getString(R.string.beneath_the_burial_surface), getString(R.string.moon_in_scorpio), getString(R.string.limbonic_art), 1996, 1));

        SongAdapter adapter = new SongAdapter(favorite);

        binding.listSong.setLayoutManager(new LinearLayoutManager(this));
        binding.listSong.setAdapter(adapter);

        binding.play.setImageResource(R.drawable.play);
        binding.play.setOnClickListener(view -> {

            Intent playIntent = new Intent(FavoriteActivity.this, MainActivity.class);
            startActivity(playIntent);
        });

        binding.favorite.setImageResource(R.drawable.playlist);
        binding.favorite.setOnClickListener(view -> {

            Intent playlistIntent = new Intent(FavoriteActivity.this, PlaylistActivity.class);
            startActivity(playlistIntent);
        });

        binding.buy.setOnClickListener(view -> {

            Intent buyIntent = new Intent(FavoriteActivity.this, MusicBuyingActivity.class);
            startActivity(buyIntent);
        });

    }
}
