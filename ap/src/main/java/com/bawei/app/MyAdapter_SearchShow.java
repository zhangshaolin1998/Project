package com.bawei.app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.app.f2Utilst.MyApp;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 于俊建 on 2017/10/23.
 */

public class MyAdapter_SearchShow extends RecyclerView.Adapter<MyAdapter_SearchShow.MyViewHolder> {

    private Context context;
    private List<SearchBean.DataBean> list;

    public MyAdapter_SearchShow(Context context, List<SearchBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    //上下拉刷新加载数据
    public void loadMord(List<SearchBean.DataBean> goodsListBeen, boolean flag){
        for (int i = 0;i<goodsListBeen.size();i++){
            if(flag == true){
                this.list.addAll(0,goodsListBeen);
            }else{
                this.list.addAll(goodsListBeen);
            }
        }
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //加载布局
        View inflate = LayoutInflater.from(context).inflate(R.layout.dengluitem_searchshow, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(inflate);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRecycler.onrecyclerview(myViewHolder.getPosition());
            }
        });
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //获取数据
        SearchBean.DataBean goodsListBean = list.get(position);
        //展示数据
        holder.goods_name.setText(goodsListBean.getTitle());
        holder.goods_price.setText("￥"+goodsListBean.getPrice());
        holder.store_name.setText(goodsListBean.getSubhead());
        ImageLoader.getInstance().displayImage(goodsListBean.getImages(),holder.goods_image_url, MyApp.getDisplay());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView goods_image_url;
        private final TextView goods_price,store_name,goods_name;

        public MyViewHolder(View itemView) {
            super(itemView);
            //获取资源id
            goods_image_url = (ImageView) itemView.findViewById(R.id.goods_image_url);
            goods_name = (TextView) itemView.findViewById(R.id.goods_name);
            goods_price = (TextView) itemView.findViewById(R.id.goods_price);
            store_name = (TextView) itemView.findViewById(R.id.store_name);
        }
    }

    //接口回调设置监听事件
    private OnRecycler onRecycler;
    public interface OnRecycler{
        void onrecyclerview(int position);
    }
    public void setOnRecycler(OnRecycler onRecycler) {
        this.onRecycler = onRecycler;
    }
}

