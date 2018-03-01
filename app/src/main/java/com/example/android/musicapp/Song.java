package com.example.android.musicapp;

/**
 * Created by XXX on 23-Feb-18.
 */

public class Song {

    private String mSongTitle;
    private String mSongAlbum;
    private String mSongArtist;
    private int mSongYear;
    private int mSongNumber;

    public Song(String songTitle, String songAlbum, String songArtist, int songYear, int songNumber) {

        mSongTitle = songTitle;
        mSongAlbum = songAlbum;
        mSongArtist = songArtist;
        mSongYear = songYear;
        mSongNumber = songNumber;

    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getSongAlbum() {
        return mSongAlbum;
    }

    public String getSongArtist() { return mSongArtist; }

    public int getSongYear() {
        return mSongYear;
    }

    public int getSongNumber() {
        return mSongNumber;
    }

}
