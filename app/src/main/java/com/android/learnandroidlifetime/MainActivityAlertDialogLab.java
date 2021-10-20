package com.android.learnandroidlifetime;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivityAlertDialogLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alert_dialog_lab);
        CheckBox chkMU, chkBM, chkBA;
        EditText txtHoTen = (EditText) findViewById(R.id.editTextTen);
        chkMU = findViewById(R.id.checkBoxMU);
        chkBM = findViewById(R.id.checkBoxBM);
        chkBA = findViewById(R.id.checkBoxBA);
        RadioGroup rgColor = findViewById(R.id.rgMauYT);
        Spinner sQQ = findViewById(R.id.spinner2);
        Button btnXuatTT = findViewById(R.id.btnXuatTT);

        ArrayList<String> dsQQ = new ArrayList<String>();
        dsQQ.add("Khánh Hòa");
        dsQQ.add("Hồ Chí Minh");
        dsQQ.add("Long An");
        dsQQ.add("Quảng Ngãi");
        dsQQ.add("Quảng Bình");
        ArrayAdapter adap = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, dsQQ
        );
        sQQ.setAdapter(adap);
        btnXuatTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = (txtHoTen.getText().toString()).trim();
                if (ten.length() < 3) {
                    txtHoTen.requestFocus();
                    txtHoTen.selectAll();
                    Toast.makeText(MainActivityAlertDialogLab.this, "Họ tên phải >= 3 kí tự", Toast.LENGTH_LONG).show();
                    return;
                }
                int id = rgColor.getCheckedRadioButtonId();
                if (id == -1) {
                    Toast.makeText(MainActivityAlertDialogLab.this, "Phải chọn màu", Toast.LENGTH_LONG).show();
                }
                RadioButton rad = (RadioButton) findViewById(id);
                String mauChon = rad.getText().toString();
                String clbYT = "";
                if (chkMU.isChecked()) {
                    clbYT += "\t" + chkMU.getText() + "\n";
                } else if (chkBM.isChecked()) {
                    clbYT += "\t" + chkBM.getText() + "\n";
                } else {
                    clbYT += "\t" + chkBA.getText() + "\n";

                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityAlertDialogLab.this);
                builder.setTitle("THÔNG TIN CÁ NHÂN");
                String msg = ten;
                msg += "\n-------------\n";
                msg += "Quê quán:" + sQQ.getSelectedItem();
                msg += "\n-------------\n";
                msg += "CLB yêu thích: \n";
                msg += clbYT;
                msg += "\n-------------\n";
                msg += "Màu sắc chủ đạo: ";
                msg += mauChon;
                builder.setMessage(msg);
                builder.setPositiveButton("Đóng", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                builder.create().show();

            }
        });


    }
}
