package com.example.standardtool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Double x, y;
    Double sum1, min1, mul1, div1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.editTextTextPersonName3);
        EditText num2 = findViewById(R.id.editTextTextPersonName4);

        TextView result = findViewById(R.id.textView3);


            Button sum = findViewById(R.id.sum);
            sum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {

                        x = Double.valueOf(num1.getText().toString());
                        y = Double.valueOf(num2.getText().toString());

                        sum1 = x + y;

                        result.setText(sum1.toString());


                    } catch(Exception e) {
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this, "값을 입력해 주세요.", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        Button min = findViewById(R.id.min);
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    x = Double.valueOf(num1.getText().toString());
                    y = Double.valueOf(num2.getText().toString());
                    min1 = x - y;
                    result.setText(min1.toString());

                }catch(Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "값을 입력해 주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button mul = findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    x = Double.valueOf(num1.getText().toString());
                    y = Double.valueOf(num2.getText().toString());

                    mul1 = x * y;

                    result.setText(mul1.toString());
                }  catch(Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "값을 입력해 주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button div = findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                x = Double.valueOf(num1.getText().toString());
                y = Double.valueOf(num2.getText().toString());
                if(y == 0){
                    Toast.makeText(getApplicationContext(), "오류", Toast.LENGTH_SHORT).show();
                } else {
                    div1 = x / y;
                    result.setText(div1.toString());
                }
                }  catch(Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "값을 입력해 주세요.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}