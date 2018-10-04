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
    Button btn = null;//온클릭 메서드 버튼의 정보를 가져올 변수 선언.
    String operand1 = "", operand2 = "", operator = "", result = "";
    //로직 내에서 사용할 연산값1,2 연산자,결과값 변수 선언(null이 아닌 빈문자열 선언.)

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
        operatorTv = findViewById(R.id.operator);
        answerTv = findViewById(R.id.answer);
        //각 뷰 요소의 객체화
    }

    public void setOperator(View view) {
        //계산기 뷰의 연산자를 결정하는 메서드
        btn = (Button) view;
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
            operator = "";
            operand1 = "";
            operand2 = "";
            result = "";
            operatorTv.setText(operator);
            operandEt1.setText(operand1);
            operandEt2.setText(operand2);
            answerTv.setText(result);
        }
    }

    public void setOperand(View view) {
        //연산값 입력
        //연산자가 입력되지 않은땐 값1에, 연산자가 입력되면 값 2에 입력. 그리고 각 4자리씩만.
        btn = (Button) view;//온클릭으로 넘어온 값을 저장하는 객체를 생성
        if(operator.equals("")&&operand1.length()<4){
            operand1 +=btn.getText();
            operandEt1.setText(operand1);
        }else if(!operator.equals("")&&operand2.length()<4){
            operand2 +=btn.getText();
            operandEt2.setText(operand2);
        }
    }

    public void calculating(View view) {
        //계산 실행(위의 멤버변수에 저장된 값으로 계산은 실행.)
    }
}
