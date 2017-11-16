package com.bawei.app.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.bawei.app.Main2Activity;
import com.bawei.app.Main3Activity;
import com.bawei.app.MyZxing;
import com.bawei.app.R;
import com.bawei.app.SearchActivity;
import com.bawei.app.adapter.fragmentAdapter.MyFragment_01;
import com.bawei.app.adapter.fragmentAdapter.MyFragment_02;
import com.bawei.app.adapter.fragmentAdapter.MyRecyAdapter01;
import com.bawei.app.adapter.fragmentAdapter.OnClickRecyListeren;
import com.bawei.app.apresentr.GlideImageLoader;
import com.bawei.app.apresentr.MainActivityPresenter;
import com.bawei.app.aview.MainActivityViewListener;
import com.bawei.app.bean.LiebiaoBean;
import com.bawei.app.f1Molder.FragmentViewpage;
import com.bawei.app.fragment1View.MyScrollView;
import com.hjm.bottomtabbar.BottomTabBar;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends Fragment implements MyScrollView.OnScrollViewListenner,MainActivityViewListener {
    private MyRecyAdapter01 adaper;
    private Toolbar tob;
    private TextView text;
    private Banner ban;
    private int height;
    private List<String> imgs = new ArrayList<>();
    private RelativeLayout rl;
    private RelativeLayout.LayoutParams linearParams;
    private MyScrollView scr;
    private ImageView saom;
    private TextView saot;
    private ImageView xiaoxi;
    private TextView tv3;
    private RelativeLayout h_rl;
    private ImageView sousuo;
    private ImageView imageview;
    private ViewPager vp;
    private ImageView imzuo;
    private ImageView imyou;
    private BottomTabBar btb;
    private ViewFlipper vfp;
    private RecyclerView recy_my;
   // private URLBean urlBean = new URLBean();
    private Handler handler = new Handler();
    private View view;
    private int REQUEST_CODE=1;
    private List<LiebiaoBean.MiaoshaBean.ListBeanX> list;
    private MainActivityPresenter presenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.fragment1,null);
        ZXingLibrary.initDisplayOpinion(getActivity());
        initId();
        //找顶部图片的高度  随时变化的一个高度
        findHeighOfTopView();
        initView();
        recy_my.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        adaper=new MyRecyAdapter01(getActivity(),list);


        presenter = new MainActivityPresenter(this);

        recy_my.setAdapter(adaper);
        //initViewpage();
        scr.setmOnScrollViewListenner(this);
       // initrecyData();
        presenter.getData(true);



        saom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getActivity(), MyZxing.class));
