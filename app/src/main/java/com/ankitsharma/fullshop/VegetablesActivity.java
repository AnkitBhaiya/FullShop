package com.ankitsharma.fullshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VegetablesActivity extends AppCompatActivity {

    TextView bhindi;
    TextView carrot;
    TextView onion;
    TextView potato;
    TextView gobhi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_vegetables);
        bhindi = findViewById (R.id.buyBhindi);
        carrot = findViewById (R.id.buycarrot);
        onion = findViewById (R.id.buyOnion);
        potato = findViewById (R.id.buyPotato);
        gobhi = findViewById (R.id.buygobhi);

        bhindi.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (VegetablesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

        onion.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (VegetablesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

        carrot.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (VegetablesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

        potato.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (VegetablesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

        gobhi.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (VegetablesActivity.this,CongratulationActivity.class);
                startActivity (intent);
            }
        });

    }
}