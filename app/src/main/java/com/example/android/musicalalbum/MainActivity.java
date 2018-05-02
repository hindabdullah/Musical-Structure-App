package com.example.android.musicalalbum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent albumsIntent = new Intent(MainActivity.this, albumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent artistsIntent = new Intent(MainActivity.this, artistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the musics category
        TextView musics = (TextView) findViewById(R.id.musics);

        // Set a click listener on that View
       musics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent musicsIntent = new Intent(MainActivity.this, musicsActivity.class);

                // Start the new activity
                startActivity(musicsIntent);
            }
        });

    }
}