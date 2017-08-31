package com.grademojo.forex;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sapling_a0 on 21/8/17.
 */

public class Advance_41 extends Fragment {


        private RecyclerView  recyclerView_3;

        private Advance_Adapter mAdapter;





        private List<My_COurse_Pojo_class> input;




        private TextView textView_Intermediate , textView_Advance;

        private TextView textView_mu_course ,textView_suggested_course;

    private TextView textView_ongoing ,textView_all;

        Intent i;






        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.advance_41, container, false);


            recyclerView_3 = (RecyclerView) rootView.findViewById(R.id.recycler_view_31);





            textView_all = (TextView) rootView.findViewById(R.id.text_for_All);
            textView_ongoing = (TextView) rootView.findViewById(R.id.text_for_Ongoing);








//            textView_mu_course.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    i = new Intent(getActivity().getApplication(),Main5Activity.class);
//                    startActivity(i);
//                }
//            });
//
//
//            textView_suggested_course.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    i = new Intent(getActivity().getApplication(),Main5Activity.class);
//                    startActivity(i);
//                }
//            });


            input = new ArrayList<>();


            input.add(new My_COurse_Pojo_class(
                    R.drawable.advance_1,


                    "Opening Range Breakout \n Trading Strategy ?"



            ));

            input.add(new My_COurse_Pojo_class(
                    R.drawable.ref,

                    "What is the Tweezer Candlestick Formation ?"
            ));


            input.add(new My_COurse_Pojo_class(
                    R.drawable.advance_2,

                    "Why Are Tweezers Important ?"
            ));


            input.add(new My_COurse_Pojo_class(
                    R.drawable.advance_3,
                    "How to Use Tweezers to Place Trades"
            ));


//            input.add(new My_COurse_Pojo_class(
//                    R.drawable.ref4,
//                    "What is your motivation ?"));
//
//
//
//            input.add(new My_COurse_Pojo_class(
//                    R.drawable.ref,
//                    "Is the amount of money I have to trade with sensible to achieve my goals ?"
//
//            ));
//
//
//            input.add(new My_COurse_Pojo_class(
//                    R.drawable.ref,
//                    "How to match your goals to a trading style ?"
//
//            ));
//            input.add(new My_COurse_Pojo_class(
//                    R.drawable.ref,
//                    "Why a trading plan \ni s important ? "
//
//            ));





            mAdapter = new Advance_Adapter(input);
            recyclerView_3.setAdapter(mAdapter);




            int maxSpansPerRow = 6;



            final GridLayoutManager gridview = new GridLayoutManager(getActivity(),maxSpansPerRow);

            gridview.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {


                    if (input.size() % 2 == 1)

                    {
                        if (position == input.size() - 1) {

                            return 6;

                        } else {

                            return 3;
                        }
                    }
                    else {

                        return 3;
                    }


//                switch (position % 7) {
//                    // first three items span 3 columns each
//                    case 0:
//                    case 1:
//                    case 2:
//                    case 3:
//                    case 4:
//                    case 5:
//                        return 3;
//                    // next four items span 2 columns each
//
//
//                    case 6:
//                        return 6;
//                }
//                return position;
                }



            });

            recyclerView_3.setLayoutManager(gridview);





            return rootView;
    }
}
