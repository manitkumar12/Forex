package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Beginner_forex_video_second_question extends AppCompatActivity {





    WebView mWebView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_forex_video_second_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);
        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">You can trade forex 24 hours a day, five days a week. The foreign exchange markets are worldwide and therefore follow a 24-hour global timetable.\n" +
                "\n" +
                "When Can I Trade Forex\n" +
                "\n" +
                "The trading week for forex begins on Monday morning in Sydney, Australia and follows the sun westward as the world’s major capital markets open and close from Tokyo to London and finally closing on Friday evening in New York.</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");





    }

}