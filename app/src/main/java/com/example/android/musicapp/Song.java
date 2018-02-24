package com.example.android.musicapp;

/**
 * Created by XXX on 23-Feb-18.
 */

public class Song {

    private String mGetSongTitle;
    private String mGetSongAlbum;
    private String mGetSongArtist;
    private int mGetSongYear;
    private int mGetSongNumber;

    public Song(String songTitle, String songAlbum, String songArtist, int songYear, int songNumber) {

        mGetSongTitle = songTitle;
        mGetSongAlbum = songAlbum;
        mGetSongArtist = songArtist;
        mGetSongYear = songYear;
        mGetSongNumber = songNumber;

    }

    public String getSongTitle() {
        return mGetSongTitle;
    }

    public String getSongAlbum() {
        return mGetSongAlbum;
    }

    public String getSongArtist() { return mGetSongArtist; }

    public int getSongYear() {
        return mGetSongYear;
    }

    public int getSongNumber() {
        return mGetSongNumber;
    }


}
