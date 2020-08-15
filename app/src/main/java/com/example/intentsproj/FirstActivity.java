package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button bOk;
    EditText editTxtNumber1, editTxtNumber2;
    String num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        bOk = findViewById(R.id.btnOk);
        editTxtNumber1 = findViewById(R.id.editTxtFirstNumber1);
        editTxtNumber2 = findViewById(R.id.editTxtFirstNumber2);


        Context context = getApplicationContext();                    //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";    //Display string
        int duration = Toast.LENGTH_SHORT;                          //How long the toast message will lasts
        final Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);



        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                num1 = editTxtNumber1.getText().toString();
                num2 = editTxtNumber2.getText().toString();
                intent.putExtra("NUM1", num1);
                intent.putExtra("NUM2", num2);
                toast.show();
                startActivity(intent);
            }
        });
    }
}