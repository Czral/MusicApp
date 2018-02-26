package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicBuyingActivity extends AppCompatActivity {


    ArrayList<MusicBuy> musicLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_buy);

        musicLink = new ArrayList<>();

        musicLink.add(new MusicBuy("AMAZON", "https://www.amazon.com/MP3-Music-Download/b/ref=sa_menu_dmusic2?ie=UTF8&node=163856011"));

        MusicBuyAdapter adapterMusic = new MusicBuyAdapter(MusicBuyingActivity.this, musicLink);

        ListView musicLinkList = findViewById(R.id.music_list_activity);

        musicLinkList.setAdapter(adapterMusic);


    }




}
