package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1,editText2;
    private Button button1, button2;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edittext1id);
        editText2 = findViewById(R.id.edittext2id);
        button1 = findViewById(R.id.button1id);
        button2 = findViewById(R.id.button2id);
        textView1 = findViewById(R.id.text1id);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        try {
            String number1= editText1.getText().toString();
            String number2= editText2.getText().toString();
            //convert to double
            double num1= Double.parseDouble(number1);
            double num2= Double.parseDouble(number2);

            if (v.getId()== R.id.button1id){
                double sum= num1 + num2;
                textView1.setText("Result : "+sum);
            }
            if (v.getId()== R.id.button2id){
                double sub= num1 - num2;
                textView1.setText("Result : "+sub);

            }

        }
        catch (Exception e){

            Toast.makeText(MainActivity.this,"Enter Number",Toast.LENGTH_SHORT).show();
        }

    }
}
