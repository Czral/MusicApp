package com.example.android.musicapp;

/**
 * Created by XXX on 26-Feb-18.
 */

public class MusicBuy {

    private String mMusicSite;
    private String mMusicLink;

    public MusicBuy(String getMusicSite, String getMusicLink) {

        mMusicSite = getMusicSite;
        mMusicLink = getMusicLink;
    }

    public String getMusicSite() {
        return mMusicSite;
    }

    public String getMusicLink() {
        return mMusicLink;
    }
}
