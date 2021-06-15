package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    private Button buttonConfSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        buttonConfSignUp = findViewById(R.id.button_confsup);
        buttonConfSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchConfSignUp();
            }
        });
    }

    public void launchConfSignUp() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}