package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Advance_second_question extends AppCompatActivity {


    WebView mWebView ,mwebview2,mwebview3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_second_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);
        mwebview2 = (WebView) findViewById(R.id.web_text_2);
        mwebview3 = (WebView) findViewById(R.id.web_text_3);
        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Tweezers form when two consecutive candlesticks have equal, or very close to equal, highs (tweezer top), or lows (tweezer bottom)</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");

        String text1 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">IThe equal highs or lows may also reflect the open or close of two consecutive candlesticks, or a combination of both</p> " + "</body></html>";
        mwebview2.loadData(text1, "text/html", "utf-8");

        String text2 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">The colors of the candlesticks that form a tweezer generally don’t matter Tweezer form more often on smaller timeframe charts</p> " + "</body></html>";
        mwebview3.loadData(text2, "text/html", "utf-8");




    }

}