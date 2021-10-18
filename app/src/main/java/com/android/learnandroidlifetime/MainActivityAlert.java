package com.android.learnandroidlifetime;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivityAlert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alert);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityAlert.this);
        builder.setTitle("Thoát ứng dụng").setMessage("Bạn muốn thoát ứng dụng chứ?");
       // builder.setCancelable(true);
        ImageView imgHinh = (ImageView) findViewById(R.id.imageViewAlert);
        imgHinh.setImageResource(R.drawable.android_logo);

        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(MainActivityAlert.this,"Thoát",
                        Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(MainActivityAlert.this,"Chào mừng bạn trở lại ứng dụng",
                        Toast.LENGTH_SHORT).show();
                //  Cancel
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}