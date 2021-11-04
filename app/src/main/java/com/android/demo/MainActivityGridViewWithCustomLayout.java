package com.android.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.android.learnandroidlifetime.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivityGridViewWithCustomLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_item_layout);
        final GridView gridView = (GridView) findViewById(R.id.gridViewCountry);
        List<Country> listQG = getListCountry();
        gridView.setAdapter(new CustomGridView(this,listQG));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object obj = gridView.getItemAtPosition(position);
                Country country = (Country) obj;
                Toast.makeText(
                        MainActivityGridViewWithCustomLayout.this,
                        "Lựa chọn"+" "+country,
                        Toast.LENGTH_LONG).show();
            }
        });

    }
    public List<Country> getListCountry(){
        List<Country> list = new ArrayList<Country>();
        list.add(new Country("Việt Nam", "vi",98000000));
        list.add(new Country("Mỹ", "us",333000000));
        list.add(new Country("Anh", "uk",68000000));
        list.add(new Country("Ý", "italy",60000000));
        list.add(new Country("Nhật", "japan",126000000));
        list.add(new Country("Pháp", "france",67300000));
        return list;
    }
}