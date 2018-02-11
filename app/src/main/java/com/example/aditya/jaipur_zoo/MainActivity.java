package com.example.aditya.jaipur_zoo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void  browser1(View v)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://pinkcity.com/2013/08/13/jaipur-zoo/"));
                startActivity(browserIntent);
    }
}
