package com.example.dualseriousgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button btnPlay, btnRank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnRank = (Button) findViewById(R.id.btnRank);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentPlay = new Intent(MainMenu.this, PlayActivity.class);
                startActivity(intentPlay);
            }
        });

        btnRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentRank = new Intent(MainMenu.this, RankingActivity.class);
                startActivity(intentRank);
            }
        });

    }
}
