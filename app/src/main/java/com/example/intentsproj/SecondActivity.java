package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int number1 = intent.getIntExtra(FirstActivity.EXTRA_NUMBER1, 0);
        int number2 = intent.getIntExtra(FirstActivity.EXTRA_NUMBER2, 0);

        EditText edTxt1 = (EditText) findViewById(R.id.editText1);
        EditText edTxt2 = (EditText) findViewById(R.id.editText2);

        edTxt1.setText("" + number1);
        edTxt2.setText("" + number2);

    }

    public void onButtonAdd(View view){

        String addition;

        EditText num1 = (EditText) findViewById(R.id.editText1);
        EditText num2 = (EditText) findViewById(R.id.editText2);

        TextView result = (TextView)findViewById(R.id.textView7);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        int add = number1 + number2;
        addition = number1 + " + " + number2 + " = " + (add);

        result.setText(addition);
    }

    public void onButtonSub(View view){

        String subtraction;

        EditText num1 = (EditText) findViewById(R.id.editText1);
        EditText num2 = (EditText) findViewById(R.id.editText2);

        TextView result = (TextView)findViewById(R.id.textView7);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        int sub = number1 - number2;
        subtraction = number1 + " - " + number2 + " = " + (sub);

        result.setText(subtraction);
    }

    public void onButtonMul(View view) {

        String multiplication;

        EditText num1 = (EditText) findViewById(R.id.editText1);
        EditText num2 = (EditText) findViewById(R.id.editText2);

        TextView result = (TextView) findViewById(R.id.textView7);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        int mul = number1 * number2;
        multiplication = number1 + " * " + number2 + " = " + (mul);

        result.setText(multiplication);
    }

    public void onButtonDiv(View view){

        String division;

        EditText num1 = (EditText) findViewById(R.id.editText1);
        EditText num2 = (EditText) findViewById(R.id.editText2);

        TextView result = (TextView)findViewById(R.id.textView7);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        int div = number1 / number2;
        division = number1 + " / " + number2 + " = " + (div);

        result.setText(division);
    }
}
