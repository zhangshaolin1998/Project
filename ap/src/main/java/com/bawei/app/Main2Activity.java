package com.bawei.app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.bawei.app.fragment.Fragment1;
import com.bawei.app.fragment.Fragment2;
import com.bawei.app.fragment.Fragment3;
import com.bawei.app.fragment.Fragment4;
import com.bawei.app.fragment.Fragment5;
import com.hjm.bottomtabbar.BottomTabBar;

public class Main2Activity extends FragmentActivity {
    private BottomTabBar btb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btb= (BottomTabBar) findViewById(R.id.btb);
        btb.init(getSupportFragmentManager()).setImgSize(30, 30)
                .setFontSize(8)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("首页", R.drawable.baw, Fragment1.class)
                .addTabItem("分类", R.drawable.bau, Fragment2.class)
                .addTabItem("觅Me", R.drawable.faxian, Fragment3.class)
                .addTabItem("购物车", R.drawable.bas, Fragment4.class)
                .addTabItem("我的", R.drawable.acs, Fragment5.class)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });
    }
}
