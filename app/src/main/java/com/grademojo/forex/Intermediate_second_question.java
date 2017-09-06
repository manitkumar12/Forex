package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Intermediate_second_question extends AppCompatActivity {
    WebView mWebView, mwebview2;

    private CardView intermediate_cardview;

    private TextView intermediate_text_view;

    private Intent i ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_second_question);

        intermediate_cardview = (CardView) findViewById(R.id.card_view_intermediate_second_question);

        intermediate_text_view = (TextView) findViewById(R.id.text_view_intermediate_second_question);

        intermediate_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_second_question.this,Intermediate_third_question.class);
                startActivity(i);

            }
        });

        intermediate_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Intermediate_second_question.this,Intermediate_third_question.class);
                startActivity(i);

            }
        });


        mWebView = (WebView) findViewById(R.id.web_text_1);
        mwebview2 = (WebView) findViewById(R.id.web_text_2);


        load();
    }

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Make sure you do your own research and build a plan according to your needs. Find confidence in what you know. The tools you have selected for your strategy are key, from the type of chart to the specific drawing tools to even the most elaborate of strategies. Test your plan in the beginning to make sure you are on the right track.”</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "");
        String text2 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">After you have begun trading, continue testing it regularly. This allows you to measure your success by clearly seeing what works and what does not work. From there you can tweak elements that might be weaker and not contributing to your overall goal. Ask yourself the following questions (The answers to these will assist you in the foundation for your trading plan and should be referred back to regularly to insure that you are on track with your plan.)”</p> " + "</body></html>";
        mwebview2.loadData(text2, "text/html", "utf-8");



    }
}