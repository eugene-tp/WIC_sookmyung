package com.example.shortcut.Navi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.Main.MainActivity_1filled;
import com.example.shortcut.Main.MainActivity_2filled;
import com.example.shortcut.R;

public class NaviLecture2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_lecture2);
    }

    public void onClick_navi_lecture_end_no(View view) {
        Intent intent_navi_lecture_end_no = new Intent(this, MainActivity_1filled.class);
        startActivity(intent_navi_lecture_end_no);
        finish();
    }
    public void onClick_navi_lecture_end_yes(View view) {
        Intent intent_navi_start_end_yes = new Intent(this, MainActivity_2filled.class);
        startActivity(intent_navi_start_end_yes);
        finish();
    }
}
