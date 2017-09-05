package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Beginner_forex_video_five_question extends AppCompatActivity {



    WebView mWebView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_forex_video_five_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);
        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Technical analysis is the study of historical price action in order to identify patterns and determine probabilities of future movements in the market through the use of technical studies, indicators, and other analysis tools.\n" +
                "\n" +
                "Technical analysis boils down to two things:\n" +
                "\n" +
                "identifying trend\n" +
                "identifying support/resistance through the use of price charts and/or timeframes\n" +
                "Markets can only do three things: move up, down, or sideways.\n" +
                "\n" +
                "Prices typically move in a zigzag fashion, and as a result, price action has only two states:\n" +
                "\n" +
                "Range – when prices zigzag sideways\n" +
                "Trend – prices either zigzag higher (up trend, or bull trend), or prices zigzag lower (down trend, or bear trend)</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");





    }

}