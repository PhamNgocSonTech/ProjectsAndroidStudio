package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivityImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_image);
        Button btnLoadHinh = (Button) findViewById(R.id.btnShowImage);
        ImageView imgHinh = (ImageView) findViewById(R.id.imageView);
        btnLoadHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgHinh.setImageResource(R.drawable.makes_money_from_android_teaser);
            }
        });
    }
}