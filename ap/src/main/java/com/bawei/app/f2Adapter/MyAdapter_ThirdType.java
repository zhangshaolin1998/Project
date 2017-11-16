package com.bawei.app.f2Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bawei.app.R;
import com.bawei.app.f2Bean.TypeThirdBean;

import java.util.List;


public class MyAdapter_ThirdType extends RecyclerView.Adapter<MyAdapter_ThirdType.MyViewHolder> {

    private List<TypeThirdBean.DatasBean.ClassListBean> list;
    private Context context;

    public MyAdapter_ThirdType(List<TypeThirdBean.DatasBean.ClassListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.f1item_thirdtype, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        System.out.println("========"+list.get(position).getGc_name());
        holder.type_gc_name.setText(list.get(position).getGc_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView type_gc_name;

        public MyViewHolder(View itemView) {
            super(itemView);
            type_gc_name = (TextView) itemView.findViewById(R.id.type_third_gcname);
        }
    }
}
