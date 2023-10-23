package com.example.eldenrin_final_deverdad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListaBosses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listabosses);
        Button irAMargit = findViewById(R.id.margit);
        Button irARennala = findViewById(R.id.renala);
        Button irARadhan = findViewById(R.id.radhan);
        Button irAFireGiant = findViewById(R.id.fire_giant);
        Button irAMogh = findViewById(R.id.mogh);
        Button irAMalenia = findViewById(R.id.malenia);
        irAMargit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentMargit = new Intent(ListaBosses.this, Margit.class);
                startActivity(intentMargit);
            }
        });
        irARennala.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentRennala = new Intent(ListaBosses.this, Rennala.class);
                startActivity(intentRennala);
            }
        });
        irARadhan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentRadhan = new Intent(ListaBosses.this, Radhan.class);
                startActivity(intentRadhan);
            }
        });
        irAFireGiant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentFireGiant = new Intent(ListaBosses.this, FireGiant.class);
                startActivity(intentFireGiant);
            }
        });
        irAMogh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentMogh = new Intent(ListaBosses.this, Mogh.class);
                startActivity(intentMogh);
            }
        });
        irAMalenia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentMalenia = new Intent(ListaBosses.this, Malenia.class);
                startActivity(intentMalenia);
            }
        });
    }
}