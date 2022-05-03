package com.example.displaycount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.displayCount);
    }

    public void count(View view) {
        counter++;
        textView.setText(String.valueOf(counter));
    }

    public void toast(View view) {
        Toast.makeText(this, textView.getText().toString(), Toast.LENGTH_LONG).show();

    }
}