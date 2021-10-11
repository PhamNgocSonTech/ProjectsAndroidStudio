package com.android.learnandroidlifetime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




import androidx.appcompat.app.AppCompatActivity;

import com.android.learnandroidlifetime.R;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Button by its ID
        this.button1 = (Button) this.findViewById(R.id.button1);

        // Find button by its ID
        this.button2 = (Button) this.findViewById(R.id.button2);

        // Find button by its ID.
        this.button3 = (Button) this.findViewById(R.id.button3);

        // Find button by its ID.
        this.button4 = (Button) this.findViewById(R.id.button4);

        this.button5 = (Button) this.findViewById(R.id.button5);

        // Called when the user clicks the button1.
        button1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Create a Intent:
                // (This object contains content that will be sent to Example1Activity).
                Intent myIntent = new Intent(MainActivity.this, MainActivityMath.class);

                // Put parameters

                // Start Example1Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });

        // Called when the user clicks the button2.
        button2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {


            }
        });

        // Called when the user clicks the button3.
        button3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        button4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        button5.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}