package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {

    private Button buttonConfSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        buttonConfSignIn = findViewById(R.id.button_confsup);
        buttonConfSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchConfSign();
            }
        });
    }

    public void launchConfSign() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}