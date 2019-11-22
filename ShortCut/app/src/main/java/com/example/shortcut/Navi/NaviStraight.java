package com.example.shortcut.Navi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;

import com.example.shortcut.R;
import java.util.Locale;

import static android.speech.tts.TextToSpeech.ERROR;

public class NaviStraight extends AppCompatActivity {
    private TextToSpeech tts;
    String speechString = "오백 미터 앞으로 직진 하세요";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_straight);

        Button listenAgain = (Button) findViewById(R.id.straight_replay_btn);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int status) {
                if(status != ERROR) {
                    // 언어를 선택한다.
                    tts.setLanguage(Locale.KOREAN);
                }
            }
        });

        listenAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tts.speak(speechString,TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }
}
