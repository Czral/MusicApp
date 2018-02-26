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
                if (i == 0) {
                    Intent openLink = new Intent(Intent.ACTION_VIEW);
                    openLink.setData(Uri.parse("http://www.amazon.com/MP3-Music-Download/b/ref=sa_menu_dmusic2?ie=UTF8&node=163856011"));
                    startActivity(openLink);
                }

                if (i == 1) {
                    Intent openLink = new Intent(Intent.ACTION_VIEW);
                    openLink.setData(Uri.parse("http://www.emusic.com/"));
                    startActivity(openLink);

                }

                if (i == 2) {
                    Intent openLink = new Intent(Intent.ACTION_VIEW);
                    openLink.setData(Uri.parse("http://bleep.com/"));
                    startActivity(openLink);
                }

                if (i == 3) {
                    Intent openLink = new Intent(Intent.ACTION_VIEW);
                    openLink.setData(Uri.parse("http://boomkat.com/"));
                    startActivity(openLink);

                }

                if (i == 4) {
                    Intent openLink = new Intent(Intent.ACTION_VIEW);
                    openLink.setData(Uri.parse("http://gr.napster.com/"));
                    startActivity(openLink);
                }

                if (i == 5) {
                    Intent openLink = new Intent(Intent.ACTION_VIEW);
                    openLink.setData(Uri.parse("http://www.trackitdown.net/"));
                    startActivity(openLink);

                }
            }
        });





}

}
