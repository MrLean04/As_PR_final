package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class myReservesActivity extends AppCompatActivity {

    private ListView localsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);

        localsList = findViewById(R.id.favlist);

        ArrayList<String> locals = new ArrayList<>();
        locals.add("VilaMar - 18/06/21 - 14:00");



        ArrayAdapter<String> localsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                locals
        );

        localsList.setAdapter(localsAdapter);

        localsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(myReservesActivity.this, locals.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}