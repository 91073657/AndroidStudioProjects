package com.example.palmdigital.buttonchallenge1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.button1);
        Button buttonObject02 = (Button) findViewById(R.id.button2);
        Button buttonObject03 = (Button) findViewById(R.id.button3);


        buttonObject01.setText("Contacts");
        buttonObject02.setText("Email");
        buttonObject03.setText("Message");


        buttonObject01.setBackgroundColor(0xff00ff00); // green
        buttonObject02.setBackgroundColor(0xff00ffff); // blue
        buttonObject03.setBackgroundColor(0xffff0000); // red





    }
}
