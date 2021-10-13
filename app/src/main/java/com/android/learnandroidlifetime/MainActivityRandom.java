package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivityRandom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_layout);
        TextView result;
        Button btnR;

        result = (TextView) findViewById(R.id.txtvRandom);
        btnR = (Button) findViewById(R.id.btnRandom);

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int value = new Random().nextInt(61) + 20;
                result.setText(String.valueOf(value));
            }
        });
    }
}