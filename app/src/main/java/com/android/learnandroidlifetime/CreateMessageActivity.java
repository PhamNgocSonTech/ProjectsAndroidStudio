package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        Button btnMess = findViewById(R.id.btnMess);
        btnMess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSendMessage(v);
            }
        });
    }

    public void onSendMessage(View v){
        //layas noi dung tren textView

        EditText editTextMess = findViewById(R.id.editTextMess);
        //lay gia tri tren text gan vao messText va dua ve kieu String
        String messText = editTextMess.getText().toString();


        //tao intent de gui noi dung di
        Intent intent = new Intent(CreateMessageActivity.this, ReceiveMessageActivity.class);
        //day thong diep tu text qua ReceiveMessageActivity bang putExtra
        intent.putExtra("messsage",messText);//putExtra("key", value)
        startActivity(intent);

    }


}