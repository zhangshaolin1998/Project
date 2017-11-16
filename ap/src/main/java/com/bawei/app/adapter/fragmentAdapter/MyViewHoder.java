package com.bawei.app.adapter.fragmentAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.app.R;


public class MyViewHoder extends RecyclerView.ViewHolder {

    public ImageView frag01_im;
    public TextView frag01_tv;
    public ImageView rect_im;
    public ImageView rect_ziying;
    public TextView rect_price;
    public Button rect_bt;
    public TextView rect_name;

    public MyViewHoder(View itemView) {
        super(itemView);
        frag01_im = itemView.findViewById(R.id.frag01_im);
        frag01_tv = itemView.findViewById(R.id.frag01_tv);
    }

    public MyViewHoder(View itemView, String str) {
        super(itemView);
        rect_im = itemView.findViewById(R.id.rect_im);
        rect_name = itemView.findViewById(R.id.rect_name);
        rect_ziying = itemView.findViewById(R.id.rect_ziying);
        rect_price = itemView.findViewById(R.id.rect_price);
        rect_bt = itemView.findViewById(R.id.rect_bt);




    }

}
