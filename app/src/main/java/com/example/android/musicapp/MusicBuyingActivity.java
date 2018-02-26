package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicBuyingActivity extends AppCompatActivity {


    ArrayList<MusicBuy> musicLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_buy);

        musicLink = new ArrayList<>();

        musicLink.add(new MusicBuy("AMAZON", "http://www.amazon.com/MP3-Music-Download/b/ref=sa_menu_dmusic2?ie=UTF8&node=163856011"));
        musicLink.add(new MusicBuy("eMUSIC", "http://www.emusic.com/"));
        musicLink.add(new MusicBuy("BLEEP", "http://bleep.com/"));
        musicLink.add(new MusicBuy("BOOMKAT", "http://boomkat.com/"));
        musicLink.add(new MusicBuy("NAPSTER", "http://gr.napster.com/"));
        musicLink.add(new MusicBuy("TRACK IT DOWN", "http://www.trackitdown.net/"));


        MusicBuyAdapter adapterMusic = new MusicBuyAdapter(MusicBuyingActivity.this, musicLink);

        ListView musicLinkList = findViewById(R.id.music_list_activity);

        musicLinkList.setAdapter(adapterMusic);

        musicLinkList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {

                    Intent openLink = new Intent(Intent.ACTION_VIEW);
                    openLink.setData(Uri.parse("http://www.amazon.com/MP3-Music-Download/b/ref=sa_menu_dmusic2?ie=UTF8&node=163856011"));
                    startActivity(openLink);
                }
            }
        });





}

}
