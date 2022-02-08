package com.ankitsharma.fullshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_welcome);
        getSupportActionBar ().hide ();
        TextView login;
        login = findViewById (R.id.login);
        login.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (WelcomeActivity.this,LoginActivity.class);
                startActivity (intent);
            }
        });
        TextView signup;
        signup = findViewById (R.id.signup);
        signup.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (WelcomeActivity.this,SignUpActivity.class);
                startActivity (intent);
            }
        });
    }
}