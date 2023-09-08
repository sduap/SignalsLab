package com.example.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleFindSignal(View view) {
        TextView brands = findViewById(R.id.signals);
        Spinner spinnerSignals = findViewById(R.id.spinner);
        String typeSignal = String.valueOf(spinnerSignals.getSelectedItem());
        String signal = SignalExpert.getSignals(typeSignal);
        brands.setText(signal);
    }
}