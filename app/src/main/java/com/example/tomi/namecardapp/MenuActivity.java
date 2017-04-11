package com.example.tomi.namecardapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private Button preCreatedCardsButton;
    private Button savedCardsButton;
    private Button cardButton;
    private Button obtainedCardsButton;
    private Button getCardsButton;
    private Button optionsButton;
    private Button quitButton;
    private Context context = MenuActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        preCreatedCardsButton = (Button)findViewById(R.id.preCreatedCards);
        savedCardsButton = (Button)findViewById(R.id.savedCards);
        cardButton = (Button)findViewById(R.id.cardEditor);
        obtainedCardsButton = (Button)findViewById(R.id.obtainedCards);
        getCardsButton = (Button)findViewById(R.id.getCards);
        optionsButton = (Button)findViewById(R.id.options);
        quitButton = (Button)findViewById(R.id.quit);
        Onclick();
    }

    private void Onclick(){
        preCreatedCardsButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "preCreated", Toast.LENGTH_SHORT).show();
            }
        });
        savedCardsButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "savedCards", Toast.LENGTH_SHORT).show();
            }
        });
        cardButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "editor", Toast.LENGTH_SHORT).show();
            }
        });
        obtainedCardsButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "obtainedCards", Toast.LENGTH_SHORT).show();
            }
        });
        getCardsButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "getCards", Toast.LENGTH_SHORT).show();
            }
        });
        optionsButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "Options", Toast.LENGTH_SHORT).show();
            }
        });
        quitButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
               finish();
            }
        });

    }

}
