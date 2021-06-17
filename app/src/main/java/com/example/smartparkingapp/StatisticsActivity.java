package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class StatisticsActivity extends AppCompatActivity implements OnMapReadyCallback {


    private ImageButton buttonsettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        buttonsettings = findViewById(R.id.imageButton);
        buttonsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSettings();
            }
        });

    }

    GoogleMap map;

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;

        LatLng Aveiro = new LatLng(40.643904619668575, -8.657694437451296);
        Marker marker1 = map.addMarker(new MarkerOptions().position(Aveiro).title("Parque Vilamar"));

        LatLng Lisboa = new LatLng(38.73755038183533, -9.134404385710498);
        Marker marker2 = map.addMarker(new MarkerOptions().position(Lisboa).title("Parque AlfaceCity"));

        map.moveCamera(CameraUpdateFactory.newLatLng(Aveiro));

        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.equals(marker1))
                    launchStatisticsAveiro();
                else
                   launchStatisticsLisboa();
                return false;
            }
        });
    }

    public void launchStatisticsAveiro() {
        Intent intent = new Intent(this, statAveiroActivity.class);
        startActivity(intent);
    }

    public void launchStatisticsLisboa() {
        Intent intent = new Intent(this, statLisboaActivity.class);
        startActivity(intent);
    }

    public void launchSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}