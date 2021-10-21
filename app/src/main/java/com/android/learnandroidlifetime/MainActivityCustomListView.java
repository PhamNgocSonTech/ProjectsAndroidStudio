package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import java.util.ArrayList;

public class MainActivityCustomListView extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_custom_list_view);
        Button btnInput, btnXoa;
        EditText editMa, editTen;
        ListView lvSV = (ListView) findViewById(R.id.lvSinhVien);
        RadioGroup genderGroup = (RadioGroup)findViewById(R.id.genderGroup);
        ArrayList<SinhVien> arrSV = new ArrayList<>();
        MyArrayAdapter adapter = new MyArrayAdapter(
                MainActivityCustomListView.this,
                R.layout.layout_gender,
                arrSV);
        lvSV.setAdapter(adapter);
            btnInput  = findViewById(R.id.btnNhapSV);
            btnXoa = findViewById(R.id.imageButtonXoa);
            editMa = findViewById(R.id.editTextIDSV);
            editTen = findViewById(R.id.editTextHoTen);
            btnInput.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ma = editMa.getText()+ " ";
                    String ten = editTen.getText()+ " ";
                    boolean gender = true;//nam = true
                    if(genderGroup.getCheckedRadioButtonId() == R.id.radioBtnFemale){
                        gender = false; //
                    }
                    SinhVien emp = new SinhVien();
                    emp.setMaSV(ma);
                    emp.setHoTen(ten);
                    emp.setGioiTinh(gender);
                    arrSV.add(emp);
                    adapter.notifyDataSetChanged();
                    editMa.setText("");
                    editTen.setText("");
                    editMa.requestFocus();
                }
            });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = lvSV.getChildCount() - 1 ; i >= 0 ; i--)
                {
                    v = lvSV.getChildAt(i);
                    CheckBox chk = v.findViewById(R.id.chkitem);
                    if(chk.isChecked())
                    {
                        arrSV.remove(i);
                    }
                }
                adapter.notifyDataSetChanged();
            }
        });

    }
}