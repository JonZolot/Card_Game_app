package com.example.jonathanzolot.cardgameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class gameTryOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_try_one);
    }

    public void moveback(View view){
        Intent intent = new Intent(this, Single_Player.class);
        startActivity(intent);
    }

    public void newGame(View view){
        Button playButton = (Button) findViewById(R.id.newGame);
        Button changeCard = (Button) findViewById(R.id.cardChange);
        ImageView card = (ImageView) findViewById(R.id.card);
        playButton.setVisibility(View.INVISIBLE);
        card.setVisibility(View.VISIBLE);
        changeCard.setVisibility(View.VISIBLE);
    }

    public void changeCard(View view){
        ImageView card = (ImageView) findViewById(R.id.card);
        int min = 0;
        int max = 52;
        Random num = new Random();
        int choice = num.nextInt(max - min) + min;

        String[] cardName = {"clubs_1","clubs_2", "clubs_3", "clubs_4", "clubs_5", "clubs_6", "clubs_7", "clubs_8", "clubs_9", "clubs_10", "clubs_11", "clubs_12", "clubs_13",
                            "hearts_1", "hearts_2", "hearts_3", "hearts_4", "hearts_5", "hearts_6", "hearts_7", "hearts_8", "hearts_9", "hearts_10", "hearts_11", "hearts_12", "hearts_13",
                            "diamonds_1", "diamonds_2", "diamonds_3", "diamonds_4", "diamonds_5", "diamonds_6", "diamonds_7", "diamonds_8", "diamonds_9", "diamonds_10", "diamonds_11", "diamonds_12", "diamonds_13",
                            "spades_1", "spades_2", "spades_3", "spades_4", "spades_5", "spades_6", "spades_7", "spades_8", "spades_9", "spades_10", "spades_11", "spades_12", "spades_13"};
        String pick = cardName[choice];
        //card.setImageResource(R.drawable."cardName[choice]");

        int resID = getResources().getIdentifier(pick, "drawable", "com.example.jonathanzolot.cardgameapp");
        card.setImageResource(resID );
    }
}
