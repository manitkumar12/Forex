package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home_Task_Forex extends AppCompatActivity {

    private TextView textView_video, textView_article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__task__forex);


        textView_video = (TextView) findViewById(R.id.text_for_video2);
        textView_article = (TextView) findViewById(R.id.text_for_article2);

        textView_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home_Task_Forex.this, Main5Activity.class);
                startActivity(i);
            }
        });


        textView_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Home_Task_Forex.this, Articles_forex.class);
                startActivity(i);
            }
        });

    }
}
