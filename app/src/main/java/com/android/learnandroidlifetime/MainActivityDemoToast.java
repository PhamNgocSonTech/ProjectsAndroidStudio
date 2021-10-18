package com.android.learnandroidlifetime;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivityDemoToast extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3;
    Button btnPlayRandom;
    Random r;
    int lengthArray;
    int[] images = {
            R.drawable.nobita,
            R.drawable.doraemon,
            R.drawable.dorami,
            R.drawable.shizuka,
            R.drawable.suneo,
            R.drawable.takeshi,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_demo_toast);
        r = new Random();
        btnPlayRandom = (Button) findViewById(R.id.btnPlayImageRandom);
        imageView1 = (ImageView) findViewById(R.id.imageView2);
        imageView2 = (ImageView) findViewById(R.id.imageView3);
        imageView3 = (ImageView) findViewById(R.id.imageView4);

        btnPlayRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(images[ r.nextInt(images.length)]);
                imageView2.setImageResource(images[ r.nextInt(images.length)]);
                imageView3.setImageResource(images[ r.nextInt(images.length)]);

                /*Resources res = getResources();
                String mDrawableName = "nobita.jpg";
                int resID = res.getIdentifier(mDrawableName, "drawable", getPackageName());
                Drawable drawable = res.getDrawable(resID);
                ImageView icon = null;
                icon.setImageDrawable(drawable);*/
            }
        });



    }
}