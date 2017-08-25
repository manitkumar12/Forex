package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {


    private CardView card_View_Sign_in ,card_view_login;

    private TextView sign_Text_view ,login_text_view;

    Intent i;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        card_View_Sign_in = (CardView) findViewById(R.id.card_view_sign_in);
        sign_Text_view = (TextView) findViewById(R.id.text_view_sign_in);
        card_view_login = (CardView) findViewById(R.id.login_card_view);
        login_text_view = (TextView) findViewById(R.id.login_text_view);


        card_View_Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Main2Activity.class);
                startActivity(i);

            }
        });

        sign_Text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Main2Activity.class);
                startActivity(i);

            }
        });


        card_view_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Sign_up.class);
                startActivity(i);

            }
        });

        login_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Main7Activity.this, Sign_up.class);
                startActivity(i);

            }
        });







    }
}
