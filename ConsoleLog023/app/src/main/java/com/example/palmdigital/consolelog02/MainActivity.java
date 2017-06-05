package com.example.palmdigital.consolelog02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private int myInt;
    private double myDouble;
    private String myString;





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt - " + myInt);
        double myDouble = setDoubleValue(); // myDouble should be set to 10.987
        Log.i("info", "myDouble = " + myDouble);

        // declare a variable myBoolean that calls a function called setBooleanValue()
        // your function should return a boolean (set it to return true or false)

        Boolean myBoolean = setBooleanvalue(); // should be set to false
        Log.i("info", "myBoolean = " + myBoolean);

        // declare a float variable called myFloat

    }
    public boolean setBooleanvalue()
    {
        return 7
    }

    public double setDoubleValue()
    {
        return 10.987;
    }

    public int setIntValue()
    {
        return 5;
    }
}
