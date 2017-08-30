package com.grademojo.forex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Intermediate_third_question extends AppCompatActivity {
    WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_third_question2);

        mWebView = (WebView) findViewById(R.id.web_text_1);


        load();
    }

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">If your immediate answer is, “to make money” you should stop right there. If the only goal is to make as much money as fast as we can, we are ultimately doomed, because it will never be enough. Managing your losses should be your primary goal. This will create an environment in which profits can be generated.”</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "");




    }
}