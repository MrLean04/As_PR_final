package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    private Button buttonSearch, buttonFav, buttonRes,buttonInfo;
    private ImageButton buttonsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        buttonsettings = findViewById(R.id.settings);
        buttonsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSettings();
            }
        });

        buttonSearch = findViewById(R.id.button_search);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSearch();
            }
        });

        buttonFav = findViewById(R.id.button_fav);
        buttonFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchFav();
            }
        });

        buttonRes = findViewById(R.id.button_reserve);
        buttonRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchReserve();
            }
        });
        buttonInfo = findViewById(R.id.button_info);
        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchInfo();
            }
        });
    }

    public void launchSearch() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void launchFav() {
        Intent intent = new Intent(this, FavActivity.class);
        startActivity(intent);
    }

    public void launchReserve() {
        Intent intent = new Intent(this, ReserveActivity.class);
        startActivity(intent);
    }

    public void launchInfo() {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }

    public void launchSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}