package com.example.registrationform;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        String[] locations = {"Dhanmondi", "Kollanpur"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.myspinnertext,locations);

        spinner.setAdapter(adapter);

    }
}