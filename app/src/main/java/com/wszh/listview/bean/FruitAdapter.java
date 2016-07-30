package com.wszh.listview.bean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wszh.listview.R;

import java.util.List;

/**
 * Created by lsx on 2016/7/30.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int mResourceId;

    public FruitAdapter(Context context, int textViewResourceId,List<Fruit> object) {
        super(context, textViewResourceId,object);
        mResourceId=textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(mResourceId, null);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getmImageId());
        fruitName.setText(fruit.getmName());
        return view;
    }
}
