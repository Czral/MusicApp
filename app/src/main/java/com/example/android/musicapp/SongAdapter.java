package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by XXX on 23-Feb-18.
 */

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);

        }

        Song nowPlayingSong = getItem(position);

        TextView songTitle = (TextView) listItemView.findViewById(R.id.title_song);
        songTitle.setText("Title: " + nowPlayingSong.getSongTitle());

        TextView songAlbum = (TextView) listItemView.findViewById(R.id.album_song);
        songAlbum.setText("Album: " + nowPlayingSong.getSongAlbum());

        TextView songArtist = (TextView) listItemView.findViewById(R.id.artist_song);
        songArtist.setText("Artist: " + nowPlayingSong.getSongArtist());

        TextView songYear = (TextView) listItemView.findViewById(R.id.year_song);
        songYear.setText("Year: " + nowPlayingSong.getSongYear());

        TextView songDuration = (TextView) listItemView.findViewById(R.id.duration_song);
        songDuration.setText("Track number: " + String.valueOf(nowPlayingSong.getSongNumber()));

        return listItemView;

    }
}
