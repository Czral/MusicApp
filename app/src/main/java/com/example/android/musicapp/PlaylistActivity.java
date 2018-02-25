package com.example.android.musicapp;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        songs = new ArrayList<>();

        songs.add(new Song("Master Of Puppets", "Master Of Puppets", "Metallica", 1986, 2));

        songs.add(new Song("Exercises In Futility VI", "Exercises In Futility", "Mgla", 2015, 6));

        songs.add(new Song("Wound Upon Wound", "Ad Majorem Sathanas Gloriam", "Gorgoroth", 2006, 1));


        SongAdapter adapter = new SongAdapter(PlaylistActivity.this, songs);

        ListView songList = (ListView) findViewById(R.id.list_song);

        songList.setAdapter(adapter);




    }
}
