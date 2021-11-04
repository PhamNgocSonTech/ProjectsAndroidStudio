package com.android.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.android.learnandroidlifetime.R;

import java.util.ArrayList;

public class MainActivitySimpleGridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_simple_grid_view);
        final GridView gridView = (GridView) findViewById(R.id.gridViewWeb);
        ArrayList<Website> arrWeb = new ArrayList<Website>();
        arrWeb.add(new Website("Google","http://google.com.vn"));
        arrWeb.add(new Website("Zing News","https://zingnews.vn"));
        arrWeb.add(new Website("Genk","https://genk.vn"));
        arrWeb.add(new Website("Thể Thao 247","https://thethao247.vn/"));
        ArrayAdapter<Website> arrAdapt = new ArrayAdapter<Website>(
                MainActivitySimpleGridView.this,
                android.R.layout.simple_list_item_1,
                arrWeb);
        gridView.setAdapter(arrAdapt);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object obj = gridView.getItemAtPosition(position);
                Website web = (Website) obj;
                Toast.makeText(
                        MainActivitySimpleGridView.this,
                        "Vừa chọn: "+" "+web.getName()+"\n("+web.getUrl()+")",
                        Toast.LENGTH_LONG).show();
            }
        });


    }

}