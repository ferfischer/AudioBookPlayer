package com.fernandofischer.audiobookplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ReleasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_releases);

        Button book = (Button) findViewById(R.id.livro);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bookIntent = new Intent(ReleasesActivity.this, BookDetailActivity.class);
                startActivity(bookIntent);
            }
        });
    }
}
