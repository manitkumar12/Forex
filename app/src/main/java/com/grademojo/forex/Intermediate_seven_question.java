package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Intermediate_seven_question extends AppCompatActivity {
    WebView mWebView;

//
//    private CardView intermediate_cardview;
//
//    private TextView intermediate_text_view;

    private Intent i ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_six_question);

//        intermediate_cardview = (CardView) findViewById(R.id.card_view_intermediate_third_question);
//
//        intermediate_text_view = (TextView) findViewById(R.id.text_view_intermediate_third_question);
//
//        intermediate_text_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                i = new Intent(Intermediate_third_question.this,Intermediate_fourth_question.class);
//                startActivity(i);
//
//            }
//        });
//
//        intermediate_cardview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                i = new Intent(Intermediate_third_question.this,Intermediate_fourth_question.class);
//                startActivity(i);
//
//            }
//        });


        mWebView = (WebView) findViewById(R.id.web_text_1);


        load();
    }

    public void load() {
        // some other code to parse the string from a database

        String text = "<html> <head></head><body>" + "<p style=\"font-size:1.5em\" align=\"justify\">When trading, as in most endeavors, it’s important to start at the end and work backwards to create your plan and figure out what type of trader you should be. The most successful traders trade to a plan, and may even have several plans that work together. Always write things down. Why? Because it will help you stay focused on your trading objectives, and the less judgment we have to use the better. A plan helps you maintain discipline as a trader. It should help you trade consistently, manage your emotions, and even help to improve your trading strategy. It is also important to use your plan. Many people make the mistake of spending all their time creating a plan, then never implementing it.</p> " + "</body></html>";
        mWebView.loadData(text, "text/html", "");




    }
}