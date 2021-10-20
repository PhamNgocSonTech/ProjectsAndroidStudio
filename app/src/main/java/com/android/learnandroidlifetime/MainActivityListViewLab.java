package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivityListViewLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view_lab);
        ListView lvMonHoc = (ListView) findViewById(R.id.listViewLab);
        final String [] dsmh = new String[] {"Công nghệ phần mềm", "Web", "Mạng máy tính", "Di động",
        "Giao diện", "Hệ điều hành"};
        ArrayAdapter<String> adap = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsmh
        );
            lvMonHoc.setAdapter(adap);
            lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String kq = "Position: "+position+", value = " +dsmh[position];
                    Toast.makeText(MainActivityListViewLab.this,kq,Toast.LENGTH_LONG).show();
                }
            });
    }
}