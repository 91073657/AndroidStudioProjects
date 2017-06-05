package com.example.palmdigital.simplecalcv02;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    TextView textView_top;
    TextView textView_mid;
    TextView textView_bot;



    ImageView imageViewNum0;
    ImageView imageViewNum1;
    ImageView imageViewNum2;
    ImageView imageViewNum3;
    ImageView imageViewNum4;
    ImageView imageViewNum5;
    ImageView imageViewNum6;
    ImageView imageViewNum7;
    ImageView imageViewNum8;
    ImageView imageViewNum9;
    ImageView plus;
    ImageView minus;
    ImageView equal;
    int num1, num2;

    

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_top = (TextView) findViewById(R.id.textView_top);
        textView_mid = (TextView) findViewById(R.id.textView_mid);
        textView_bot = (TextView) findViewById(R.id.textView_bot);

        // top numbers
        imageViewNum0 = (ImageView) findViewById(R.id.imageView0);
        imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        imageViewNum7 = (ImageView) findViewById(R.id.imageView7);
        imageViewNum8 = (ImageView) findViewById(R.id.imageView8);
        imageViewNum9 = (ImageView) findViewById(R.id.imageView9);


        //mid numbers
        imageViewNum0 = (ImageView) findViewById(R.id.imageView_0);
        imageViewNum1 = (ImageView) findViewById(R.id.imageView_1);
        imageViewNum2 = (ImageView) findViewById(R.id.imageView_2);
        imageViewNum3 = (ImageView) findViewById(R.id.imageView_3);
        imageViewNum4 = (ImageView) findViewById(R.id.imageView_4);
        imageViewNum5 = (ImageView) findViewById(R.id.imageView_5);
        imageViewNum6 = (ImageView) findViewById(R.id.imageView_6);
        imageViewNum7 = (ImageView) findViewById(R.id.imageView_7);
        imageViewNum8 = (ImageView) findViewById(R.id.imageView_8);
        imageViewNum9 = (ImageView) findViewById(R.id.imageView_9);


        plus = (ImageView) findViewById(R.id.plus);
        minus = (ImageView) findViewById(R.id.minus);
        equal = (ImageView) findViewById(R.id.equal);


        num1 = 1; num2 = 2;















    }
}
