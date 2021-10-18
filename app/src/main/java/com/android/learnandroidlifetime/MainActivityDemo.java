package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivityDemo extends AppCompatActivity implements View.OnClickListener {
    //Bien Listener
    View.OnClickListener myOnClickListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablelayout2);

        Button btnSuKien2 =  findViewById(R.id.btnSuKienClick2);
        btnSuKien2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityDemo.this, "Su kien 2 ne", Toast.LENGTH_LONG).show();
            }
        });
        Button btnSuKien3 =  findViewById(R.id.btnSuKienClick3);
        btnSuKien3.setOnClickListener(this);
        //trien khai myOnClickListener;
        myOnClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityDemo.this, "Su Kien 4 Ne",Toast.LENGTH_LONG).show();
            }
        };
        Button btnSuKien4 =  findViewById(R.id.btnSuKienClick4);
        btnSuKien4.setOnClickListener(myOnClickListener);
        Button btnSuKienClick5Class = findViewById(R.id.btnSuKienClick5);
        btnSuKienClick5Class.setOnClickListener(new MyEvent());

        Button btn6 = new AppCompatButton(this){
            public boolean performClick(){
                Toast.makeText(MainActivityDemo.this,"Su Kien 6 Ne", Toast.LENGTH_LONG).show();
                return super.performClick();
            }
        };
        btn6.setText("Su Kien 6 Ne");
        TableRow tableRow;

    }
   public void btn_SuKienClick1(View v){
        Toast.makeText(this,"Hello Guy",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivityDemo.this,"Su Kien 3 Ne", Toast.LENGTH_LONG).show();

    }
}