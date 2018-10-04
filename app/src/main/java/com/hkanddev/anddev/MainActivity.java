package com.hkanddev.anddev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button calc_btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _init();
    }

    private void _init() {
        setTitle(R.string.main_title);
    }

    public void main_clk(View view) {
        calc_btn = (Button)view;
        if(calc_btn.getId()==(R.id.main_btn1)){
            Intent intent = new Intent(this, CalculatorActivity.class);
            startActivity(intent);
        }else if(calc_btn.getId()==(R.id.main_btn2)){
            Intent intent = new Intent(this, MP3Activity.class);
            startActivity(intent);
        }
    }
}
