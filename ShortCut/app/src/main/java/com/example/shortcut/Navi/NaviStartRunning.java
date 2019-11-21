package com.example.shortcut.Navi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.shortcut.Main.SearchMapActivity;
import com.example.shortcut.R;

public class NaviStartRunning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_start_running);

        startLoading();
    }

    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent_Search_Map = new Intent(getBaseContext(), SearchMapActivity.class);
                startActivity(intent_Search_Map);
                finish();
            }
        }, 2000);
    }
}
