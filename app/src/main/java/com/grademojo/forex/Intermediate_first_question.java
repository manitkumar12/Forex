package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Intermediate_first_question extends AppCompatActivity {

    private WebView mWebView ,mwebview2;

    private CardView intermediate_cardview;

    private TextView intermediate_text_view;

    private Intent i ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_first_question);

        intermediate_cardview = (CardView) findViewById(R.id.card_view_intermediate_first_question);

        intermediate_text_view = (TextView) findViewById(R.id.text_view_intermediate_first_question);

        intermediate_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_first_question.this,Intermediate_second_question.class);
                startActivity(i);

            }
        });

        intermediate_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_first_question.this,Intermediate_second_question.class);
                startActivity(i);

            }
        });


        mWebView = (WebView) findViewById(R.id.web_text_1);
        mwebview2 = (WebView) findViewById(R.id.web_text_2);
        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Sometimes there is a misconception that you need highly evolved market knowledge and years of trading experience to be successful. However, we often see that the more information we have the more difficult it is to create a clear plan. More information tends to create hesitation and doubt, which in turn allows emotions to creep in. This can prevent you from taking a step back and looking at a situation subjectively.”</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");

        String text1 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">If you don’t know where you are going, any road will get you there. In trading, if you don’t set out a plan for your trades and develop strategies to follow you have no way to measure your success. The vast majority of people do not trade to a plan, so it’s not a mystery why they lose money. Trading with a plan is comparable to building a business. We are never going to be able to beat the market. In general it’s not about winning or losing, it’s about being profitable overall.”</p> " + "</body></html>";
        mwebview2.loadData(text1, "text/html", "utf-8");



    }

}