package com.example.hnf.qoryummuhanifah_1202154357_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    Spinner spinMeja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        spinMeja = (Spinner) findViewById(R.id.dinein_spinmeja);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinMeja != null){
            spinMeja.setAdapter(adapter);
        }

    }

    public void pilihpesan(View view) {

        spinMeja = (Spinner) findViewById(R.id.dinein_spinmeja);
        String noMeja = spinMeja.getSelectedItem().toString();

        Toast.makeText(DineIn.this, "You choose "+noMeja, Toast.LENGTH_LONG).show();
        Intent in = new Intent(DineIn.this, DaftarMenu.class);
        startActivity(in);
    }
}

