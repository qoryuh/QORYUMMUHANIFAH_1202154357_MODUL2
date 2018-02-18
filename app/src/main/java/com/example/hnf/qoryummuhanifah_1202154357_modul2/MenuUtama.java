package com.example.hnf.qoryummuhanifah_1202154357_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {
    private boolean cek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }
    public void orderNow(View view){

        if(cek){  //kondisi dimana ketika mencheck Dine In
            Intent in = new Intent(this, DineIn.class);
            startActivity(in);
            Toast.makeText(MenuUtama.this, "Dine In", Toast.LENGTH_LONG).show();
        } else{     //kondisi dimana ketika mencheck Take Away
            Intent in = new Intent(this, TakeAway.class);
            startActivity(in);
            Toast.makeText(MenuUtama.this, "Take Away", Toast.LENGTH_LONG).show();
        }

    }

    public void radioClick(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.rBDine:
                if(checked)
                    cek = true;
                break;
            case R.id.rBTake:
                if(checked)
                    cek = false;
                break;
        }
    }
}

