package com.bawei.app.f1Molder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class FragmentViewpage extends FragmentPagerAdapter {
    private List<Fragment> list = new ArrayList<>();

    public FragmentViewpage(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }
}


