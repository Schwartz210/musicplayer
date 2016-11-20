package com.example.android.folkmusic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.folkmusic.R.raw.broidered_with_gold_and_silver_threads;

public class chinaActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);
        setOnClickListeners();
    }

    public void playMP3(int resourceID) {
        if (mediaPlayer.isPlaying()){
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, resourceID);
        mediaPlayer.start();
    }
    

    public void setOnClickListeners(){
        ImageButton play1 = (ImageButton) findViewById(R.id.play1China);
        ImageButton play2 = (ImageButton) findViewById(R.id.play2China);
        ImageButton play3 = (ImageButton) findViewById(R.id.play3China);
        ImageButton play4 = (ImageButton) findViewById(R.id.play4China);
        ImageButton play5 = (ImageButton) findViewById(R.id.play5China);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMP3(R.raw.broidered_with_gold_and_silver_threads);
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMP3(R.raw.by_the_butterfly_spring);
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMP3(R.raw.please_stay_friends_from_remote_lands);
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMP3(R.raw.there_is_a_beautiful_place);
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMP3(R.raw.horse_bell_jingles_jade_bird_sings);
            }
        });






    }
}
