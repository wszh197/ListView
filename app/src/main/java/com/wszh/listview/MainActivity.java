package com.wszh.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.wszh.listview.bean.Fruit;
import com.wszh.listview.bean.FruitAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private ListView mListView;
    List<Fruit> fruitList = new ArrayList<Fruit>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //只显示水果名
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

        //ListView的点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getmName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initFruits() {

        //课本使用的方法
        /*
        Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
        fruitList.add(apple);

        Fruit Banana = new Fruit("Banana", R.drawable.banana_pic);
        fruitList.add(Banana);

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
        String[] data={"Apple","Banana","Orange","Watermelon","Pear",
                "Grape","Pineapple","Strawberry","cherry","Mango",
                "Apple2","Banana2","Orange2","Watermelon2","Pear2",
                "Grape2","Pineapple2","Strawberry2","Cherry2","Mango2"};
        int[] fruitImages={R.drawable.apple_pic,R.drawable.banana_pic,R.drawable.orange_pic,
                R.drawable.watermelon_pic,R.drawable.pear_pic,R.drawable.grape_pic,
                R.drawable.pineapple_pic,
                R.drawable.strawberry_pic,R.drawable.cherry_pic,R.drawable.mango_pic,
                R.drawable.apple_pic,R.drawable.banana_pic,R.drawable.orange_pic,
                R.drawable.watermelon_pic,R.drawable.pear_pic,R.drawable.grape_pic,
                R.drawable.pineapple_pic,
                R.drawable.strawberry_pic,R.drawable.cherry_pic,R.drawable.mango_pic
        };
        for(int i=0;i<data.length;i++) {
            Fruit fruit=new Fruit(data[i],fruitImages[i]);
            fruitList.add(fruit);
        }



    }
}
