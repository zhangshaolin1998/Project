package com.bawei.app.f1Molder;

import com.bawei.app.R;
import com.bawei.app.bean.Fragmen_Bean;

import java.util.ArrayList;
import java.util.List;



public class MyFragment_Data {
    public List<Fragmen_Bean> frag01_list_01 = new ArrayList<>();
    public List<Fragmen_Bean> frag01_list_02 = new ArrayList<>();

    public MyFragment_Data() {

        frag01_list_01.add(new Fragmen_Bean("京东超市", R.drawable.vp01));
        frag01_list_01.add(new Fragmen_Bean("全球购", R.drawable.vp02));
        frag01_list_01.add(new Fragmen_Bean("服装城", R.drawable.vp03));
        frag01_list_01.add(new Fragmen_Bean("京东生鲜", R.drawable.vp04));
        frag01_list_01.add(new Fragmen_Bean("排行榜", R.drawable.vp11));
        frag01_list_01.add(new Fragmen_Bean("充值缴费", R.drawable.vp06));
        frag01_list_01.add(new Fragmen_Bean("领京豆", R.drawable.vp07));
        frag01_list_01.add(new Fragmen_Bean("领劵", R.drawable.vp08));
        frag01_list_01.add(new Fragmen_Bean("赚钱", R.drawable.vp09));
        frag01_list_01.add(new Fragmen_Bean("PLUS会员", R.drawable.vp10));

        frag01_list_02.add(new Fragmen_Bean("京东到家", R.drawable.vp05));
        frag01_list_02.add(new Fragmen_Bean("二手优品", R.drawable.ershou));
        frag01_list_02.add(new Fragmen_Bean("机票车票", R.drawable.jipiao));
        frag01_list_02.add(new Fragmen_Bean("白条", R.drawable.vp12));
        frag01_list_02.add(new Fragmen_Bean("京东试用", R.drawable.vp15));
        frag01_list_02.add(new Fragmen_Bean("司法拍卖", R.drawable.vp16));
        frag01_list_02.add(new Fragmen_Bean("京东回收", R.drawable.huishou));
        frag01_list_02.add(new Fragmen_Bean("京东智能", R.drawable.zhineng));
        frag01_list_02.add(new Fragmen_Bean("沃尔玛", R.drawable.woerma));
        frag01_list_02.add(new Fragmen_Bean("全部", R.drawable.quanbu));
    }


}
