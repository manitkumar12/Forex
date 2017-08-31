package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Advance_first_question extends AppCompatActivity {

    WebView mWebView ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_first_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);

        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Breakouts are one of the most common trading strategies. They involve identifying a key price level you expect the price to break through, and then buying or selling at that price in order to take advantage. Generally breakouts are used when the market is already near the extreme high or low of the recent past. When the market is trending and moving strongly in one direction, breakout trading ensures that you never miss the move.\n" +
                "\n" +
                "One breakout strategy is the European Opening Range. This strategy typically focuses on EURUSD (Euro/U.S. Dollar), although it could be applied to any of the European majors.\n" +
                "\n" +
                "While the Forex Market is open for 24-hours a day (Sunday evening through Friday evening ET), market activity in a given pair is not necessarily consistent throughout.</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");





    }

}