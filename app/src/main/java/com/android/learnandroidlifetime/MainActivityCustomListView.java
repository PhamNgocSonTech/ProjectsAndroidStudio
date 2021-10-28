package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioGroup;
import java.util.ArrayList;

public class MainActivityCustomListView extends AppCompatActivity {
    Button btnInput;
    ImageButton btnXoa;
    RadioGroup genderGroup;
    EditText editMa, editTen;
    ListView lvSV;
    //Sử dụng MyArrayAdapter đã được tạo thay vì ArrayAdapter
    MyArrayAdapter adapter = null;
    ArrayList<SinhVien> arrSV = new ArrayList<SinhVien>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_custom_list_view);
        lvSV = (ListView) findViewById(R.id.lvSinhVien);
        genderGroup = (RadioGroup)findViewById(R.id.genderGroup);
        btnInput  = findViewById(R.id.btnNhapSV);
        btnXoa = findViewById(R.id.imageButtonXoa);
        editMa = findViewById(R.id.editTextIDSV);
        editTen = findViewById(R.id.editTextHoTen);
        arrSV = new ArrayList<SinhVien>();
        adapter = new MyArrayAdapter(
        //Khởi tạo adapter và gán Data source
                MainActivityCustomListView.this,// Main hiện tại
                R.layout.layout_gender,//lấy layout custom
                arrSV);//data source
        lvSV.setAdapter(adapter);//đưa adapter vào ListView

            btnInput.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Gọi pthuc input();
                    input();
                }
            });
            
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gọi pthuc remove();

                remove();
            }
        });

    }
    //Method xử lý việc nhập dữ liệu
    public void input(){
        String ma = editMa.getText()+ " ";
        String ten = editTen.getText()+ " ";
        boolean gender = true;//nam = true
        if(genderGroup.getCheckedRadioButtonId() == R.id.radioBtnFemale){
            gender = false; //
        }
        //tạo một sinh viên
        SinhVien sv = new SinhVien();
        sv.setMaSV(ma);
        sv.setHoTen(ten);
        sv.setGioiTinh(gender);
        arrSV.add(sv);//đưa sv vào ds
        adapter.notifyDataSetChanged();//cập nhật lên giao diện
        //khi đã cập nhật xong thì xóa trắng dữ liệu
        editMa.setText("");
        editTen.setText("");
        editMa.requestFocus();
    }
    //Method xử lý việc xóa dữ liệu
    public void remove(){
        for (int i = lvSV.getChildCount() - 1 ; i >= 0 ; i--)
        {
            //lấy ra dòng thứ i trong ListView
            // Dòng thứ i sẽ có 3 phần tử: ImageView, TextView, Checkbox
           View v = lvSV.getChildAt(i);
           CheckBox chk = (CheckBox) v.findViewById(R.id.chkitem);
            if(chk.isChecked())//nếu phần tử nào đc check thì xóa
            {
                //xóa ptu thứ i ra khỏi DS
                arrSV.remove(i);
            }
        }
        adapter.notifyDataSetChanged();
    }
}