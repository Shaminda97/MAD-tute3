package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editTxtnum1, editTxtnum2;
    String txtNum1Val, txtNum2Val;
    Button btnAdd, btnSubtract, btnDivide, btnMultiply;
    TextView txtResult;
    int num1, num2, resultNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTxtnum1 = findViewById(R.id.editTxt1);
        editTxtnum2 = findViewById(R.id.editTxt2);
        btnAdd = findViewById(R.id.btnPlus);
        btnSubtract = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        txtResult = findViewById(R.id.txtResult);

        txtNum1Val = getIntent().getExtras().getString("NUM1");
        txtNum2Val = getIntent().getExtras().getString("NUM2");
        editTxtnum1.setText(txtNum1Val);
        editTxtnum2.setText(txtNum2Val);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(txtNum1Val);
                num2 = Integer.parseInt(txtNum2Val);
                resultNum = num1 + num2;
                txtResult.setText(txtNum1Val + " + " +txtNum2Val + " = " + String.valueOf(resultNum));
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(txtNum1Val);
                num2 = Integer.parseInt(txtNum2Val);
                resultNum = num1 - num2;
                txtResult.setText(txtNum1Val + " - " +txtNum2Val + " = " + String.valueOf(resultNum));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(txtNum1Val);
                num2 = Integer.parseInt(txtNum2Val);
                resultNum = num1 * num2;
                txtResult.setText(txtNum1Val + " * " +txtNum2Val + " = " + String.valueOf(resultNum));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(txtNum1Val);
                num2 = Integer.parseInt(txtNum2Val);
                resultNum = num1 / num2;
                txtResult.setText(txtNum1Val + " / " +txtNum2Val + " = " + String.valueOf(resultNum));
            }
        });
    }
}