package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Intermediate_five_question extends AppCompatActivity {

    WebView mWebView ,mwebview2 ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_five_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);
        mwebview2 = (WebView) findViewById(R.id.web_text_2);

        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">\n" +
                "Look at things in percentages; remember leverage is a double-edged sword. That is why risk and money management are key.</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");

        String text1 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Deciding what type of trader you are can be tough; especially since the trader you want to be can be very different from the type of trader you should be based on your behaviors and characteristics. Once you have laid out your goals, risk appetite, strengths, and weaknesses it should become apparent which type of trading fits you best. You will notice three columns in the chart; they are labeled short, base and long. Base equals the timeframe charts you spend the majority of your time, if you are not sure, this is the timeframe chart that you keep going back to. Short and long are the timeframe charts that you refer to confirming or denying what is happening in the base timeframe chart. A common mistake traders make is jumping around randomly between chart timeframes.</p> " + "</body></html>";
        mwebview2.loadData(text1, "text/html", "utf-8");




    }

}