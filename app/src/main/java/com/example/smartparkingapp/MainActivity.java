package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonSignIn, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initialmenu);

        buttonSignIn = findViewById(R.id.button_signin);
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSign();
            }
        });

        buttonSignUp = findViewById(R.id.button_signup);
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSignUp();
            }
        });
    }

    public void launchSign() {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }

    public void launchSignUp() {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}