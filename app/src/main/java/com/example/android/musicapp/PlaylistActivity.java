package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.android.musicapp.databinding.ActivityPlaylistBinding;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityPlaylistBinding binding = ActivityPlaylistBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        setContentView(root);

        ArrayList<Song> songs = new ArrayList<>();

        // Playlist Arraylist setting items.
        songs.add(new Song(getString(R.string.master_of_puppets), getString(R.string.master_of_puppets), getString(R.string.metallica), 1986, 2));
        songs.add(new Song(getString(R.string.exercises_in_futility_vi), getString(R.string.exercises_in_futility), getString(R.string.mgla), 2015, 6));
        songs.add(new Song(getString(R.string.wound_upon_wound), getString(R.string.ad_majorem_sathanas_gloriam), getString(R.string.gorgoroth), 2006, 1));
        songs.add(new Song(getString(R.string.future_world), getString(R.string.keeper_of_the_seven_keys_i), getString(R.string.helloween), 1987, 6));
        songs.add(new Song(getString(R.string.beneath_the_burial_surface), getString(R.string.moon_in_scorpio), getString(R.string.limbonic_art), 1996, 1));

        SongAdapter adapter = new SongAdapter(songs);

        binding.listSong.setLayoutManager(new LinearLayoutManager(this));

        // ListView setting Adapter.
        binding.listSong.setAdapter(adapter);

        binding.play.setOnClickListener(view -> {

            Intent playIntent = new Intent(PlaylistActivity.this, MainActivity.class);
            startActivity(playIntent);

        });

        binding.buy.setOnClickListener(view -> {

            Intent buyIntent = new Intent(PlaylistActivity.this, MusicBuyingActivity.class);
            startActivity(buyIntent);
        });

        binding.favorite.setOnClickListener(view -> {

            Intent favoriteIntent = new Intent(PlaylistActivity.this, FavoriteActivity.class);
            startActivity(favoriteIntent);
        });

    }
}
