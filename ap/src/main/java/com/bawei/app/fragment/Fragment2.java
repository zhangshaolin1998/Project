package com.bawei.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.app.R;
import com.bawei.app.anet.Api;
import com.bawei.app.f2Adapter.MyAdapter_Type;
import com.bawei.app.f2Bean.MyAdapter_SecondType;
import com.bawei.app.f2Bean.TypeBean;
import com.bawei.app.f2Bean.TypeSecondBean;
import com.bawei.app.f2View.MyDecoration;
import com.bawei.okhttplibrary.utils.GsonObjectCallback;
import com.bawei.okhttplibrary.utils.OkhttpUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;


public class Fragment2 extends Fragment {
    private RecyclerView recycler_left;
    private RecyclerView recycler_right;
    private MyAdapter_SecondType myAdapter_secondType;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment2,container,false);
        initView(view);
        return view;
    }

    //初始化组件
    private void initView(View view) {
        recycler_left = (RecyclerView) view.findViewById(R.id.recycler_left);
        recycler_right = (RecyclerView) view.findViewById(R.id.recycler_right);

        getData();

    }

    /**
     * 加载数据
     */
    private void getData() {
        //请求一级数据
        OkhttpUtils.doGet(Api.STAIR, new GsonObjectCallback<TypeBean>() {
            @Override
            public void onUi(final TypeBean typeBean) {
                //获取数据并添加到适配器
                List<TypeBean.DataBean> class_list = typeBean.getData();
                recycler_left.setLayoutManager(new LinearLayoutManager(getActivity()));
                recycler_left.addItemDecoration(new MyDecoration(getActivity(), MyDecoration.VERTICAL_LIST));
                final MyAdapter_Type adapter_type = new MyAdapter_Type(class_list,getActivity());
                recycler_left.setAdapter(adapter_type);
                //设置条目点击监听
                adapter_type.setOnRecyclerViewItemClickListener(new MyAdapter_Type.onRecyclerViewItemClickListener() {
                    @Override
                    public void recyclerViewListener(int position) {
                        adapter_type.notifyDataSetChanged();
                        //点击后请求二级数据
                        getSecondData(typeBean.getData().get(position).getCid());
                    }
                });
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }

    /**
     * 未做完
     * 请求二级数据
     * @param cid
     * @param cid
     */
    //int pcid
    public void getSecondData(int cid){
       // http://192.168.23.22/mobile/index.php?act=goods_class
        OkhttpUtils.doGet("http://120.27.23.105/product/getProductCatagory", new GsonObjectCallback<TypeSecondBean>() {



            @Override
            public void onUi(TypeSecondBean typeSecondBean) {
                //二级列表的数据 添加到适配器
                List<TypeSecondBean.DataBean.ListBean> list = typeSecondBean.getData().get(3).getList();
                System.out.println("数据是+++++++++++++++++++++++"+list);
                recycler_right.setLayoutManager(new LinearLayoutManager(getActivity()));
                myAdapter_secondType = new MyAdapter_SecondType(list,getActivity());
                recycler_right.setAdapter(myAdapter_secondType);

            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }




}
