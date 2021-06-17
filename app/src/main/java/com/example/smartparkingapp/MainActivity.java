package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonSignIn, buttonSignUp;
    private TextView txtWelTxt,txtSignIn, txtWelcome, txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initialmenu);

        txtWelcome = findViewById(R.id.textView);
        txtWelcome.setText(getString(R.string.welcome));

        txtWelTxt = findViewById(R.id.textView2);
        txtWelTxt.setText(getString(R.string.welTxt));

        txtWelTxt = findViewById(R.id.textView2);
        txtWelTxt.setText(getString(R.string.welTxt));

        txtSignIn = findViewById(R.id.button_signin);
        txtSignIn .setText(getString(R.string.signin_button));

        txtSignUp = findViewById(R.id.button_signup);
        txtSignUp .setText(getString(R.string.signup_button));

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