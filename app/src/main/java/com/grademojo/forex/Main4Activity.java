package com.grademojo.forex;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.grademojo.forex.R.drawable.back_ground_blue_article;

public class Main4Activity extends AppCompatActivity {




    private CardView cardView_Next;

    private TextView textView_Next;

    Intent i;





//    private RecyclerView recyclerView, recyclerView1;
//
//    private My_Adapter mAdapter;
//
//
//
//    private My_Adapter_2 myAdapter2;
//
//    private List<My_course_pojo_first> input;
//
//
//    private List<My_Course_pojo_second> input2;
//
//

//
//    private TextView textView_mu_course ,textView_suggested_course;
//
//    Intent i;
//
//    private RecyclerView.LayoutManager mLayoutManager, layoutManager2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);




        cardView_Next = (CardView) findViewById(R.id.card_view_next);
        textView_Next = (TextView) findViewById(R.id.text_view_next);

        cardView_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main4Activity.this,MainActivity.class);
                startActivity(i);
            }
        });

        textView_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main4Activity.this,MainActivity.class);
                startActivity(i);
            }
        });








//        recyclerView = (RecyclerView) findViewById(R.id.recylcer_view_1);
//        recyclerView1 = (RecyclerView) findViewById(R.id.recylcer_view_2);
//
//        textView_mu_course = (TextView) findViewById(R.id.text_view_my_course);
//



//
//        textView_suggested_course = (TextView) findViewById(R.id.text_view_suggested_course);
//
//
//
//        textView_Intermediate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Main4Activity.this, Intermediate_4.class);
//                startActivity(i);
//            }
//        });
//
//        textView_Advance.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Main4Activity.this, Advance_4.class);
//                startActivity(i);
//            }
//        });
//
//
//        textView_mu_course.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i = new Intent(Main4Activity.this,Main5Activity.class);
//                startActivity(i);
//            }
//        });
//
//
//        textView_suggested_course.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i = new Intent(Main4Activity.this,Main5Activity.class);
//                startActivity(i);
//            }
//        });
//
//
//        input = new ArrayList<>();
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref
//
//               ));
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref2
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref3
//
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref4));
//
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref
//
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref2
//
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref3
//        ));
//
//
//
//        mAdapter = new My_Adapter(input);
//        recyclerView.setAdapter(mAdapter);
//
//
//
//
//        recyclerView.setAdapter(mAdapter);
//
//
//        SnapHelper snapHelper = new LinearSnapHelper();
//        snapHelper.attachToRecyclerView(recyclerView);
//
//
//
//
//
//
//
//        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//
//
//        recyclerView.setLayoutManager(mLayoutManager);
//
//
//        input2 = new ArrayList<>();
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref
//
//        ));
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref2
//        ));
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref3
//
//        ));
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref4));
//
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref
//
//        ));
//
//
//        input2.add(new My_Course_pojo_second(
//                R.drawable.ref2
//
//        ));
//
//
//        input.add(new My_course_pojo_first(
//                R.drawable.ref3
//        ));
//
//
//
//        myAdapter2 = new My_Adapter_2(input2);
//        recyclerView1.setAdapter(myAdapter2);
//
//
//
//
//        recyclerView1.setAdapter(myAdapter2);
//
//
//        SnapHelper snapHelper1 = new LinearSnapHelper();
//        snapHelper1.attachToRecyclerView(recyclerView1);
//
//
//
//
//
//
//
//        layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//
//
//        recyclerView1.setLayoutManager(layoutManager2);
//
//
//
//
////        List<String> input1 = new ArrayList<>();
////        for (int i = 0; i < 15; i++) {
////            input.add("Test" + i);
////        }// define an adapter
////        myAdapter2 = new My_Adapter_2(c2,input);
////        recyclerView1.setAdapter(myAdapter2);
////
////
////
////
////        recyclerView.setAdapter(mAdapter);
////
////
////        SnapHelper snapHelper1 = new LinearSnapHelper();
////        snapHelper1.attachToRecyclerView(recyclerView1);
////
////
////
////
////
////
////
////        layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
////
////
////        recyclerView1.setLayoutManager(layoutManager2);
//
//




    }
}

