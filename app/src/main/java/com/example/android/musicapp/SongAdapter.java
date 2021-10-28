package com.example.android.musicapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by XXX on 23-Feb-18.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private static ArrayList<Song> songs;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class SongViewHolder extends RecyclerView.ViewHolder {

        private final TextView titleTextView;
        private final TextView albumTextView;
        private final TextView artistTextView;
        private final TextView yearTextView;
        private final TextView durationTextView;

        public SongViewHolder(View view) {
            super(view);

            titleTextView = view.findViewById(R.id.title_song);
            albumTextView = view.findViewById(R.id.album_song);
            artistTextView = view.findViewById(R.id.artist_song);
            yearTextView = view.findViewById(R.id.year_song);
            durationTextView = view.findViewById(R.id.duration_song);
        }

        public TextView getTitleTextView() {
            return titleTextView;
        }

        public TextView getAlbumTextView() {
            return albumTextView;
        }

        public TextView getArtistTextView() {
            return artistTextView;
        }

        public TextView getYearTextView() {
            return yearTextView;
        }

        public TextView getDurationTextView() {
            return durationTextView;
        }
    }

    public SongAdapter(ArrayList<Song> songArrayList) {
        songs = songArrayList;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.song_list, viewGroup, false);

        return new SongViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(SongViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Song song = songs.get(position);

        viewHolder.getTitleTextView().setText(String.format(Locale.US, viewHolder.itemView.getContext().getString(R.string.title),
                song.getSongTitle()));

        viewHolder.getAlbumTextView().setText(String.format(Locale.US, viewHolder.itemView.getContext().getString(R.string.album),
                song.getSongAlbum()));

        viewHolder.getArtistTextView().setText(String.format(Locale.US, viewHolder.itemView.getContext().getString(R.string.artist),
                song.getSongArtist()));

        viewHolder.getYearTextView().setText(String.format(Locale.US, viewHolder.itemView.getContext().getString(R.string.year),
                song.getSongYear()));

        viewHolder.getDurationTextView().setText(String.format(Locale.US, viewHolder.itemView.getContext().getString(R.string.track_number),
                song.getSongNumber()));

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {

        if (songs != null) {

            return songs.size();
        }
        return 0;
    }

}