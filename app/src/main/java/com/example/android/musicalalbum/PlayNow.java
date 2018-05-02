package com.example.android.musicalalbum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_now);

        String savedExtra = getIntent().getStringExtra("Song");
        TextView myText = (TextView) findViewById(R.id.playID);
        myText.setText(savedExtra+ " " +"Song");

        // Find the View that shows the Music activity category
        Button back = (Button) findViewById(R.id.back);

        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent artistsIntent = new Intent(PlayNow.this, musicsActivity.class);
                finish();
                // Start the new activity
                startActivity(artistsIntent);
            }
        });
    }}