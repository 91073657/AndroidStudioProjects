package org.palmdigital.madlibs2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View view)
    {
        // references to UI element
        EditText et_adj1 = (EditText)findViewById(R.id.edit_text_adj1);
        EditText et_nation = (EditText)findViewById(R.id.edit_text_nation);

        // Strings from EditTexts
        String str_adj1 = et_adj1.getText().toString();
        String str_nation = et_nation.getText().toString();

        // story
        String story = "Pizza was invented by a " + str_adj1 + " " + str_nation + "chef.";

        Intent i = new Intent(this, Main2Activity.class);

        i.putExtra("STORY_SO_FAR1", story);

        startActivity(i);

    }
}
