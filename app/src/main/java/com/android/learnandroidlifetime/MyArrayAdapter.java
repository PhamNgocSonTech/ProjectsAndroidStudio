package com.android.learnandroidlifetime;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<SinhVien> {
            Activity context = null;
            ArrayList<SinhVien> myArr = null;
            int layoutID;

    public MyArrayAdapter(Activity context, int layoutID, ArrayList<SinhVien> arrList) {
        super(context, layoutID, arrList);
        this.context = context;
        this.layoutID = layoutID;
        this.myArr = arrList;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutID, null);
        if(myArr.size() > 0  && position >=0){
            final TextView txtdisplay = (TextView) convertView.findViewById((R.id.txtitem));
            final SinhVien emp = myArr.get(position);
            txtdisplay.setText(emp.toString());
            final ImageView imgItem = (ImageView) convertView.findViewById(R.id.imgitem);
            if(emp.isGioiTinh()){
                imgItem.setImageResource((R.drawable.icon_female));
            }else{
                imgItem.setImageResource(R.drawable.icon_male);
            }
        }
        return  convertView;
    }
}

