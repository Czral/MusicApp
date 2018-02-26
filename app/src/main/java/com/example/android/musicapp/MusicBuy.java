package com.example.android.musicapp;

/**
 * Created by XXX on 26-Feb-18.
 */

public class MusicBuy {

    private String mGetMusicSite;
    private String mGetMusicLink;

    public MusicBuy(String getMusicSite, String getMusicLink) {

        mGetMusicSite = getMusicSite;
        mGetMusicLink = getMusicLink;
    }

    public String getMusicSite() {
        return mGetMusicSite;
    }

    public String getMusicLink() {
        return mGetMusicLink;
    }
}
