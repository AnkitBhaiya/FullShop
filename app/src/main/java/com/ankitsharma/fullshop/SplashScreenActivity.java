package com.ankitsharma.fullshop;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splash_screen);
       getSupportActionBar ().hide ();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread td = new Thread () {

            public void run() {
                try {
                    sleep (5000);

                } catch (Exception ex) {
                    ex.printStackTrace ();
                } finally {
                    Intent intent=new Intent (SplashScreenActivity.this, WelcomeActivity.class);
                    startActivity (intent);
                    finish ();
                }
            }

        };td.start ();

    }
}