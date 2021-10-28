package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SinhVienActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText txtHoTen = findViewById(R.id.editTextHoTenSV);
        EditText txtMSSV = findViewById(R.id.editTextMaSV);

        setContentView(R.layout.activity_sinh_vien);
        Button btnLuu = findViewById(R.id.btnLuuSV);
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = getIntent();
                Bundle b = new Bundle();
                b.putString("HoTen", txtHoTen.getText().toString());
                b.putString("MSSV", txtMSSV.getText().toString());
                it.putExtra("Du Lieu Truyen",b);
                setResult(777, it);
                finish();
            }
        });
    }
}