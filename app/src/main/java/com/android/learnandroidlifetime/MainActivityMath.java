package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityMath extends AppCompatActivity {

    EditText textA, textB;
    TextView viewResult;
    Button btTong, btTru, btTitch,btUCLN , btChia,btQuit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinhtoan_layout);
        RelativeLayout layout = new RelativeLayout(this);
       // layout.setBackgroundColor(Color.GREEN);
        textA = (EditText) findViewById(R.id.editTextA);
        textB = (EditText) findViewById(R.id.editTextB);
        btTong = (Button) findViewById(R.id.buttonTong);
        btTru = (Button) findViewById(R.id.buttonTru);
        btTitch = (Button) findViewById(R.id.buttonNhan);
        btChia = (Button) findViewById(R.id.buttonChia);
        btUCLN = (Button) findViewById(R.id.buttonUCLN);
        btQuit = (Button) findViewById(R.id.buttonQuit);
        viewResult = (TextView) findViewById(R.id.editTextKQ);


        btTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(textA.getText()+"");
                int soB = Integer.parseInt(textB.getText()+"");
                int KQ = soA + soB;
                viewResult.setText(Integer.toString(KQ));

            }
        });

        btTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(textA.getText()+"");
                int soB = Integer.parseInt(textB.getText()+"");
                int KQ = soA - soB;
                viewResult.setText(Integer.toString(KQ));

            }
        });

        btTitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(textA.getText()+"");
                int soB = Integer.parseInt(textB.getText()+"");
                int KQ = soA * soB;
                viewResult.setText(Integer.toString(KQ));

            }
        });

        btChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(textA.getText()+"");
                int soB = Integer.parseInt(textB.getText()+"");
                int KQ = soA / soB;
                viewResult.setText(Integer.toString(KQ));

            }
        });
        btQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"On Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"On Resume", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"On Pause", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"On Stop", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"On Destroy", Toast.LENGTH_LONG).show();

    }
}