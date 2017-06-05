package org.palmdigital.madlibs2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    // field
    String story;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
              story = null;
            }
            else
            {
                story = extras.getString("STORY_SO_FAR1");
            }



        }




    }

    public void makeStory(View view)
    {
        TextView tv_story = (TextView)findViewById(R.id.text_view_story);
        //tv_story.setText();
    }
}
