package com.android.learnandroidlifetime;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
public class MainSinhVienActivity extends AppCompatActivity {
    public static final int MY_REQUEST_CODE = 777;
    ArrayList dssv = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sinh_vien);
        Button btnThemSV = (Button) findViewById(R.id.btnAddSV);
        ListView lvDSSV = (ListView) findViewById(R.id.listViewSV);

        adapter = new ArrayAdapter(
                MainSinhVienActivity.this,
                android.R.layout.simple_list_item_1,
                dssv
        );
        lvDSSV.setAdapter(adapter);
        btnThemSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh = new Intent(MainSinhVienActivity.this, SinhVienActivity.class);
                startActivityForResult(mh, MY_REQUEST_CODE);
            }
        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MY_REQUEST_CODE)
        {
            Bundle b = data.getBundleExtra("DuLieuTruyen");
            String SV = b.getString("HoTen") + " - " + b.getString("MSSV");
            dssv.add(SV);
            adapter.notifyDataSetChanged();//cập nhật
        }

    }

}

