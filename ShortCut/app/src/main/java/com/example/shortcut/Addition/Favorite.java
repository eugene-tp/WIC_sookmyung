package com.example.shortcut.Addition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shortcut.Main.MainActivityRest;
import com.example.shortcut.Main.MainActivity_1filled;
import com.example.shortcut.Main.MainActivity_2filled;
import com.example.shortcut.R;

public class Favorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
    }
    public void onClick_prime203(View view){
        Intent intent_prime203 = new Intent(this, MainActivity_2filled.class);
        startActivity(intent_prime203);
    }
    public void onClick_myungsin322(View view){
        Intent intent_myungsin322 = new Intent(this, MainActivity_1filled.class);
        startActivity(intent_myungsin322);
    }

    public void onClick_center(View view){
        Intent intent_center = new Intent(this, MainActivityRest.class);
        startActivity(intent_center);
    }
}
