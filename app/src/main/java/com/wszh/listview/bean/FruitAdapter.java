package com.wszh.listview.bean;

import android.content.Context;
import android.util.Log;
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

    private int mCountOfInflate=0;

    private static final String TAG = "MainActivity";
    private int mResourceId;

    public FruitAdapter(Context context, int textViewResourceId,List<Fruit> object) {
        super(context, textViewResourceId,object);
        mResourceId=textViewResourceId;
    }

    //重写getView（），在每个子项被滚动到屏幕内的时候会被调用。
    public View getView(int position, View convertView, ViewGroup parent) {
        /*
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(mResourceId, null);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getmImageId());
        fruitName.setText(fruit.getmName());
        return view;
        */

        //优化
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fruit_item_layout,
                    parent,false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) convertView.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView) convertView.findViewById(R.id.fruit_name);
            convertView.setTag(viewHolder);
            Log.d(TAG, "新造的箱子: "+(++mCountOfInflate));
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }

        Fruit fruit = getItem(position);
        viewHolder.fruitImage.setImageResource(fruit.getmImageId());
        viewHolder.fruitName.setText(fruit.getmName());
        return convertView;
    }



    private class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
    }
}
