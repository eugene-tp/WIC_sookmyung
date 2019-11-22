package com.example.shortcut.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.Addition.EmergencyContract;
import com.example.shortcut.Addition.Favorite;
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
        Intent intent_setting_2filled = new Intent(this, SettingMain.class);
        startActivity(intent_setting_2filled);
    }

    public void onClick_navi_start(View view){
        Intent intent_navi_start = new Intent(this, NaviStart.class);
        startActivity(intent_navi_start);
    }
    public void onClick_favorite_2filled(View view){
        Intent intent_favorite_2filled = new Intent(this, Favorite.class);
        startActivity(intent_favorite_2filled);
    }

    public void onClick_emergency_2filled(View view){
        Intent intent_emergency_2filled = new Intent(this, EmergencyContract.class);
        startActivity(intent_emergency_2filled);
    }
}
