package com.grademojo.forex;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

/**
 * Created by sapling_a0 on 18/8/17.
 */

public class YouTube_Adapter_class extends RecyclerView.Adapter<YouTube_Adapter_class.ViewHolder>


{


    List<You_tube_Video> you_tube_videos;


    public YouTube_Adapter_class(List<You_tube_Video> you_tube_videos1)

    {


        this.you_tube_videos = you_tube_videos1;
    }



    @Override
    public YouTube_Adapter_class.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.webview_for_video,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(YouTube_Adapter_class.ViewHolder holder, int position) {


        holder.webView.loadData(you_tube_videos.get(position).getVideo_Url(), "text/html","utf-8");

    }

    @Override
    public int getItemCount() {
        return you_tube_videos.size();
    }






    public class ViewHolder extends RecyclerView.ViewHolder {


        WebView webView;



        public ViewHolder(View itemView) {
            super(itemView);

            webView = (WebView) itemView.findViewById(R.id.web_view_video);



            webView.getSettings().setJavaScriptEnabled(true);

            webView.setWebChromeClient(new WebChromeClient());

        }
    }
}





