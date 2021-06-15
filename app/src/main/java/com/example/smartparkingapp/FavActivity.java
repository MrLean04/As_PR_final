package com.example.smartparkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FavActivity extends AppCompatActivity {

    private ListView localsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);

        localsList = findViewById(R.id.favlist);

        ArrayList<String> locals = new ArrayList<>();
        locals.add("Praia da Barra,Aveiro");
        locals.add("Praia da Costa Nova, Aveiro");
        locals.add("Restaurantes Costa Nova, Aveiro");
        locals.add("Forum, Aveiro");

        ArrayAdapter<String> localsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                locals
        );

        localsList.setAdapter(localsAdapter);

        localsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FavActivity.this, locals.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}