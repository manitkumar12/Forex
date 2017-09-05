package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Beginner_forex_video_six_question extends AppCompatActivity {

        WebView mWebView ,mwebview2;

        String frameVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/e-EL0Mf4MTs\" frameborder=\"0\" allowfullscreen></iframe>";






    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_beginner_forex_video_six_question);

            mWebView = (WebView) findViewById(R.id.web_text_1);
            mwebview2 = (WebView) findViewById(R.id.web_text_2);



            load();}

        public void load() {
            // some other code to parse the string from a database

            String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">Use this video to learn about the five major key drivers of forex markets, and how it can affect your decision making.This type of chaotic behavior is observed in nature in the form of weather forecasts. For example, most traders will admit that there are no certainties when it comes to predicting exact price movements. As a result, successful trading is not about being right or wrong: it’s all about determining probabilities and taking trades when the odds are in your favor. Part of determining probabilities involves forecasting market direction and when/where to enter into a position, but equally important is determining your risk-to-reward ratio.</p> " + "</body></html>";
            mwebview2.loadData(text, "text/html", "utf-8");

            String frameVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xyCCdvcZd60\" frameborder=\"0\" allowfullscreen></iframe>";


            mWebView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });

            WebSettings webSettings = mWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            mWebView.loadData(frameVideo, "text/html", "utf-8");

        }

    }