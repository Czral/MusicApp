package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by XXX on 26-Feb-18.
 */

public class MusicBuyAdapter extends RecyclerView.Adapter<MusicBuyAdapter.MusicBuyViewHolder> {

    private static ArrayList<MusicBuy> musicBuys;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class MusicBuyViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;

        public MusicBuyViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            textView = view.findViewById(R.id.site);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    MusicBuy link = musicBuys.get(getAbsoluteAdapterPosition());
                    Intent openLink = new Intent(Intent.ACTION_VIEW);
                    openLink.setData(Uri.parse(link.getMusicLink()));
                    view.getContext().startActivity(openLink);
                }
            });
        }

        public TextView getTextView() {
            return textView;
        }
    }

    public MusicBuyAdapter(ArrayList<MusicBuy> musicBuyArrayList) {
        musicBuys = musicBuyArrayList;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public MusicBuyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.music, viewGroup, false);

        return new MusicBuyViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MusicBuyViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(musicBuys.get(position).getMusicSite().toUpperCase());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {

        if (musicBuys != null) {

            return musicBuys.size();
        }
        return 0;
    }
}