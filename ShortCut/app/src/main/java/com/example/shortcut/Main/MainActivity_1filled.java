package com.example.shortcut.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.Navi.NaviLecture2;
import com.example.shortcut.R;
import com.example.shortcut.Setting.SettingMain;

public class MainActivity_1filled extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1filled);
    }
    public void onClick_navi_1filled(View view){
        Intent intent_navi_1filled = new Intent(this, NaviLecture2.class);
        startActivity(intent_navi_1filled);
    }

    public void onClick_setting(View view){
        Intent intent_setting = new Intent(this, SettingMain.class);
        startActivity(intent_setting);
    }
}
