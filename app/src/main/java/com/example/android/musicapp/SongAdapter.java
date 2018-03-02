package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

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

        String songTitle = String.format(Locale.US, getContext().getString(R.string.title), nowPlayingSong.getSongTitle());
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.title_song);
        songTitleTextView.setText(songTitle);

        String songAlbum = String.format(Locale.US, getContext().getString(R.string.album), nowPlayingSong.getSongAlbum());
        TextView songAlbumTextView = (TextView) listItemView.findViewById(R.id.album_song);
        songAlbumTextView.setText(songAlbum);

        String songArtist = String.format(Locale.US, getContext().getString(R.string.artist), nowPlayingSong.getSongArtist());
        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.artist_song);
        songArtistTextView.setText(songArtist);

        String songYear = String.format(Locale.US, getContext().getString(R.string.year), String.valueOf(nowPlayingSong.getSongYear()));
        TextView songYearTextView = (TextView) listItemView.findViewById(R.id.year_song);
        songYearTextView.setText(songYear);

        String songNumber = String.format(Locale.US, getContext().getString(R.string.track_number), String.valueOf(nowPlayingSong.getSongNumber()));
        TextView songNumberTextView = (TextView) listItemView.findViewById(R.id.duration_song);
        songNumberTextView.setText(songNumber);

        return listItemView;

    }
}
