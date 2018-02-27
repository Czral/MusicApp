package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.example.android.musicapp.R;
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

        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.title_song);
        songTitleTextView.setText(getContext().getString(R.string.title) + " " + nowPlayingSong.getSongTitle());

        TextView songAlbumTextView = (TextView) listItemView.findViewById(R.id.album_song);
        songAlbumTextView.setText(getContext().getString(R.string.album) + " " + nowPlayingSong.getSongAlbum());

        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.artist_song);
        songArtistTextView.setText(getContext().getString(R.string.artist) + " " + nowPlayingSong.getSongArtist());

        TextView songYearTextView = (TextView) listItemView.findViewById(R.id.year_song);
        songYearTextView.setText(getContext().getString(R.string.year) + " " + nowPlayingSong.getSongYear());

        TextView songNumberTextView = (TextView) listItemView.findViewById(R.id.duration_song);
        songNumberTextView.setText(getContext().getString(R.string.track_number) + " " + String.valueOf(nowPlayingSong.getSongNumber()));

        return listItemView;

    }
}
