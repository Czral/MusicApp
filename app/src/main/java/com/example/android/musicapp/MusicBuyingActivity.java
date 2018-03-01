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

        //Arraylist setting items.
        musicLink.add(new MusicBuy("AMAZON", "http://www.amazon.com/MP3-Music-Download/b/ref=sa_menu_dmusic2?ie=UTF8&node=163856011"));
        musicLink.add(new MusicBuy("eMUSIC", "http://www.emusic.com/"));
        musicLink.add(new MusicBuy("BLEEP", "http://bleep.com/"));
        musicLink.add(new MusicBuy("BOOMKAT", "http://boomkat.com/"));
        musicLink.add(new MusicBuy("NAPSTER", "http://gr.napster.com/"));
        musicLink.add(new MusicBuy("TRACK IT DOWN", "http://www.trackitdown.net/"));

        //Adapter setting.
        MusicBuyAdapter adapterMusic = new MusicBuyAdapter(MusicBuyingActivity.this, musicLink);

        final ListView musicLinkList = findViewById(R.id.music_list_activity);

        musicLinkList.setAdapter(adapterMusic);

        // On Item Click setting.
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

        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playIntent = new Intent(MusicBuyingActivity.this, MainActivity.class);
                startActivity(playIntent);
            }
        });

        ImageView favorite = findViewById(R.id.favorite);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent favoriteIntent = new Intent(MusicBuyingActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

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
