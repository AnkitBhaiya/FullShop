package com.ankitsharma.fullshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignUpActivity extends AppCompatActivity {
  Button button;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_up);
        getSupportActionBar ().hide ();

       button = findViewById (R.id.button);
     button.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View view) {

             Intent intent = new Intent (SignUpActivity.this,MainActivity.class);
              startActivity (intent);


         }
     });

    }

}