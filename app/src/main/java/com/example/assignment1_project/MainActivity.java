package com.example.assignment1_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        counterTextView = findViewById(R.id.counterTextView);
        Button toastButton = findViewById(R.id.toastButton);
        Button countButton = findViewById(R.id.countButton);


        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
                counterTextView.setText("0");
            }
        });
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = counterTextView.getText().toString();
                int currentCount = Integer.parseInt(currentText);
                counterTextView.setText(String.valueOf(currentCount + 1));
            }
        });
    }
}