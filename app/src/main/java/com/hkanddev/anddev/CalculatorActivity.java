package com.hkanddev.anddev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    EditText operandEt1 = null, operandEt2 = null;//edittext변수 선언
    TextView operatorTv = null, answerTv = null;//textview변수 선언
    String operand1 = null, operand2 = null, operator = null, result = null;
    //로직 내에서 사용할 연산값1,2 연산자,결과값 변수 선언
    Button btn = null;//온클릭 버튼의 정보를 가져오는 변수 선언.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        _init();
    }

    private void _init() {
        setTitle(R.string.calc_title);
        operandEt1 = findViewById(R.id.operand1);
        operandEt2 = findViewById(R.id.operand2);
        answerTv = findViewById(R.id.answer);
    }

    public void setOperator(View view) {
        //계산기 뷰의 연산자를 결정하는 메서드
        btn = (Button) view;
        operatorTv = findViewById(R.id.operator);
        //이 메서드가 실행된 시점에서 객체화.
        if (btn.getId() == R.id.plus) {
            operator = "+";
            operatorTv.setText(operator);
        } else if (btn.getId() == R.id.minus) {
            operator = "-";
            operatorTv.setText(operator);
        } else if (btn.getId() == R.id.mult) {
            operator = "*";
            operatorTv.setText(operator);
        } else if (btn.getId() == R.id.div) {
            operator = "/";
            operatorTv.setText(operator);
        } else if (btn.getId() == R.id.clear) {
            //C버튼이 눌리면 모든 객체와 값이 초기화
            operator = null;
            operand1 = null;
            operand2 = null;
            result = null;
            operatorTv.setText(operator);
            answerTv.setText(result);
            operandEt1.setText(operand1);
            operandEt2.setText(operand2);
        }
        operatorTv = null;
    }

    public void setOperand(View view) {
        //연산값 입력
    }

    public void calculating(View view) {
        //계산 실행
    }
}
