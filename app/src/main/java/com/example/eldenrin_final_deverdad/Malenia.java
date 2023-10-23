package com.example.eldenrin_final_deverdad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Malenia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.malenia);
        ImageButton back = findViewById(R.id.backMalenia);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(Malenia.this, ListaBosses.class);
                startActivity(intentBack);
            }
        });
    }
}