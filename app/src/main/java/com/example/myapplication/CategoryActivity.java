package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryActivity extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listFoods = getListView();
        ArrayAdapter<Food> listAdapter= new ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1, Food.foods);
        listFoods.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        super.onListItemClick(listView, itemView, position, id);

        Intent intent = new Intent(CategoryActivity.this, SelCookActivity.class);
        intent.putExtra(SelCookActivity.EXTRA_FOODNO, (int) id);
        startActivity(intent);
    }
}
