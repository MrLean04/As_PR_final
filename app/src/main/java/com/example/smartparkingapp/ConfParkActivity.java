package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfParkActivity extends AppCompatActivity {

    private Button buttonConfPark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmpark);

        buttonConfPark = findViewById(R.id.button_resereturn);
        buttonConfPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchConfPark();
            }
        });
    }

    public void launchConfPark() {
        Intent intent = new Intent(this, CheckpayActivity.class);
        startActivity(intent);
    }
}