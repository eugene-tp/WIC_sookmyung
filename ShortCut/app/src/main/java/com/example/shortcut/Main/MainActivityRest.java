package com.example.shortcut.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.Addition.EmergencyContract;
import com.example.shortcut.Addition.Favorite;
import com.example.shortcut.R;
import com.example.shortcut.Setting.SettingMain;

public class MainActivityRest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rest);
    }
    public void onClick_setting(View view){
        Intent intent_rest_setting = new Intent(this, SettingMain.class);
        startActivity(intent_rest_setting);
    }

    public void onClick_favorite(View view){
        Intent intent_rest_favorite = new Intent(this, Favorite.class);
        startActivity(intent_rest_favorite);
    }

    public void onClick_emergency(View view){
        Intent intent_rest_emergency = new Intent(this, EmergencyContract.class);
        startActivity(intent_rest_emergency);
    }
}
