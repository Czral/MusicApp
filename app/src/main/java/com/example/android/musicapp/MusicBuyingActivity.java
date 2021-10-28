package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.android.musicapp.databinding.ActivityMusicBuyingBinding;

import java.util.ArrayList;

public class MusicBuyingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMusicBuyingBinding binding = ActivityMusicBuyingBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();
        setContentView(root);

        ArrayList<MusicBuy> musicLink = new ArrayList<>();

        musicLink.add(new MusicBuy(getString(R.string.amazon), getString(R.string.amazon_link)));
        musicLink.add(new MusicBuy(getString(R.string.emusic), getString(R.string.emusic_link)));
        musicLink.add(new MusicBuy(getString(R.string.bleep), getString(R.string.bleep_link)));
        musicLink.add(new MusicBuy(getString(R.string.boomkat), getString(R.string.boomkat_link)));
        musicLink.add(new MusicBuy(getString(R.string.napster), getString(R.string.napster_link)));
        musicLink.add(new MusicBuy(getString(R.string.track_it_down), getString(R.string.track_it_down_link)));

        MusicBuyAdapter adapterMusic = new MusicBuyAdapter(musicLink);

        binding.musicRecyclerViewBuy.setLayoutManager(new LinearLayoutManager(this));
        binding.musicRecyclerViewBuy.setAdapter(adapterMusic);

        binding.play.setOnClickListener(view -> {

            Intent playIntent = new Intent(MusicBuyingActivity.this, MainActivity.class);
            startActivity(playIntent);
        });

        binding.favorite.setOnClickListener(view -> {

            Intent favoriteIntent = new Intent(MusicBuyingActivity.this, FavoriteActivity.class);
            startActivity(favoriteIntent);
        });

        binding.playlist.setOnClickListener(view -> {

            Intent playlistIntent = new Intent(MusicBuyingActivity.this, PlaylistActivity.class);
            startActivity(playlistIntent);
        });

    }

}
