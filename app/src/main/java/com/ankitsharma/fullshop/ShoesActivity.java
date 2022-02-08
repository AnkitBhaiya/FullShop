package com.ankitsharma.fullshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShoesActivity extends AppCompatActivity {
   TextView nike;
    TextView adidas;
    TextView campus;
    TextView relaxo;
    TextView bata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_shoes);
     nike = findViewById (R.id.buyNike);
     adidas = findViewById (R.id.buyAdidas);
     campus = findViewById (R.id.buyCampus);
     relaxo = findViewById (R.id.buyRelaxo);
     bata = findViewById (R.id.buyBata);

     nike.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent (ShoesActivity.this,CongratulationActivity.class);
             startActivity (intent);
         }
     });

        adidas.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ShoesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

        campus.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ShoesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

        relaxo.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ShoesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

        bata.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ShoesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

    }
}