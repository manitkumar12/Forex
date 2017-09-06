package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Intermediate_fourth_question extends AppCompatActivity {

    WebView mWebView ,mwebview2 ,mwebview3 ,mwebview4;

    private CardView intermediate_cardview;

    private TextView intermediate_text_view;

    private Intent i ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_fourth_question);

        intermediate_cardview = (CardView) findViewById(R.id.card_view_intermediate_fourth_question);

        intermediate_text_view = (TextView) findViewById(R.id.text_view_intermediate_fourth_question);

        intermediate_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_fourth_question.this,Intermediate_five_question.class);
                startActivity(i);

            }
        });

        intermediate_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_fourth_question.this,Intermediate_five_question.class);
                startActivity(i);

            }
        });


        mWebView = (WebView) findViewById(R.id.web_text_1);
        mwebview2 = (WebView) findViewById(R.id.web_text_2);
        mwebview3 = (WebView) findViewById(R.id.web_text_3);
        mwebview4 = (WebView) findViewById(R.id.web_text_4);
        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Solid retirement? New career? Spend more time with family and friends?</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");

        String text1 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Ask yourself, “What are my strengths and weaknesses?</p> " + "</body></html>";
        mwebview2.loadData(text1, "text/html", "utf-8");
        String text2 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">How do I maximize my strengths to minimize my weaknesses?</p> " + "</body></html>";
        mwebview3.loadData(text2, "text/html", "utf-8");
        String text3 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">An example of a weakness is a need to constantly watch one’s trades. Is your laptop on the pillow, waking you up in the middle of the night to monitor trades? It’s really difficult to make intelligent decisions when you’re half awake ?</p> " + "</body></html>";
        mwebview4.loadData(text3, "text/html", "utf-8");



    }

}