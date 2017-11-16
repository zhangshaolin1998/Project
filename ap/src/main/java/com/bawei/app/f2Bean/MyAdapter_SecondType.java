package com.bawei.app.f2Bean;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.app.R;
import com.bawei.app.f2Adapter.MyAdapter_ThirdType;
import com.bawei.app.f2Utilst.MyApp;
import com.bawei.okhttplibrary.utils.GsonObjectCallback;
import com.bawei.okhttplibrary.utils.OkhttpUtils;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;



public class MyAdapter_SecondType extends RecyclerView.Adapter<MyAdapter_SecondType.MyViewHolder> {

    private  List<TypeSecondBean.DataBean.ListBean> list;
    private Context context;

    public MyAdapter_SecondType( List<TypeSecondBean.DataBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.f2item_secondtype, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.type_gc_name.setText(list.get(position).getName());
        ImageLoader.getInstance().displayImage(list.get(position).getIcon(),holder.img, MyApp.getDisplay());
        holder.rv_third.setLayoutManager(new GridLayoutManager(context,3));
        OkhttpUtils.doGet("http://192.168.23.22/mobile/index.php?act=goods_class" + "&gc_id=" + list.get(position).getPcid(), new GsonObjectCallback<TypeThirdBean>() {
            @Override
            public void onUi(TypeThirdBean typeThirdBean) {
                MyAdapter_ThirdType myAdapter_thirdType = new MyAdapter_ThirdType(typeThirdBean.getDatas().getClass_list(),context);
                holder.rv_third.setAdapter(myAdapter_thirdType);
            }   //pcid
              //http://192.168.23.22/mobile/index.php?act=goods_class&gc_id
            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView type_gc_name;
        private final RecyclerView rv_third;
        private final ImageView img;
        public MyViewHolder(View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imageView3);
            type_gc_name = (TextView) itemView.findViewById(R.id.type_second_gcname);
            rv_third = (RecyclerView) itemView.findViewById(R.id.recyclerViewThird);
        }
    }
}
