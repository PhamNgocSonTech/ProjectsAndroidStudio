package com.android.learnandroidlifetime;

import android.view.View;
import android.widget.Toast;

public class MyEvent implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSuKienClick5){
            Toast.makeText(v.getContext(), "Su Kien 5 Ne", Toast.LENGTH_LONG).show();
        }
    }
}
