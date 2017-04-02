package com.fernandofischer.audiobookplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        Button genres = (Button) findViewById(R.id.genero);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(GenresActivity.this, SearchActivity.class);
                startActivity(genresIntent);
            }
        });
    }
}
