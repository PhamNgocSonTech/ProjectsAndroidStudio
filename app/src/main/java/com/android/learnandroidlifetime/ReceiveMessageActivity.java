package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();//laays intent da dc gui den
        //Gan thong diep da dc gui den vao bien messageText
        String messageText = intent.getStringExtra("messsage");
        TextView textViewMess = findViewById(R.id.textViewMess);
        //show thong diep do len texView cua ReceiveMessageActivity
        textViewMess.setText(messageText);

    }
}