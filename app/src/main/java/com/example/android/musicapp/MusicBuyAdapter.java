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
 * Created by XXX on 26-Feb-18.
 */

public class MusicBuyAdapter extends ArrayAdapter<MusicBuy> {

    public MusicBuyAdapter(Context context, ArrayList<MusicBuy> musicLink) {
        super(context, 0, musicLink);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View musicListView = convertView;
        if (musicListView == null) {
            musicListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music, parent, false);

            MusicBuy currentMusicBuy = getItem(position);

            TextView siteText = musicListView.findViewById(R.id.site);
            siteText.setText(currentMusicBuy.getMusicSite().toUpperCase());

        }
        return musicListView;
    }

}