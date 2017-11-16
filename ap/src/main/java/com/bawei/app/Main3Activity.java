package com.bawei.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {
    private String goods_id;
    private WebView webview;
    private String goodsid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        webview = (WebView) findViewById(R.id.webview);
        goods_id = getIntent().getStringExtra("goods_id");
        webview.loadUrl(goods_id);


    }


}
