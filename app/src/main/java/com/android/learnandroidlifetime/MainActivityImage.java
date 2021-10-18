package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class MainActivityImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_image);
        Button btnLoadHinh = (Button) findViewById(R.id.btnShowImage);
        ImageView imgHinh = (ImageView) findViewById(R.id.imageView);
        btnLoadHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgHinh.setImageResource(R.drawable.makes_money_from_android_teaser);
            }
        });

        /*btnLoadHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    try {
                        URL url = new URL("https://genk.mediacdn.vn/139269124445442048/2021/10/14/photo-1-16341827164962084697582.jpg");
                        Bitmap bm;
                        bm = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                        imgHinh.setImageBitmap(bm);
                    }catch (IOException ex){
                        ex.printStackTrace();
                    }
                }
                catch (MalformedURLException e){
                        e.printStackTrace();
                }
            }
        });*/

    }
}