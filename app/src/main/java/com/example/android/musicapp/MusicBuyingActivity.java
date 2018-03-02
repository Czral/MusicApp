package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicBuyingActivity extends AppCompatActivity {

    // Arraylist naming.
    ArrayList<MusicBuy> musicLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_buying);

        musicLink = new ArrayList<>();

        //Music Buying Arraylist setting items.
        musicLink.add(new MusicBuy(getString(R.string.amazon), getString(R.string.amazon_link)));
        musicLink.add(new MusicBuy(getString(R.string.emusic), getString(R.string.emusic_link)));
        musicLink.add(new MusicBuy(getString(R.string.bleep), getString(R.string.bleep_link)));
        musicLink.add(new MusicBuy(getString(R.string.boomkat), getString(R.string.boomkat_link)));
        musicLink.add(new MusicBuy(getString(R.string.napster), getString(R.string.napster_link)));
        musicLink.add(new MusicBuy(getString(R.string.track_it_down), getString(R.string.track_it_down_link)));

        // Custom Adapter definition.
        MusicBuyAdapter adapterMusic = new MusicBuyAdapter(MusicBuyingActivity.this, musicLink);

        // ListView definition.
        final ListView musicLinkList = findViewById(R.id.music_list_activity);

        // ListView setting Adapter.
        musicLinkList.setAdapter(adapterMusic);

        // On ItemClick setting (Opens link).
        musicLinkList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Opens links from the ArrayList.
                MusicBuy link = musicLink.get(i);
                Intent openLink = new Intent(Intent.ACTION_VIEW);
                openLink.setData(Uri.parse(link.getMusicLink()));
                startActivity(openLink);

            }
        });
        // Opens Now Playing screen.
        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playIntent = new Intent(MusicBuyingActivity.this, MainActivity.class);
                startActivity(playIntent);
            }
        });

        // Opens Favorites screen
        ImageView favorite = findViewById(R.id.favorite);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent favoriteIntent = new Intent(MusicBuyingActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        // Opens Playlist screen.
        ImageView playlist = findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playlistIntent = new Intent(MusicBuyingActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

    }

}
