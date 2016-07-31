package com.wszh.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.wszh.listview.bean.Fruit;
import com.wszh.listview.bean.FruitAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private ListView mListView;
    private List<Fruit> fruitList = new ArrayList<Fruit>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        mListView = (ListView) findViewById(R.id.activity_main_listview);
        String[] data={"Apple","Banana","Orange","Watermelon","Watermelon","Pear",
                "Grape","Pineapple","Strawberry","cherry","Mango",
                "Apple2","Banana2","Orange2","Watermelon2","Pear2",
                "Grape2","Pineapple2","Strawberry2","Cherry2","Mango2"};
        ArrayAdapter<String> adaper = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,data);
        mListView.setAdapter(adaper);
        */

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
                R.layout.fruit_item_layout, fruitList);
        ListView listView = (ListView) findViewById(R.id.activity_main_listview);
        listView.setAdapter(adapter);

    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
        fruitList.add(apple);

        Fruit Banana = new Fruit("Banana", R.drawable.banana_pic);
        fruitList.add(Banana);
/*
        Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
        fruitList.add(apple);

        Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
        fruitList.add(apple);

        Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
        fruitList.add(apple);

        Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
        fruitList.add(apple);

        Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
        fruitList.add(apple);
        */



    }
}
