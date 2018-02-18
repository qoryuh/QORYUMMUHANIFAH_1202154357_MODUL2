package com.example.hnf.qoryummuhanifah_1202154357_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailMenu extends AppCompatActivity {

    TextView tvCoffee, tvPrice;
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Intent intent = getIntent();
        String food = intent.getStringExtra("Food");
        Integer price = intent.getIntExtra("Price",0);
        Integer photo = intent.getIntExtra("Image",0);

        Log.d("getIntExtra", ""+price+photo);

        tvCoffee = (TextView)findViewById(R.id.tvFood);
        tvPrice = (TextView)findViewById(R.id.tvPrice);
        ivImage = (ImageView)findViewById(R.id.ivImage);

        tvCoffee.setText(food);
        tvPrice.setText("Rp. "+price);
        ivImage.setImageResource(photo);

    }
}
