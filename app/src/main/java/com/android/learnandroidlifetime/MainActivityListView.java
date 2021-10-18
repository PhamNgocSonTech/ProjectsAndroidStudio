package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivityListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);
        //B1 du lieu la 1 mang
        String[] arr = {"Ton","Tung","Teo","Ty"};
        //B2: Thiet ke ListView
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivityListView.this,android.R.layout.simple_list_item_1,arr);
                                                                        //Ngu canh Activity,                                             //du lieu de dua vao
       ListView listView = findViewById(R.id.listView);
       listView.setAdapter(arrayAdapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                        //vi tri ptu
            Toast.makeText(MainActivityListView.this,"Position:"+ position + " value ="+arr[position], Toast.LENGTH_SHORT).show();
           }
       });
    }
}