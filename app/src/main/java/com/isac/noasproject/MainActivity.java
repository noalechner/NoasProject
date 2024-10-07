package com.isac.noasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSushiClick(View view) {
        Intent sushiIntent = new Intent(this, sushiPage.class);
        startActivity(sushiIntent);
    }

    public void onPizzaClick(View view) {
        Intent pizzaIntent = new Intent(this, PizzaPage.class);
        startActivity(pizzaIntent);
    }


    public void onShawarmaClick(View view) {
        Intent shawarmaIntent = new Intent(this, ShawarmaPage.class);
        startActivity(shawarmaIntent);
    }
}