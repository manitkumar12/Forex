package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Articles_forex extends AppCompatActivity {

    private TextView textView_video ,textView_hometask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_forex);


        textView_video = (TextView) findViewById(R.id.text_for_video1);
        textView_hometask = (TextView) findViewById(R.id.text_for_home_task1);

        textView_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Articles_forex.this, Main6Activity.class);
                startActivity(i);
            }
        });


        textView_hometask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent  i = new Intent(Articles_forex.this,Home_Task_Forex.class);
                startActivity(i);
            }
        });

    }
}
