package com.hkanddev.anddev;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MP3Activity extends AppCompatActivity {
    private Button btn = null;//버튼의 객체
    private int id = 0;//각 버튼의 id값
    private int stat = 0;//음악의 상태 시작 : 1, 정지 ==0, 일시정지 ==-1
    private MediaPlayer mp = null;//음악 플레이어 객체

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3);
        _init();
    }

    private void _init() {
        setTitle(R.string.mp3_title);
    }

    public void mp3clk(View view) {
        btn = (Button) view;
        id = btn.getId();
        if (id == R.id.music1) {
            stopTheMusic();
            mp = MediaPlayer.create(this, R.raw.believer);
            mp.start();
            stat = 1;
        } else if (id == R.id.music2) {
            stopTheMusic();
            mp = MediaPlayer.create(this, R.raw.dragonblade);
            mp.start();
            stat = 1;
        } else if (id == R.id.music3) {
            stopTheMusic();
            mp = MediaPlayer.create(this, R.raw.galwaygirl);
            mp.start();
            stat = 1;
        } else if (id == R.id.music4) {
            stopTheMusic();
            mp = MediaPlayer.create(this, R.raw.natural);
            mp.start();
            stat = 1;
        } else if (id == R.id.music5) {
            stopTheMusic();
            mp = MediaPlayer.create(this, R.raw.sevenyears);
            mp.start();
            stat = 1;
        } else if (id == R.id.music6) {
            stopTheMusic();
            mp = MediaPlayer.create(this, R.raw.shapeofyou);
            mp.start();
            stat = 1;
        } else if (id == R.id.pause) {
            if (mp != null) {
                if (stat == 1) {
                    mp.pause();
                    stat = -1;
                } else if (stat == -1) {
                    mp.start();
                    stat = 1;
                }
            } else {
                Toast.makeText(this, "재생할 노래를 선택해주세요.", Toast.LENGTH_SHORT).show();
            }
        } else if (id == R.id.stop) {
            stopTheMusic();
        }
        pauseTextUpdate();
    }

    private void stopTheMusic() {
        //음악 객체를 비우는 메서드
        if (mp != null) {
            mp.stop();
            mp = null;
            stat = 0;
        }
    }

    private void pauseTextUpdate() {
        //일시정지 버튼의 텍스트를 변경하는 메서드
        if (stat == 1) {
            Button btn = findViewById(R.id.pause);
            btn.setText(getText(R.string.pauseTextUpdate1));
        } else if (stat != 1) {
            Button btn = findViewById(R.id.pause);
            btn.setText(getText(R.string.pauseTextUpdate2));
        }
    }
}
