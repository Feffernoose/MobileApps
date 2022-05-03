package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText textField;
    Button addButton, subtractButton, multiplyButton, divideButton, logButton, calculateButton, clearButton, colorChangeButton;
    float number1, number2;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button) findViewById(R.id.addButton);
        subtractButton = (Button) findViewById(R.id.minusButton);
        multiplyButton = (Button) findViewById(R.id.multiplyButton);
        divideButton = (Button) findViewById(R.id.divideButton);
        calculateButton = (Button) findViewById(R.id.calculateButton);
        clearButton = (Button) findViewById(R.id.calculateButton);

        textField = findViewById(R.id.editText);


        // First, need to get the first number entered then the different buttons will put the different operators into the
        // EditText field and allow us to place more numbers into the function


        addButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          if(textField == null) {
              textField.setText("");
          } else {
              number1 = Float.parseFloat(textField.getText() + "");
              mAddition = true;
              textField.setText(null);
          }
        }
    });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textField == null) {
                    textField.setText("");
                } else {
                    number1 = Float.parseFloat(textField.getText() + "");
                    mSubtract = true;
                    textField.setText(null);
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textField == null) {
                    textField.setText("");
                } else {
                    number1 = Float.parseFloat(textField.getText() + "");
                    mMultiplication = true;
                    textField.setText(null);
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textField == null) {
                    textField.setText("");
                } else {
                    number1 = Float.parseFloat(textField.getText() + "");
                    mDivision = true;
                    textField.setText(null);
                }
            }
        });


        calculateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number2 = Float.parseFloat(textField.getText() + "");

                if (mAddition == true) {
                    textField.setText(number1 + number2 + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    textField.setText(number1 - number2 + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    textField.setText(number1 * number2 + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    textField.setText(number1 / number2 + "");
                    mDivision = false;
                }
            }
        });


    }
}