package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private Button button;
    public static final String EXTRA_NUMBER1 = "com.example.intentsproj.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.intentsproj.EXTRA_NUMBER2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button";
                //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                openSecondActivity();
            }
        });
    }

    public void openSecondActivity(){
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        int number1 = Integer.parseInt(editText1.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        int number2 = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_NUMBER1, number1);
        intent.putExtra(EXTRA_NUMBER2, number2);
        startActivity(intent);
    }
}


