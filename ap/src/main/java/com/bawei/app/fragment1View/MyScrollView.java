package com.bawei.app.fragment1View;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;


public class MyScrollView extends ScrollView {

    //定义自己的接口变量
    private OnScrollViewListenner mOnScrollViewListenner;
    //重写构造方法  这里让它都去使用第三中构造方法
    public MyScrollView(Context context) {
        this(context,null);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    //onScrollChanged

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mOnScrollViewListenner != null) {
            mOnScrollViewListenner.onScrollChanged(this, l, t, oldl, oldt);
        }
    }
    //自定义接口
    public interface OnScrollViewListenner {
        //把方法放进去  做修改加入本类对象参数
        void onScrollChanged(MyScrollView mMyScrollView, int l, int t, int oldl, int oldt);
    }
    //设置Set方法
    public void setmOnScrollViewListenner(OnScrollViewListenner mOnScrollViewListenner) {
        this.mOnScrollViewListenner = mOnScrollViewListenner;
    }
}
