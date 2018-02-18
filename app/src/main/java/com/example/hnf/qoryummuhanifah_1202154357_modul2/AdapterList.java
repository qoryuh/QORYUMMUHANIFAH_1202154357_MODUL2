package com.example.hnf.qoryummuhanifah_1202154357_modul2;

/**
 * Created by HNF on 2/18/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterList extends BaseAdapter{

    Context context;
    String number[], name;
    LayoutInflater inflter;

    public AdapterList(Context applicationContext, String[] num, String n) {
        this.context = context;
        this.number = num;
        name = n;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return number.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_list_spin, null);
        TextView no = (TextView) view.findViewById(R.id.textView);
        no.setText(number[i]);
        return view;
    }

}
