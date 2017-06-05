package org.palmdigital.madlibsummer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeStory(View view)
    {
        // get all the references
        EditText et_per01 = (EditText) findViewById(R.id.edit_text_per01);
        EditText et_place = (EditText) findViewById(R.id.edit_text_place);
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_place2 = (EditText) findViewById(R.id.edit_text_place2);
        EditText et_pluralnoun = (EditText) findViewById(R.id.edit_text_pluralnoun);
        EditText et_adj02 = (EditText) findViewById(R.id.edit_text_adj02);
        EditText et_pluralnoun02 = (EditText) findViewById(R.id.edit_text_pluralnoun02);
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);




        // strings for the story
        String story ="Last summer, my mom and dad took me and";
        String str_per01 = et_per01.getText().toString();
        String str_place = et_place.getText().toString();
        String str_adj01 = et_adj01.getText().toString();
        String str_pluralnoun = et_pluralnoun.getText().toString();
        String str_place2 = et_place2.getText().toString();
        String str_adj02 = et_adj02.getText().toString();
        String str_pluralnoun02 = et_pluralnoun02.getText().toString();






        tv_story.setText(story);
    }
}
