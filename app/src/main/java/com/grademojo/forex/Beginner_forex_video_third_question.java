package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Beginner_forex_video_third_question extends AppCompatActivity {



    WebView mWebView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_forex_video_third_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);
        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Forex is the most traded market in the world and when you understand the benefits of the market, it is easy to understand why.\n" +
                "\n" +
                "24 Hour trading, 5 days a week\n" +
                "Unlike other markets, forex trading doesn’t have to stop when the sun goes down. Since forex is traded all over the world, trading markets are open 24 hours a day, 5 days a week, so you can trade when it is convenient for you.\n" +
                "\n" +
                "When Can I Trade Forex\n" +
                "\n" +
                "No commissions or hidden costs\n" +
                "The costs of trading at FOREX.com are included in the spread—there are no hidden fees or commissions, so you can be confident knowing how much your trade is costing you.</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");





    }

}