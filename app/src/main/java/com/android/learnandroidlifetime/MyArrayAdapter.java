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


public class MyArrayAdapter extends ArrayAdapter<SinhVien> {
            Activity context = null;
            ArrayList<SinhVien> myArr = null;
            int layoutID;
    /**
     * Constructor này dùng để khởi tạo các giá trị
     * từ MainActivity truyền vào
     * @param context : là Activity từ Main
     * @param layoutID: Là layout custom do ta tạo (my_item_layout.xml)
     * @param arrList : Danh sách nhân viên truyền từ Main
     */
    public MyArrayAdapter(Activity context, int layoutID, ArrayList<SinhVien> arrList) {
        super(context, layoutID, arrList);
        this.context = context;
        this.layoutID = layoutID;
        this.myArr = arrList;
    }
    /**
     * hàm dùng để custom layout, ta phải override lại hàm này
     * từ MainActivityCustomListView truyền vào
     * @param position : là vị trí của phần tử trong danh sách nhân viên
     * @param convertView: convertView, dùng nó để xử lý Item
     * @param parent : Danh sách nhân viên truyền từ Main
     * @return View: trả về chính convertView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        /**
         * bạn chú ý là ở đây Tôi không làm:
         * if(convertView==null)
         * {
         * LayoutInflater inflater=
         * context.getLayoutInflater();
         * convertView=inflater.inflate(layoutId, null);
         * }
         * Lý do là ta phải xử lý xóa phần tử Checked, nếu dùng If thì
         * nó lại checked cho các phần tử khác sau khi xóa vì convertView
         * lưu lại trạng thái trước đó
         */
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layoutID, null);
        if(myArr.size() > 0  && position >= 0){
            //Lấy ra TextView tên và id để hiển thị lên
            final TextView display = convertView.findViewById((R.id.txtItem));
            //Lấy ra sinh viên thứ position
            final SinhVien sv = myArr.get(position);
            //sv. toString trả về ID và tên
            display.setText(sv.toString());
            //Lấy ra ImageView để hiển thị đúng icon giới tính
            final ImageView imgItem = convertView.findViewById(R.id.imgItem);
            if(sv.isGioiTinh()){
                //Nếu là nam thì lấy icon của con trai
                imgItem.setImageResource((R.drawable.icon_male));
            }else{
                //Ngược lại lấy icon của nu
                imgItem.setImageResource(R.drawable.icon_female);
            }
        }
        return  convertView;
    }
}

