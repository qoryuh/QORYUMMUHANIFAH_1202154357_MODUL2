package com.example.hnf.qoryummuhanifah_1202154357_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class DaftarMenu extends AppCompatActivity {

    private final LinkedList<String> LLcoffee = new LinkedList<>();
    private final LinkedList<Integer> LLprice = new LinkedList<>();
    private final LinkedList<Integer> LLphoto = new LinkedList<>();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        // Initializing list view with the custom adapter

        for (int i = 0;i < 1; i++) {
            LLcoffee.add("Pisang Nuget");
            LLcoffee.add("Kebab Turki");
            LLcoffee.add("Roti Bakar Greentea");
            LLcoffee.add("American Sandwich");
            LLcoffee.add("Americano Coffee");
            LLcoffee.add("Coffee Late");
            LLcoffee.add("Espresso Coffee");
            LLcoffee.add("Espresso Romano");
            LLcoffee.add("Flat HIte");
            LLcoffee.add("Ristretto Coffee");

            LLprice.add(40000);
            LLprice.add(45000);
            LLprice.add(40000);
            LLprice.add(40000);
            LLprice.add(35000);
            LLprice.add(35000);
            LLprice.add(35000);
            LLprice.add(38599);
            LLprice.add(18000);
            LLprice.add(22000);
            LLprice.add(24000);

            LLphoto.add(R.drawable.pisang_nuget);
            LLphoto.add(R.drawable.kebab_turki);
            LLphoto.add(R.drawable.rotibakar_greentea);
            LLphoto.add(R.drawable.american_sandwich);
            LLphoto.add(R.drawable.americano_coffee);
            LLphoto.add(R.drawable.coffee_late);
            LLphoto.add(R.drawable.espresso_coffee);
            LLphoto.add(R.drawable.espresso_romano);
            LLphoto.add(R.drawable.flat_hite);
            LLphoto.add(R.drawable.ristretto_coffee);
        }

        ItemArrayAdapter adapter = new ItemArrayAdapter(this, LLcoffee, LLprice, LLphoto);
        recyclerView = (RecyclerView) findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

}