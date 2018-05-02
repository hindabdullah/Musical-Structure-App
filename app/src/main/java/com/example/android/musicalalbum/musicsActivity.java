package com.example.android.musicalalbum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class musicsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ArrayList<SongList> SongLists = new ArrayList<SongList>();
        SongLists.add(new SongList(getString(R.string.song_1),getString(R.string.artist_1)));
        SongLists.add(new SongList(getString(R.string.song_2),getString(R.string.artist_2)));
        SongLists.add(new SongList(getString(R.string.song_3),getString(R.string.artist_3)));
        SongLists.add(new SongList(getString(R.string.song_4),getString(R.string.artist_4)));
        SongLists.add(new SongList(getString(R.string.song_5),getString(R.string.artist_5)));
        SongLists.add(new SongList(getString(R.string.song_6),getString(R.string.artist_6)));

        SongListAdapter SongListAdapter = new SongListAdapter(this, SongLists);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(SongListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(musicsActivity.this, PlayNow.class);
                String message = SongLists.get(position).getSongName();
                intent.putExtra("Song", message);
                startActivity(intent);

            }
        });

        // Find the View that shows the albums category
        Button albums = (Button) findViewById(R.id.Album_button);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent albumsIntent = new Intent(musicsActivity.this, albumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the artist category
        Button artists = (Button) findViewById(R.id.artists_button);
        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent artistsIntent = new Intent(musicsActivity.this, artistsActivity.class);
                finish();

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the MainActivity category
        Button Back = (Button) findViewById(R.id.back);
        // Set a click listener on that View
        Back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent artistsIntent = new Intent(musicsActivity.this, MainActivity.class);
                finish();
                // Start the new activity
                startActivity(artistsIntent);
            }
        });
    }}