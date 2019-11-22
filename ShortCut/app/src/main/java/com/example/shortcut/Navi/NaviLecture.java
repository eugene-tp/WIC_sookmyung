package com.example.shortcut.Navi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.Main.MainActivity_1filled;
import com.example.shortcut.Main.MainActivity_2filled;
import com.example.shortcut.MainActivity;
import com.example.shortcut.R;
import com.example.shortcut.Setting.SettingMain;

public class NaviLecture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_lecture);
    }

    public void onClick_navi_lecture_yes(View view){
        Intent intent_navi_lecture_yes = new Intent(this, MainActivity_1filled.class);
        startActivity(intent_navi_lecture_yes);
        finish();
    }

    public void onClick_navi_lecture_no(View view) {
        Intent intent_navi_start_no = new Intent(this, MainActivity.class);
        startActivity(intent_navi_start_no);
        finish();
    }
}
