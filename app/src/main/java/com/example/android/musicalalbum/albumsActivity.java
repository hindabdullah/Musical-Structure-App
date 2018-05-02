package com.example.android.musicalalbum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class albumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums2);

        // Find the View that shows the artists category
        Button artists = (Button) findViewById(R.id.artists_button);
        // Set a click listener on that View
       artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent artistsIntent = new Intent(albumsActivity.this, artistsActivity.class);
                finish();

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the musics category
        Button musics = (Button) findViewById(R.id.musics_button);
        // Set a click listener on that View
        musics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent musicsIntent = new Intent(albumsActivity.this, musicsActivity.class);
                finish();

                // Start the new activity
                startActivity(musicsIntent);
            }
        });

        // Find the View that shows the MainActivity category
        Button back = (Button) findViewById(R.id.back);
        // Set a click listener on that View
       back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent artistsIntent = new Intent(albumsActivity.this, MainActivity.class);
                finish();
                // Start the new activity
                startActivity(artistsIntent);
            }
        });
    }
}
