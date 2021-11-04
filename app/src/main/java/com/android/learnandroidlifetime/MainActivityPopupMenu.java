package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivityPopupMenu extends AppCompatActivity {
    private Button btnCheck, btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
        btnCheck = findViewById(R.id.btnCheckMe);
        btnMenu = findViewById(R.id.btnPopup);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkMeClick();
            }
        });
    }
    private void checkMeClick(){
        //khi ng dùng click vào btn này thì tạo popup menu
        //Neo popupmenu đến btnPopup
        PopupMenu popup = new PopupMenu(this, btnMenu);
        popup.inflate(R.menu.popupmenu);
        Menu menu = popup.getMenu();
        Log.i("DemoPopupMenu","Menu Class"+menu.getClass().getName());
    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            return menuItemClick(item);
        }
    });
    //Show popupmenu lên
    popup.show();
    }
    //khi user click vào Menu Item
    //trả về true nếu sự kiện đc xử lý
    private boolean menuItemClick(MenuItem item){
    switch (item.getItemId()){
        case R.id.menuItemUpload:
            Toast.makeText(this, "Upload", Toast.LENGTH_SHORT).show();
            break;
        case R.id.menuItemBookmark:
            Toast.makeText(this,"Bookmark",Toast.LENGTH_SHORT).show();
            break;
        case R.id.menuItemShare:
            Toast.makeText(this,"Share", Toast.LENGTH_SHORT).show();
            break;
        case R.id.menuItemFB:
            Toast.makeText(this,"Facebook", Toast.LENGTH_SHORT).show();
            break;
        case R.id.menuItemTwitter:
            Toast.makeText(this, "Twitter", Toast.LENGTH_SHORT).show();
            break;
    }

        return  true;
    }
}