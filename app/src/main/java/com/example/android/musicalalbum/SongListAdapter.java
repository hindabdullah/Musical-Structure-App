package com.example.android.musicalalbum;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hind on 06/01/18.
 */

public class SongListAdapter extends ArrayAdapter<SongList> {

    private static final String LOG_TAG = SongListAdapter.class.getSimpleName();

    public SongListAdapter(Activity context, ArrayList<SongList> SongList) {

        super(context, 0, SongList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_row, parent, false);

        }
        SongList currentSongList = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.title);
        songTextView.setText(currentSongList.getSongName());

        TextView ArtistTextView = (TextView) listItemView.findViewById(R.id.descview);
        ArtistTextView.setText(currentSongList.getArtistName());
        return listItemView;
    }
}