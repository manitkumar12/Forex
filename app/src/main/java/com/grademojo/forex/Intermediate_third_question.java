package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Intermediate_third_question extends AppCompatActivity {
    WebView mWebView;


    private CardView intermediate_cardview;

    private TextView intermediate_text_view;

    private Intent i ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_third_question2);

        intermediate_cardview = (CardView) findViewById(R.id.card_view_intermediate_third_question);

        intermediate_text_view = (TextView) findViewById(R.id.text_view_intermediate_third_question);

        intermediate_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_third_question.this,Intermediate_fourth_question.class);
                startActivity(i);

            }
        });

        intermediate_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_third_question.this,Intermediate_fourth_question.class);
                startActivity(i);

            }
        });


        mWebView = (WebView) findViewById(R.id.web_text_1);


        load();
    }

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">If your immediate answer is, “to make money” you should stop right there. If the only goal is to make as much money as fast as we can, we are ultimately doomed, because it will never be enough. Managing your losses should be your primary goal. This will create an environment in which profits can be generated.”</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "");




    }
}