package com.example.week2app1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1, spinner2;
    EditText editText1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinnerFrom);
        spinner2 = findViewById(R.id.spinnerTo);
        editText1 = findViewById(R.id.textAmount);
        button1 = findViewById(R.id.button1);

        String [] from = {"USD"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        spinner1.setAdapter(ad1);

        String [] to = {"Euro", "Pound"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        spinner2.setAdapter(ad2);

        button1 = findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Double total;

                Double amount = Double.parseDouble(editText1.getText().toString());

                if (spinner1.getSelectedItem().toString().equals("USD") && spinner2.getSelectedItem().toString().equals("Euro")) {
                    total = amount * 0.93;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spinner1.getSelectedItem().toString().equals("USD") && spinner2.getSelectedItem().toString().equals("Pound")) {
                    total = amount * 0.79;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}