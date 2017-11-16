package com.bawei.app.adapter.fragmentAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.app.R;
import com.bawei.app.bean.Fragmen_Bean;

import java.util.List;


public class MyAdaper extends RecyclerView.Adapter<MyViewHoder>{
    private Context context;
    private List<Fragmen_Bean> data;

    public MyAdaper(Context context, List<Fragmen_Bean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.f1frag01_item, null);
        MyViewHoder hoder = new MyViewHoder(view);
        return hoder;
    }

    @Override
    public void onBindViewHolder(MyViewHoder holder, int position) {
        holder.frag01_im.setBackgroundResource(data.get(position).ims);
        System.out.println("==========="+data.get(position).ims);
        holder.frag01_tv.setText(data.get(position).name);
    }


    @Override
    public int getItemCount() {
        return data != null ? data.size() : 0;
    }
}


