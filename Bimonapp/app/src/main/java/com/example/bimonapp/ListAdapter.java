package com.example.bimonapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private final Context context;
//    private final String[] items;
//    private final int[] images;

    public ArrayList<fruit> fruits ;

    public ListAdapter(Context context, ArrayList<fruit> fruits  ) {
        this.context = context;
        this.fruits = fruits;
    }

    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public Object getItem(int position) {
        return fruits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView1);
        TextView textView = convertView.findViewById(R.id.textView1 );

        // 1. Lấy đối tượng fruit tương ứng với dòng hiện tại từ ArrayList
        fruit currentFruit = fruits.get(position);

        // 2. Gán dữ liệu từ đối tượng vào các View
        imageView.setImageResource(currentFruit.getImageId());
        textView.setText(currentFruit.getName());

        return convertView;
    }
}
