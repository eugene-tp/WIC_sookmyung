package com.example.shortcut.Setting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shortcut.R;

public class SettingMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_main);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("설정");

        View.OnClickListener listener= new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.setting_main_voice_guide_btn:
                        break;
                    case R.id.setting_main_mic_btn:
                        break;
                    case R.id.setting_main_vibration_btn:
                        break;
                    case R.id.setting_main_schedule_btn:
                        break;
                    case R.id.setting_main_beacon_btn:
                        break;
                    case R.id.setting_main_account_btn:
                        break;
                    case R.id.setting_main_close_btn:
                        break;
                }
            }
        };
    }
}
