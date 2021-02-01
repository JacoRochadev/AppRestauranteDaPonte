package com.example.ponteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Equipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipe);
    }

    public void clickVoltar(View view) {
        finish();
    }

    public void clickLogo(View view) {
        finish();
    }

}