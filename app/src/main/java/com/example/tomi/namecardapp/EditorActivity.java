package com.example.tomi.namecardapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditorActivity extends AppCompatActivity {
    private Button backButton;
    private Context context = EditorActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        //backButton = (Button) findViewById(R.id.back);
        //OnClick();
    }

    private void OnClick(){
        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }
}
