package com.fernandofischer.audiobookplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.fernandofischer.audiobookplayer.R.id.library;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView genres = (TextView) findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);
                startActivity(genresIntent);
            }
        });

        TextView myLibrary = (TextView) findViewById(library);
        myLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, MyLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        TextView playingNow = (TextView) findViewById(R.id.playing);
        playingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingNowActivity.class);
                startActivity(playingIntent);
            }
        });

        TextView releases = (TextView) findViewById(R.id.releases);
        releases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent releasesIntent = new Intent(MainActivity.this, ReleasesActivity.class);
                startActivity(releasesIntent);
            }
        });

        TextView search = (TextView) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        TextView settings = (TextView) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

    }
}
