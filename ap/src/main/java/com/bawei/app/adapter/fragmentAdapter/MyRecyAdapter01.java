package com.bawei.app.adapter.fragmentAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bawei.app.R;
import com.bawei.app.bean.LiebiaoBean;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MyRecyAdapter01 extends RecyclerView.Adapter<MyViewHoder> {


        private Context context;

        private List<LiebiaoBean.MiaoshaBean.ListBeanX> list ;
        OnClickRecyListeren listeren;

public MyRecyAdapter01(Context context,List<LiebiaoBean.MiaoshaBean.ListBeanX> list) {
        this.context = context;
        this.list = list;
        }
        public void setData(LiebiaoBean bean){

                if(this.list == null){
                        this.list = new ArrayList<>();
                }
                this.list.addAll(bean.getMiaosha().getList());
                notifyDataSetChanged();

        }
@Override
public MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.f1recy_item01, null);
final MyViewHoder hoder = new MyViewHoder(view,"");
        if (listeren != null) {
        view.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        listeren.setItemOnClickListener(view, hoder.getLayoutPosition());
        }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
@Override
public boolean onLongClick(View view) {

        listeren.setItemLongOnClickListener(view, hoder.getLayoutPosition());
        return false;
        }
        });
        }
        return hoder;
        }


@Override
public void onBindViewHolder(MyViewHoder holder, int position) {
        Random random = new Random();
        int a = random.nextInt(3);
        boolean b = false;
        if (a == 2) {
        holder.rect_ziying.setVisibility(View.VISIBLE);
        b = true;
        } else {
        holder.rect_ziying.setVisibility(View.GONE);
        b = false;
        }
        if (b) {
        holder.rect_name.setText("                " + list.get(position).getTitle());
        } else {
        holder.rect_name.setText(list.get(position).getTitle());
        }

        holder.rect_price.setText(list.get(position).getSubhead());
        System.out.println("数据为"+list.get(position).getSubhead());


        String s=list.get(position).getImages();
        String[] split = s.split("\\|");
        String  s1=split[0];
        String  s2=split[1];
        String  s3=split[2];
        System.out.println("++++++++"+s1);
        System.out.println("++++++++"+s2);
        System.out.println("++++++++"+s3);
        System.out.println("shujuwei++++++++"+list);
        Glide.with(context).load(s2).into(holder.rect_im);
        System.out.println("数据为"+ Glide.with(context).load(s2).into(holder.rect_im));
        holder.rect_bt.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Toast.makeText(context, "看屁,买的起吗你", Toast.LENGTH_SHORT).show();
        }
        });
        }


@Override
public int getItemCount() {
        return list != null ? list.size() : 0;

        }

public void setOnClickListener(OnClickRecyListeren listeren) {
        this.listeren = listeren;
        }

        }
