package com.example.shortcut.Navi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.MainActivity;
import com.example.shortcut.R;

public class NaviStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_start);
    }
    public void onClick_navi_running(View view){
        Intent intent_navi_running = new Intent(this, NaviStartRunning.class);
        startActivity(intent_navi_running);
    }

    public void onClick_navi_return(View view){
        Intent intent_navi_running = new Intent(this, MainActivity.class);
        startActivity(intent_navi_running);
    }
}