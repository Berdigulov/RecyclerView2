package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> countryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

        countryList.add("Canada");
        countryList.add("USA");
        countryList.add("the UK");
        countryList.add("South Korea");
        countryList.add("Japan");
        countryList.add("India");
        countryList.add("China");
        countryList.add("Brazil");
        countryList.add("Egypt");
        countryList.add("Kyrgyzstan");
        countryList.add("Russia");
        countryList.add("Ukraine");
        countryList.add("Mexico");
        countryList.add("France");
        countryList.add("German");
        countryList.add("Italy");
        countryList.add("Georgia");
        countryList.add("Poland");
        countryList.add("Nigeria");
        countryList.add("Scotland");
        countryList.add("Australia");
        countryList.add("Switzerland");
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        recyclerView.setAdapter(countryAdapter);
    }
}