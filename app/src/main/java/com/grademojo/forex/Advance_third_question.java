package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Advance_third_question extends AppCompatActivity {


    WebView mWebView ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_third_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);

        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">May act as a leading indicator suggesting a short-term price swing/trend reversal may be in progress—much like a pair of tweezers picking out, or “plucking,” a top or a bottom on a price chart\n" +
                "Completed tweezers may help to confirm whether a potential significant high or low has occurred\n" +
                "Tweezers may also help confirm, or strengthen, other reversal indicators\n" +
                "A failed tweezer may suggest a continuation move is in progress, and can be helpful in stop-loss placement\n" +
                "A tweezer top “fails” when a new high is achieved immediately after completion (candle), and a tweezer bottom “fails” if the next candle achieves new low</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");


    }}