//                Intent intent = new Intent(getActivity(), CaptureActivity.class);
//                startActivityForResult(intent, REQUEST_CODE);
            }
        });
        xiaoxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MyZxing.class));
            }
        });

        //搜索功能
        sousuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SearchActivity.class));
            }
        });

        return view;
    }





   // 生成二维吗
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == REQUEST_CODE) {
//            //处理扫描结果（在界面上显示）
//            if (null != data) {
//                Bundle bundle = data.getExtras();
//                if (bundle == null) {
//                    return;
//                }
//                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
//                    String result = bundle.getString(CodeUtils.RESULT_STRING);
//                    Toast.makeText(getActivity(), "解析结果:" + result, Toast.LENGTH_LONG).show();
//                } else if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_FAILED) {
//                    Toast.makeText(getActivity(), "解析二维码失败", Toast.LENGTH_LONG).show();
//                }
//            }
//        }


    //}

//    private void initrecyData() {
//        OkHttpClient client = new OkHttpClient();
//        Request build = new Request.Builder()
//                .addHeader("User-Agent","")
//                .url(Api.THEHOME).build();
//        client.newCall(build).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//            }
//
//            @Override
//            public void onResponse(Call call, final Response response) throws IOException {
//                String string = response.body().string();
//                Gson gson = new Gson();
//                final LiebiaoBean liebiaoBean = gson.fromJson(string, LiebiaoBean.class);
//                handler.post(new Runnable() {
//
//                    private MyRecyAdapter01 adaper;
//
//                    @Override
//                    public void run() {
//                        recy_my.setLayoutManager(new GridLayoutManager(getActivity(), 2));
//                        adaper = new MyRecyAdapter01(getActivity(),liebiaoBean.getMiaosha().getList());
//                        recy_my.setAdapter(adaper);
//                        adaper.setOnClickListener(new OnClickRecyListeren() {
//                            @Override
//                            public void setItemOnClickListener(View view, int position) {
//
//                                Intent i = new Intent(getActivity(),Main3Activity.class);
//                                i.putExtra("goods_id",liebiaoBean.getMiaosha().getList().get(position).getDetailUrl());
//                                startActivity(i);
//                              //  liebiaoBean.getMiaosha().getList().get(position).getDetailUrl();
//                            }
//
//                            @Override
//                            public void setItemLongOnClickListener(View view, int position) {
//
//                            }
//                        });
//
//                    }
//                });
//            }
//        });
//
//    }

    private void initViewpage() {
        MyFragment_01 fragment01 = new MyFragment_01();
        MyFragment_02 fragment02 = new MyFragment_02();
        List<Fragment> list = new ArrayList<>();
        list.add(fragment01);
        list.add(fragment02);
        System.out.println("====" + list);
        FragmentViewpage viewpage = new FragmentViewpage(getFragmentManager(), list);
        vp.setAdapter(viewpage);

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        imzuo.setVisibility(View.GONE);
                        imyou.setVisibility(View.VISIBLE);

                        break;
                    case 1:
                        imzuo.setVisibility(View.VISIBLE);
                        imyou.setVisibility(View.GONE);
                        break;
                    default:
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        imzuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vp.setCurrentItem(0);
            }
        });
        imyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vp.setCurrentItem(1);
            }
        });
    }
    private void initId() {
        text = (TextView) view.findViewById(R.id.text);
        scr = (MyScrollView) view.findViewById(R.id.scr);
        ban = (Banner) view.findViewById(R.id.ban);
        rl = (RelativeLayout) view.findViewById(R.id.rl);
        saom = (ImageView) view.findViewById(R.id.saom);
        saot = (TextView) view.findViewById(R.id.saot);
        xiaoxi = (ImageView) view.findViewById(R.id.xiaoxi);
        tv3 = (TextView) view.findViewById(R.id.tv3);
        h_rl = (RelativeLayout) view.findViewById(R.id.H_rl);
        sousuo = (ImageView) view.findViewById(R.id.sousuo);
        vp = (ViewPager) view.findViewById(R.id.vp);
        imageview = (ImageView) view.findViewById(R.id.imageView);
        btb = view.findViewById(R.id.btb);
        imzuo = view.findViewById(R.id.im_zuo);
        imyou = view.findViewById(R.id.im_you);
        vfp = view.findViewById(R.id.vfp);
        recy_my = view.findViewById(R.id.recy_my);
        imgs.add("https://img20.360buyimg.com/da/jfs/t10552/49/1595809835/76518/f750002/59e417c8N5f237e22.jpg");
        imgs.add("https://img1.360buyimg.com/da/jfs/t9724/188/1635143761/104882/3b4345a9/59e484ebNbc8f71b0.jpg");
        imgs.add("https://img1.360buyimg.com/da/jfs/t9961/329/1755143471/96697/e80b9c5d/59e5a71bN86315545.jpg");
        imgs.add("https://img1.360buyimg.com/da/jfs/t10642/199/1403363412/65750/872623d1/59e05f67Nc49a5752.jpg");
        imgs.add("https://img.alicdn.com/simba/img/TB1_xaFfEQIL1JjSZFhSuuDZFXa.jpg");
        imgs.add("https://img14.360buyimg.com/babel/jfs/t10048/132/1084536663/171132/21ae0cae/59dc7941N69dda6c0.jpg");
        imgs.add("https://img1.360buyimg.com/da/jfs/t10780/205/1420421133/98741/774b43b9/59e018d0N0a761691.jpg");
        imgs.add("https://img10.360buyimg.com/da/jfs/t11764/35/27634724/48751/65b3ec38/59e5ecbdN3b762bdb.jpg");
        imgs.add("https://img10.360buyimg.com/babel/jfs/t10762/79/1378649775/166923/7fd96a28/59e062ffN36eec173.jpg");
        imgs.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3920888451,2598579160&fm=200&gp=0.jpg");
        ban.setImageLoader(new GlideImageLoader());
        ban.setImages(imgs);
        ban.setDelayTime(3000);
        ban.start();
        for (int i = 0; i < 6; i++) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.f1item1, null);
            TextView fli_tv = view.findViewById(R.id.fli_tv);
            if (i == 0) {
                fli_tv.setText("男神赢哥中彩票5000万...");
                vfp.addView(view);
            } else if (i == 1) {
                fli_tv.setText("李小龙:世界武道变革者...");
                vfp.addView(view);
            } else if (i == 2) {
                fli_tv.setText("河南省濮阳市成为中国首...");
                vfp.addView(view);
            } else if (i == 3) {
                fli_tv.setText("Android程序员暴打项目...");
                vfp.addView(view);
            } else if (i == 4) {
                fli_tv.setText("拯救世界的巨任只能由...");
                vfp.addView(view);
            } else if (i == 5) {
                fli_tv.setText("首富赢哥30亿买下最贵...");
                vfp.addView(view);
            }
        }
        vfp.setFlipInterval(3000);
        vfp.setInAnimation(getActivity(), R.anim.roll_in);
        vfp.setOutAnimation(getActivity(), R.anim.roll_out);
        vfp.startFlipping();


    }
    private void findHeighOfTopView() {
        //获取控件的试图观察者,以便通过试图观察者得到控件的宽高参数
        ViewTreeObserver viewTreeObserver = ban.getViewTreeObserver();
        //添加观察者监听
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            @Override
            public void onGlobalLayout() {
                //回调监听后首先移除该监听 占资源
                ban.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                //得到高度
                height = ban.getHeight() - 52;
            }
        });

    }
    private int getStatusBarHeight(Main2Activity mainActivity) {
        int result = 0;
        int resourceId = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = this.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
    private void initView() {
        RelativeLayout.LayoutParams linearParams = (RelativeLayout.LayoutParams) h_rl.getLayoutParams(); //取控件textView当前的布局参数
        //linearParams.height = getStatusBarHeight(getActivity());
        h_rl.setLayoutParams(linearParams);
        /*btb.init(getFragmentManager())
                .setImgSize(50, 50)
                .setFontSize(8)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("首页",R.drawable.baw, BottmFragment__01.class)
                .addTabItem("分类", R.drawable.bau, BottmFragment__01.class).
                addTabItem("觅Me", R.drawable.faxian, BottmFragment__01.class)
                .addTabItem("购物车", R.drawable.bas, BottmFragment__01.class)
                .addTabItem("我的", R.drawable.acs, BottmFragment__01.class)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });*/
    }

    @Override
    public void onScrollChanged(MyScrollView mMyScrollView, int l, int t, int oldl, int oldt) {
        //对T轴进行判断,就俩种状态1.消失没有了    2.随着滑动,颜色越来越深
        if (t <= 0) {//没有往下滑

            h_rl.setBackgroundColor(Color.argb(0, 0, 0, 0));
            saom.setImageResource(R.drawable.a_o);
            saot.setTextColor(Color.WHITE);
            xiaoxi.setImageResource(R.drawable.a9t);
            tv3.setTextColor(Color.WHITE);
            sousuo.setImageResource(R.drawable.a_1);
            imageview.setBackgroundResource(R.drawable.sousuo);
        } else if (t > 0 && t < height) {//大于0表示有位移 正在拖动中,发生颜色变化的同时不超过顶部图片的高度

            if (t > (height / 2)) {
                saom.setImageResource(R.drawable.a_n);
                saot.setTextColor(Color.BLACK);
                xiaoxi.setImageResource(R.drawable.a9s);
                tv3.setTextColor(Color.BLACK);
                sousuo.setImageResource(R.drawable.a_q);
                imageview.setBackgroundResource(R.drawable.sousuo_2);
            }
            //获取ScrollView向下滑动,图片消失部分的比例    注意在配置比例时  一定要强转float
            float scale = (float) t / height;
            //根据这个比例,让标题的颜色慢慢的由浅入深
            float alpha = (255 * scale);

            rl.setBackgroundColor(Color.argb((int) alpha, 255, 255, 255));
            if (t > height) {
                rl.setBackgroundColor(Color.argb(255, 255, 255, 255));
            }

            // h_rl.setBackgroundResource(R.drawable.state_bg);
        }

    }


    @Override
    public void callBackSuccess(final LiebiaoBean bean) {


        //adaper.setData(bean);
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adaper.setData(bean);
                adaper.setOnClickListener(new OnClickRecyListeren() {
                    @Override
                    public void setItemOnClickListener(View view, int position) {
                        Intent i = new Intent(getActivity(), Main3Activity.class);
                        i.putExtra("goods_id", bean.getMiaosha().getList().get(position).getDetailUrl());
                        startActivity(i);
                    }

                    @Override
                    public void setItemLongOnClickListener(View view, int position) {

                    }
                });

                System.out.println("数据为"+ bean);
            }
        });
    }

    @Override
    public void callBackFailure(int code) {

    }
}
