package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class inCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_category);
        getSupportActionBar().hide();
    }
}