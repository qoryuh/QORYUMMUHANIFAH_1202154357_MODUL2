package com.example.hnf.qoryummuhanifah_1202154357_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }
    public void date(View view) {
        DatePicker newFragment = new DatePicker();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_string));
    }

    public void time(View view) {
        TimePicker newFragment = new TimePicker();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_string));
    }
    public void pesan(View view){
        Intent in = new Intent(TakeAway.this, DaftarMenu.class);
        startActivity(in);
    }

}
