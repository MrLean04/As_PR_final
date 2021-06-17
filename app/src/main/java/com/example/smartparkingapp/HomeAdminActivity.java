package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeAdminActivity extends AppCompatActivity {

    private Button buttonsettings, buttonreserve, buttonmyreserves, buttonstatistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeadmin);

        buttonsettings = findViewById(R.id.button_settings);
        buttonsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSettings();
            }
        });

        buttonreserve = findViewById(R.id.button_managepark);
        buttonreserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchManagePark();
            }
        });

        buttonmyreserves = findViewById(R.id.button_managefinances);
        buttonmyreserves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchManageFinances();
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

    public void launchManageFinances() {
        Intent intent = new Intent(this, FinancesActivity.class);
        startActivity(intent);
    }


    public void launchManagePark() {
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