package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityDemoIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_demo_intent);
        Button btnGG, btnCaller, btnDial, btnContact, btnSMS, btnViewImage, btnMusic, bttAddress;
        btnGG = (Button) findViewById(R.id.btnSearch);
        btnCaller = (Button) findViewById(R.id.btnCall);
        btnDial = (Button) findViewById(R.id.btnDial);
        btnContact = (Button) findViewById(R.id.btnContact);
        btnSMS = (Button) findViewById(R.id.btnImg);
        btnGG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com.vn"));
                MainActivityDemoIntent.this.startActivity(myIntent1);
            }
        });
        btnCaller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent2 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+84)999333777"));
                MainActivityDemoIntent.this.startActivity(myIntent2);

            }
        });
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent3 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)999333777"));
                MainActivityDemoIntent.this.startActivity(myIntent3);

            }
        });
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people//"));
                MainActivityDemoIntent.this.startActivity(myIntent4);
            }
        });

        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(); myIntent.setType("image/pictures/*");
                myIntent.setAction(Intent.ACTION_GET_CONTENT);
                MainActivityDemoIntent.this.startActivity(myIntent);
            }
        });


    }
}