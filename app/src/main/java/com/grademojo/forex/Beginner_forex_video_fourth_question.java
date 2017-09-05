package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Beginner_forex_video_fourth_question extends AppCompatActivity {

    WebView mWebView ,mwebview2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_forex_video_fourth_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);
        mwebview2 = (WebView) findViewById(R.id.web_text_2);
        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">A chart is a graphical representation of historical prices. The most common chart types are bar charts and candlestick charts. Although these two chart types look quite different, they are very similar in the information they provide.\n" +
                "Bar and candlestick charts are separated into different timeframes. Each bar or candlesticks represent the high, low open and close price for a specific period of time.\n" +
                "When looking at a daily chart, each bar/candle represents one day of trading activity\n" +
                "When looking at a 15min chart, each bar/candle represents a 15 min period, or session, of trading activity.</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");

        String text1 = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Technical Analysis includes the study and mapping of trends and price patterns through various technical indicators, or studies. This relationship between price and time can help traders not only see and interpret more data, but can also help pinpoint areas of indecision or reversal of sentiment. (This will be discussed in more detail within the Understanding Candlesticks section of the course) As a result, technical analysis is used to help determine the probabilities entries and exits in order to develop a strategy, or methodology.</p> " + "</body></html>";
        mwebview2.loadData(text1, "text/html", "utf-8");



    }

}