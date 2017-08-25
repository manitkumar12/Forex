package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private CardView cardView_sign_in;

    private TextView textView_sign_in ,sign_up;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cardView_sign_in = (CardView) findViewById(R.id.card_view_sign_in_next);
        textView_sign_in = (TextView) findViewById(R.id.text_view_sign_in_next);
        sign_up = (TextView) findViewById(R.id.sign_up);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main2Activity.this, Sign_up.class);
                startActivity(i);
            }
        });


        cardView_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });

        textView_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });







    }
}
