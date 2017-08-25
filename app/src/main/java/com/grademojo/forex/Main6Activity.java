package com.grademojo.forex;

import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main6Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView_4, recyclerView_5;

    View border;



    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    Forex_Video_6 forex_video_6 = new Forex_Video_6();
    Forex_Article_6 forex_article_6 = new Forex_Article_6();
    Forex_Hometask_6 forex_hometask_6 = new Forex_Hometask_6();






    private TextView textView_hometask, textView_article, textView_video;


//    private My_Course_Forex_Adapter my_course_forex_adapter;
//
//
//
//    private Vector<You_tube_Video>  you_tube_videos= new  Vector<You_tube_Video>();
//
//    private RecyclerView.LayoutManager mLayoutManager;
//
//
//
//    private List<My_Course_Forex_Pojo> input;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main6);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//        recyclerView_4 = (RecyclerView) findViewById(R.id.recycler_view_4);
//        recyclerView_5 = (RecyclerView) findViewById(R.id.recycler_view_5);
//
//        recyclerView_5.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView_5.setHasFixedSize(true);

        textView_hometask = (TextView) findViewById(R.id.text_for_home_task);
        textView_article = (TextView) findViewById(R.id.text_for_article);
        textView_video = (TextView) findViewById(R.id.text_for_video);

        border = findViewById(R.id.border_video);


        if (savedInstanceState == null) {
//           fm.beginTransaction.(R.id.frmae_6, forex_video_6)
//                    .commit();


            fm.beginTransaction().replace(R.id.frmae_6,forex_video_6).commit();
        }




        textView_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                fm.beginTransaction().replace(R.id.frmae_6,forex_article_6).commit();
                fm.beginTransaction().remove(forex_video_6).commit();
                fm.beginTransaction().remove(forex_hometask_6).commit();






                textView_article.setBackgroundResource(R.drawable.intermediate_background);
                textView_hometask.setBackgroundResource(R.drawable.advance_backgrond);

                textView_article.setTextColor(Color.parseColor("#ffffff"));
                textView_video.setTextColor(Color.parseColor("#989797"));
                textView_hometask.setTextColor(Color.parseColor("#989797"));
                border.setBackgroundResource(R.color.blue);
                textView_video.setBackgroundResource(R.drawable.begiiner_backround);
                textView_article.setTypeface(textView_article.getTypeface(), Typeface.BOLD);
                textView_video.setTypeface(textView_video.getTypeface(), Typeface.NORMAL);
                textView_hometask.setTypeface(textView_hometask.getTypeface(), Typeface.NORMAL);



//                border_one.setBackground(ContextCompat.getDrawable(context,R.color.blue));
//                textView_Intermediate.setTextColor(ContextCompat.getColor(context,R.color.white));



            }
        });


        textView_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                fm.beginTransaction().replace(R.id.frmae_6,forex_video_6).commit();
                fm.beginTransaction().detach(forex_video_6);

//                fm.beginTransaction().remove(forex_article_6).commit();
//                fm.beginTransaction().remove(forex_hometask_6).commit();
//                fm.beginTransaction().remove(forex_video_6).commit();
                textView_video.setBackgroundResource(R.drawable.begginner_blue);

                textView_article.setTextColor(Color.parseColor("#989797"));
                textView_video.setTextColor(Color.parseColor("#ffffff"));
                textView_hometask.setTextColor(Color.parseColor("#989797"));
                textView_hometask.setBackgroundResource(R.drawable.advance_backgrond);

                textView_article.setBackgroundResource(R.drawable.intermediate_white);
                textView_article.setTypeface(textView_article.getTypeface(), Typeface.NORMAL);
                textView_video.setTypeface(textView_video.getTypeface(), Typeface.BOLD);
                textView_hometask.setTypeface(textView_hometask.getTypeface(), Typeface.NORMAL);



//                border_one.setBackground(ContextCompat.getDrawable(context,R.color.blue));
//                textView_Intermediate.setTextColor(ContextCompat.getColor(context,R.color.white));



            }
        });

        textView_hometask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                fm.beginTransaction().replace(R.id.frmae_6, forex_hometask_6).commit();
                fm.beginTransaction().remove(forex_video_6).commit();
                fm.beginTransaction().remove(forex_article_6).commit();

                textView_hometask.setBackgroundResource(R.drawable.back_ground_blue_article);

                textView_article.setTextColor(Color.parseColor("#989797"));
                textView_hometask.setTextColor(Color.parseColor("#ffffff"));
                textView_video.setTextColor(Color.parseColor("#989797"));
                textView_video.setBackgroundResource(R.drawable.begiiner_backround);
                border.setBackgroundResource(R.color.white);

                textView_article.setBackgroundResource(R.drawable.intermediate_white);
                textView_article.setTypeface(textView_article.getTypeface(), Typeface.NORMAL);
                textView_article.setTypeface(textView_article.getTypeface(), Typeface.NORMAL);
                textView_hometask.setTypeface(textView_hometask.getTypeface(), Typeface.BOLD);


            }
        });





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        else if (id == R.id.Logout)
        {


        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;







//        you_tube_videos.add(new You_tube_Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/e-EL0Mf4MTs\" frameborder=\"0\" allowfullscreen></iframe>"));
//
//
//
//        YouTube_Adapter_class youTube_adapter_class= new YouTube_Adapter_class(you_tube_videos);
//
//        recyclerView_5.setAdapter(youTube_adapter_class);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        mLayoutManager = new LinearLayoutManager(this);
//
//        recyclerView_4.setLayoutManager(mLayoutManager);
//
//
//        input = new ArrayList<>();
//
//
//        input.add(new My_Course_Forex_Pojo(
//                R.drawable.green_icon,
//
//                "What is Forex? ", R.color.green));
//
//        input.add(new My_Course_Forex_Pojo(
//                R.drawable.grey_icon,
//
//                "When can I trade forex?", R.color.grey
//        ));
//
//
//        input.add(new My_Course_Forex_Pojo(
//                R.drawable.grey_icon,
//                "Why trade forex", R.color.grey
//        ));
//
//
//        input.add(new My_Course_Forex_Pojo(
//                R.drawable.grey_icon,
//                "Charting Basics "
//                , R.color.grey
//        ));
//
//
//        input.add(new My_Course_Forex_Pojo(
//                R.drawable.grey_icon,
//                "Understanding Technical \n Analysis", R.color.grey
//
//        ));
//
//
//        input.add(new My_Course_Forex_Pojo(
//                R.drawable.grey_icon,
//                "Five Key Drivers of \nthe Forex Markets", R.color.grey
//
//        ));
//
//
//        input.add(new My_Course_Forex_Pojo(
//                R.drawable.grey_icon,
//                "What Is Fundamental \n Analysis", R.color.grey
//
//        ));
//
//
//
//
//
//        my_course_forex_adapter = new My_Course_Forex_Adapter(input);
//        recyclerView_4.setAdapter(my_course_forex_adapter);


    }






//        });



}