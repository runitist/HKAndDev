package com.hkanddev.anddev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //이 액티비티가 실행되면 최초로 실행되는 메서드.
        super.onCreate(savedInstanceState);//조상타입을 실행시킴.
        setContentView(R.layout.activity_main);//이 액티비티와 이어지는 뷰.
        _init();
    }

    private void _init() {
        //액티비티가 실행될 때 같이 실행되는 메서드. 초기화로 사용.
        setTitle(R.string.main_title);//액션바 타이틀을 바꿈.
    }

    public void main_clk(View view) {
        btn = (Button) view;//매개변수를 받아와 객체화후 버튼 변수에 집어넣음.
        if (btn.getId() == (R.id.main_btn1)) {
            Intent intent = new Intent(this, CalculatorActivity.class);
            //이 액티비티에서 다른 클래스 액티비티로 이동.
            Toast.makeText(this, "계산기로 이동합니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            //위에서 설정한 인텐트를 실행시킴.
        } else if (btn.getId() == (R.id.main_btn2)) {
            Intent intent = new Intent(this, MP3Activity.class);
            Toast.makeText(this, "MP3로 이동합니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }
}
