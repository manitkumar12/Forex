package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Advance_fourth_question extends AppCompatActivity {

    WebView mWebView ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_fourth_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);

        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Tweezers, as in all candlestick formations, are most effective when found at previously established support or resistance. For example, a tweezer may help confirm potential reversal when found at or near a trendline, Fibonacci support or resistance, previously established significant high or low, and especially at geo-harmonic pattern completion.\n" +
                "\n" +
                "Tweezers may also be used to help confirm an entry and are especially effective when in line with overall trend. Although tweezers are signs of a potential reversal, an ideal application for placing an entry order is when a tweezer has developed at the competition of a short-term correction of a longer-term trend. Reason being, trading with the overall trend will typically lead to greater potential for reward, thus more favorable risk to reward ratio. What is important to remember is tweezers do not indicate how long or far the potential reversal will last. Predetermined support and resistance levels should be determined in order to gauge risk vs. reward.\n" +
                "\n" +
                "A tweezer bottom has formed increasing the odds of bullish reversal (rally)…\n" +
                "\n</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");





    }

}