package com.example.ponteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent tela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickCardapio(View view) {
        tela = new Intent(getApplicationContext(), Cardapio.class);
            startActivity(tela);
    }

    public void clickEquipe(View view) {
        tela = new Intent(getApplicationContext(), Equipe.class);
            startActivity(tela);
    }

    public void clickSobre(View view) {
        tela = new Intent(getApplicationContext(), activity_sobre.class);
        startActivity(tela);
    }
}