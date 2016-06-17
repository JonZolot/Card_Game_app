package com.example.jonathanzolot.cardgameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Single_Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single__player);
    }
    public void easygame(View view){
        Intent intent = new Intent(this, gameTryOne.class);
        startActivity(intent);
    }

}
