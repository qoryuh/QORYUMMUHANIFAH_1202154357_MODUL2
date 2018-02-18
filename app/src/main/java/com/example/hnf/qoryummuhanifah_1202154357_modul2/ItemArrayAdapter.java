package com.example.hnf.qoryummuhanifah_1202154357_modul2;

/**
 * Created by HNF on 2/18/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder>{

    //All methods in this adapter are required for a bare minimum recyclerview adapter
    private final LinkedList<String> linkListCoffee;
    private final LinkedList<Integer> linkListPrice;
    private final LinkedList<Integer> linkListPhoto;
    private LayoutInflater inflater;

    // Constructor of the class
    public ItemArrayAdapter(Context context, LinkedList<String> llcoffee, LinkedList<Integer> llprice, LinkedList<Integer> llphoto) {
        inflater = LayoutInflater.from(context);
        this.linkListCoffee = llcoffee;
        this.linkListPrice = llprice;
        this.linkListPhoto = llphoto;
    }

    @Override
    public int getItemCount() {
        return linkListCoffee.size();
    }

    // specify the row layout file and click for each row
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_detaiil_menu, parent, false);
        return new ViewHolder(view, this);
    }

    // load data in each row element
    public void onBindViewHolder(ViewHolder holder, int listPosition) {
        String curCoffee = linkListCoffee.get(listPosition);
        Integer curPrice = linkListPrice.get(listPosition);
        Integer curPhoto = linkListPhoto.get(listPosition);
        holder.coffeeItem.setText(curCoffee);
        holder.priceItem.setText("Rp. "+curPrice.toString());
        holder.photoItem.setImageResource(curPhoto);
    }

    // Static inner class to initialize the views of rows
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView coffeeItem;
        public final TextView priceItem;
        public final ImageView photoItem;
        public final LinearLayout linLayout;

        final ItemArrayAdapter adapter;
        public ViewHolder(final View itemView, ItemArrayAdapter adapterPar) {
            super(itemView);
            coffeeItem = (TextView) itemView.findViewById(R.id.menulist_nama);
            priceItem = (TextView) itemView.findViewById(R.id.menulist_harga);
            photoItem = (ImageView) itemView.findViewById(R.id.logodetail);
            linLayout = (LinearLayout) itemView.findViewById(R.id.Layout);
            linLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getLayoutPosition();

                    String textFood = linkListCoffee.get(position);
                    Integer textPrice = linkListPrice.get(position);
                    Integer textImage = linkListPhoto.get(position);

                    Intent intent = new Intent(itemView.getContext(), DetailMenu.class);
                    intent.putExtra("Food", textFood);
                    intent.putExtra("Price", textPrice);
                    intent.putExtra("Image", textImage);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.adapter = adapterPar;
        }

        //Empty onClick
        @Override
        public void onClick(View view) {

        }
    }
}