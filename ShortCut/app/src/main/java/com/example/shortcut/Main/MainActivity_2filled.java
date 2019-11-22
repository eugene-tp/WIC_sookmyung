package com.example.shortcut.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.Navi.NaviLecture;
import com.example.shortcut.Navi.NaviStart;
import com.example.shortcut.R;
import com.example.shortcut.Setting.SettingMain;

public class MainActivity_2filled extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2filled);
    }
    public void onClick_setting(View view){
        Intent intent_setting = new Intent(this, SettingMain.class);
        startActivity(intent_setting);
    }

    public void onClick_navi_start(View view){
        Intent intent_navi_start = new Intent(this, NaviStart.class);
        startActivity(intent_navi_start);
    }
}
