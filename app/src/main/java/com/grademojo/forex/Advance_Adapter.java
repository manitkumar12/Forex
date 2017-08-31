package com.grademojo.forex;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sapling_a0 on 29/8/17.
 */

class Advance_Adapter extends RecyclerView.Adapter<Advance_Adapter.ViewHolder> {


private List<My_COurse_Pojo_class> value2;

        Context context;





public class ViewHolder extends RecyclerView.ViewHolder {


    public TextView textView_My_course;

    public ImageView image_My_Courses;


    public View layout_view;


    public ViewHolder(View itemView) {

        super(itemView);


        layout_view = itemView;

        textView_My_course = (TextView) itemView.findViewById(R.id.my_course_text_view);

        image_My_Courses = (ImageView) itemView.findViewById(R.id.my_course_images);


    }

}



    public Advance_Adapter(List<My_COurse_Pojo_class> my_data)
    {
        value2 = my_data;

    }




    @Override
    public Advance_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.my_course_relative_card_view,parent,false);

        Advance_Adapter.ViewHolder viewHolder = new Advance_Adapter.ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(Advance_Adapter.ViewHolder holder, final int position) {


        My_COurse_Pojo_class item = value2.get(position);


        String my_course_text_1 = value2.get(position).getMy_course_text();


        holder.image_My_Courses.setBackgroundResource(item.getMy_image_course());


        holder.textView_My_course.setText(""+my_course_text_1);

        context = holder.image_My_Courses.getContext();


        holder.image_My_Courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0)
                {

                    Intent i = new Intent(context,Advance_first_question.class);
                    context.startActivity(i);



                }

                else  if (position==1)

                {

                    Intent i = new Intent(context,Advance_second_question.class);
                    context.startActivity(i);



                }


                else  if (position==2)

                {

                    Intent i = new Intent(context,Advance_third_question.class);
                    context.startActivity(i);



                }


                else  if (position==3)

                {

                    Intent i = new Intent(context,Advance_fourth_question.class);
                    context.startActivity(i);



                }

                else  if (position==4)

                {

                    Intent i = new Intent(context,Intermediate_five_question.class);
                    context.startActivity(i);


                }


                else  if (position==5)

                {

                    Intent i = new Intent(context,Intermediate_six_question.class);
                    context.startActivity(i);



                }


//                else  if (position==6)
//
//                {
//
//                    Intent i = new Intent(context,Main6Activity.class);
//                    context.startActivity(i);
//
//
//                }
                else {

                    Intent i = new Intent(context,Main6Activity.class);
                    context.startActivity(i);

                }
            }
        });







//        holder.border_View.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_1()));
//
//        holder.border_View_first.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_2()));
//
//        holder.border_View_second.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_3()));

    }



    @Override
    public int getItemCount() {
        return value2.size();
    }

}

