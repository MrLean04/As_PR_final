package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button buttonsettings, buttonreserve, buttonmyreserves, buttonstatistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        buttonsettings = findViewById(R.id.button_settings);
        buttonsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSettings();
            }
        });

        buttonreserve = findViewById(R.id.button_reserve);
        buttonreserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchReserve();
            }
        });

        buttonmyreserves = findViewById(R.id.button_myreserves);
        buttonmyreserves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchMyReserves();
            }
        });

        buttonstatistics = findViewById(R.id.button_statistics);
        buttonstatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchStatistics();
            }
        });

    }

    public void launchReserve() {
        Intent intent = new Intent(this, ReserveActivity.class);
        startActivity(intent);
    }


    public void launchMyReserves() {
        Intent intent = new Intent(this, myReservesActivity.class);
        startActivity(intent);
    }

    public void launchStatistics() {
        Intent intent = new Intent(this, StatisticsActivity.class);
        startActivity(intent);
    }

    public void launchSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}