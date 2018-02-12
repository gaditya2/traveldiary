package com.example.kritika.imagebutton;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton androidImageButton1;
    ImageButton androidImageButton2;
    ImageButton androidImageButton3;
    ImageButton androidImageButton4;
    ImageButton androidImageButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidImageButton1 = (ImageButton) findViewById(R.id.imageButton_1);
        androidImageButton2 = (ImageButton) findViewById(R.id.imageButton_2);
        androidImageButton3 = (ImageButton) findViewById(R.id.imageButton_3);
        androidImageButton4 = (ImageButton) findViewById(R.id.imageButton_4);
        androidImageButton5 = (ImageButton) findViewById(R.id.imageButton_5);
        androidImageButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to amer", Toast.LENGTH_SHORT).show();
            }
        });
        androidImageButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to Jaigarh", Toast.LENGTH_SHORT).show();
            }
        });
        androidImageButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to Nargarh", Toast.LENGTH_SHORT).show();
            }
        });
        androidImageButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to Hawa mahal", Toast.LENGTH_SHORT).show();
            }
        });
        androidImageButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to City palace", Toast.LENGTH_SHORT).show();
            }
        });

    }

    }

}
