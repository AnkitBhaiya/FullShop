package com.ankitsharma.fullshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView cardShoes;
    CardView cardElectronic;
    CardView cardOil;
    CardView cardClothes;
    CardView cardBooks;
    CardView cardVegetables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
      getSupportActionBar ().hide ();
      cardShoes = findViewById (R.id.cardShoes);
        cardVegetables = findViewById (R.id.cardVegetable);
        cardElectronic = findViewById (R.id.cardElectronic);
        cardOil = findViewById (R.id.cardOil);
        cardClothes = findViewById (R.id.cardClothes);
        cardBooks = findViewById (R.id.cardBooks);

        cardShoes.setOnClickListener (new View.OnClickListener () {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent (MainActivity.this,ShoesActivity.class);
              startActivity (intent);
          }
      });

        cardVegetables.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,VegetablesActivity.class);
                startActivity (intent);
            }
        });

        cardClothes.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,ClothesActivity.class);
                startActivity (intent);
            }
        });
        cardBooks.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,BooksActivity.class);
                startActivity (intent);
            }
        });

        cardOil.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,OilActivity.class);
                startActivity (intent);
            }
        });

        cardElectronic.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,ElectronicsActivity.class);
                startActivity (intent);
            }
        });

}
}