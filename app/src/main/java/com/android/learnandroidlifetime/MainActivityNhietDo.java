package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityNhietDo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nhietdo2_layout);
        EditText textInput;
        TextView showResult;
        Button btnF, btnC, btnClear;
        textInput = (EditText) findViewById(R.id.editTextTemp);
        btnF = (Button) findViewById(R.id.btnF);
        btnC = (Button) findViewById(R.id.btnC);
        showResult = (TextView) findViewById(R.id.txtKQ);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double numTemp = Double.parseDouble(textInput.getText().toString());
               double resultC = fahrenheitToCelcius(numTemp);
               showResult.setText(Double.toString(resultC));
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   double soF = Double.parseDouble(textF.getText() + " ");
                double numTemp = Double.parseDouble((textInput.getText().toString()));
                double resultF = celciusToFahrenheit(numTemp);
                showResult.setText(Double.toString(resultF));
            }
        });

    }

    public double fahrenheitToCelcius(double F){
        return ((F - 32) * 5/9);
    }

    public double celciusToFahrenheit(double C){
        return ((C * 9/5) + 32);
    }
}