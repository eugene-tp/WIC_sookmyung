package com.example.shortcut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import com.example.shortcut.Navi.NaviStart;
import com.example.shortcut.Setting.SettingMain;
import com.kakao.sdk.newtoneapi.TextToSpeechManager;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
    public void onClick_navi_start(View view){
        Intent intent_navi_start = new Intent(this, NaviStart.class);
        startActivity(intent_navi_start);
    }

    public void onClick_setting(View view){
        Intent intent_navi_start = new Intent(this, SettingMain.class);
        startActivity(intent_navi_start);
    }

}
