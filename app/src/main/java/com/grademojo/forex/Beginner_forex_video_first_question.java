package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class Beginner_forex_video_first_question extends AppCompatActivity {


    private ImageView imageView;



    WebView mWebView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_forex_video_first_question);

        mWebView = (WebView) findViewById(R.id.web_text_1);

        imageView = (ImageView) findViewById(R.id.image1);


        load();}

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">The foreign exchange market – also known as forex or the FX market – is the world’s most traded market, with turnover of $5.1 trillion per day*.\n" +
                "\n" +
                "Forex Market\n" +
                "\n" +
                "To put this into perspective, the U.S. stock market trades around $226 billion a day; quite a large sum, but only a fraction of what forex trades.\n" +
                "\n" +
                "Forex is traded 24 hours a day, 5 days a week across by banks, institutions and individual traders worldwide. Unlike other financial markets, there is no centralized marketplace for forex, currencies trade over the counter in whatever market is open at that time.</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "utf-8");





    }

}