package com.example.tomi.namecardapp;

import android.content.Context;
import android.content.Intent;
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
        savedCardsButton = (Button)findViewById(R.id.savedCards);
        cardButton = (Button)findViewById(R.id.cardEditor);
        quitButton = (Button)findViewById(R.id.quit);
        Onclick();
    }

    private void Onclick(){
        savedCardsButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "savedCards", Toast.LENGTH_SHORT).show();
            }
        });
        cardButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Intent editorScreen = new Intent(getApplicationContext(), EditorActivity.class);
                startActivity(editorScreen);
            }
        });
        quitButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
               finish();
            }
        });

    }

}
