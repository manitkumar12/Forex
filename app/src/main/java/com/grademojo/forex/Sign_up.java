package com.grademojo.forex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Sign_up extends AppCompatActivity {

    private CardView signup ;

    private TextView textView_sign_up;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        signup = (CardView) findViewById(R.id.card_view_sign_up_next_2);
        textView_sign_up = (TextView) findViewById(R.id.text_view_sign_up_next_2);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Sign_up.this, Main3Activity.class);
                startActivity(i);

            }
        });

        textView_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(Sign_up.this, Main3Activity.class);
                startActivity(i);

            }
        });






    }
}
