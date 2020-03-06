package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    private Button countButton;
    private Button allButton;
    private TextView textView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton = findViewById(R.id.button);
        allButton = findViewById(R.id.button2);
        textView= findViewById(R.id.textView);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText(""+count);
            }
        });

        //allButton.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
              //  Toast all = Toast.makeText(MainActivity.this,"this is a toast");
            //}
        //});

    }
}
