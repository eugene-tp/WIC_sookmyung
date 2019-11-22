package com.example.shortcut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.Addition.EmergencyContract;
import com.example.shortcut.Addition.Favorite;
import com.example.shortcut.Navi.NaviLecture;
import com.example.shortcut.Navi.NaviLecture2;
import com.example.shortcut.Setting.SettingMain;
import com.kakao.sdk.newtoneapi.TextToSpeechClient;
import com.kakao.sdk.newtoneapi.TextToSpeechManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextToSpeechManager.getInstance().initializeLibrary(getApplicationContext());
    }
    public void onDestroy() {
        super.onDestroy();
        TextToSpeechManager.getInstance().finalizeLibrary();
    }
    public void onClick_navi_lecture(View view){
        Intent intent_navi_lecutre_start = new Intent(this, NaviLecture.class);
        startActivity(intent_navi_lecutre_start);
    }

    public void onClick_setting(View view){
        Intent intent_navi_setting = new Intent(this, SettingMain.class);
        startActivity(intent_navi_setting);
    }

    public void onClick_favorite(View view){
        Intent intent_navi_favorite = new Intent(this, Favorite.class);
        startActivity(intent_navi_favorite);
    }

    public void onClick_emergency(View view){
        Intent intent_emergency = new Intent(this, EmergencyContract.class);
        startActivity(intent_emergency);
    }
    private TextToSpeechClient ttsClient;
}
