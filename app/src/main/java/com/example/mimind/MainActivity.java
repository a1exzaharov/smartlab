package com.example.mimind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.window.SplashScreen;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGHT = 5000;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}