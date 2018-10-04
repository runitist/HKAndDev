package com.hkanddev.anddev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        _init();
    }

    private void _init() {
        setTitle(R.string.calc_title);
    }

    public void setOperator(View view) {
        //연산자 입력
    }

    public void setOperand(View view) {
        //연산값 입력
    }

    public void calculating(View view){
        //계산 실행
    }
}
