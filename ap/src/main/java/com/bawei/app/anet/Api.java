package com.bawei.app.anet;

import android.content.Context;
import android.content.SharedPreferences;

public class Api {
                                 //192.168.23.192
    //192.168.23.22//mobile/index.php?act=goods_class
                                 //192.168.23.22

    //首页

    //http://120.27.23.105/product/searchProducts?keywords=%E7%AC%94%E8%AE%B0%E6%9C%AC&page=1
    public static String API_IP = "120.27.23.105";
    public static String THEHOME="http://"+API_IP+"/ad/getAd";
    //分类一级列表http://120.27.23.105/product/getCatagory
    public static String STAIR="http://"+API_IP+"/product/getCatagory";
   //首页搜索框
    public static String SEARCHURL = "http://"+API_IP+"/product/searchProducts?keywords=%E7%AC%94%E8%AE%B0%E6%9C%AC&page=1&source=android";
    //商品详情页
    public static String DetailsURL="http://"+API_IP+"/product/searchProducts?keywords=%E7%AC%94%E8%AE%B0%E6%9C%AC&page=1&goods_id&source=android";
    //注册
    public static String REGISTER="http://"+API_IP+"/user/reg";

    // SEARCHURL



    //"http://"+API_IP+"/mobile/index.php?";&op=goods_list act=goods&




    public static String API_IP1 = "169.254.187.41";
    public static String Client = "android";
    public static String IndexURL = "http://m.yunifang.com/yunifang/mobile/home";
    public static String REGURL = "http://"+API_IP1+"/mobile/index.php?act=login&op=register";
    public static String LOGINURL = "http://"+API_IP1+"/mobile/index.php?act=login";
    public static String TYPEBEANURL = "http://"+API_IP1+"/mobile/index.php?act=goods_class";
    public static String UNREG = "http://"+API_IP1+"/mobile/index.php?act=logout";
    //public static String SEARCHURL = "http://"+API_IP1+"/mobile/index.php?act=goods&op=goods_list&page=100";
    public static String WebViewURL = "http://"+API_IP1+"/mobile/index.php?act=goods&op=goods_body&goods_id=";


   // public static String DetailsURL = "http://"+API_IP1+"/mobile/index.php?act=goods&op=goods_detail&goods_id=";


    public static String CartADDURL = "http://"+API_IP1+"/mobile/index.php?act=member_cart&op=cart_add";
    public static String ShopShowURL = "http://"+API_IP1+"/mobile/index.php?act=member_cart&op=cart_list";
    public static String DeleteURL = "http://"+API_IP1+"/mobile/index.php?act=member_cart&op=cart_del";
    public static String AddressURL = "http://"+API_IP1+"/mobile/index.php?act=member_address&op=address_list";
    public static String AddAddressURL = "http://"+API_IP1+"/mobile/index.php?act=member_address&op=address_add";

    public static String DeleteAddress = "http://"+API_IP+"/mobile/index.php?act=member_address&op=address_del";
    public static String UpdateAddress = "http://"+API_IP+"/mobile/index.php?act=member_address&op=address_edit";

    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;
    public static void init(Context context){
        sharedPreferences = context.getSharedPreferences("user", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

}


