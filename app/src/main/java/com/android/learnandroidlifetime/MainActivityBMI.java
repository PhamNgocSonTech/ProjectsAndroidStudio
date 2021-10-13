package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivityBMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_layout);
        EditText ten, cao, nang, editBMI, editChuanDoan;
        Button btnBMI = (Button) findViewById(R.id.btnBMI);
        ten = (EditText) findViewById(R.id.editTextName);
        cao = (EditText) findViewById(R.id.editTextChieuCao);
        nang = (EditText) findViewById(R.id.editTextCanNang);
        editBMI = (EditText) findViewById(R.id.editShowBMI);
        editChuanDoan = (EditText) findViewById(R.id.editShowChuanDoan);
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double H = Double.parseDouble(cao.getText().toString());
                double W = Double.parseDouble((nang.getText().toString()));
                double BMI = W/Math.pow(H,2);
                String chuanDoan = " ";
                if(BMI < 18)
                {

                    chuanDoan = "Bạn gầy";
                }
                else if(BMI <= 24.9)
                {
                    chuanDoan = "Bạn bình thường";
                }
                else if(BMI <= 29.9)
                {
                    chuanDoan = "Bạn béo phì độ 1";

                }
                else if(BMI <= 34.9 )
                {
                    chuanDoan = "Bạn béo phì độ 2";
                }
                else
                {
                    chuanDoan = "Bạn béo phì độ 3";
                }
                DecimalFormat df = new DecimalFormat("#.0");
                editBMI.setText(df.format(BMI));
                editChuanDoan.setText(chuanDoan);
            }
        });
    }


}