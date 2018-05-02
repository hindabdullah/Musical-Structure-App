package com.example.android.musicalalbum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class artistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);


        // Find the View that shows the albums category
        Button albums = (Button) findViewById(R.id.Album_button);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent albumsIntent = new Intent(artistsActivity.this, albumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the musics category
        Button musics = (Button) findViewById(R.id.musics_button);

        // Set a click listener on that View
        musics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent musicsIntent = new Intent(artistsActivity.this, musicsActivity.class);

                // Start the new activity
                startActivity(musicsIntent);
            }
        });

        // Find the View that shows the main activity category
        Button back = (Button) findViewById(R.id.back);

        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent artistsIntent = new Intent(artistsActivity.this, MainActivity.class);
                finish();
                // Start the new activity
                startActivity(artistsIntent);
            }
        });
    }
}