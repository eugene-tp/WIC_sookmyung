package com.example.shortcut.StepCampus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.shortcut.Main.MainActivity_1filled;
import com.example.shortcut.Main.SearchMapActivity;
import com.example.shortcut.MainActivity;
import com.example.shortcut.R;

import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

public class NaviStep1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_lecture);
    }

}

