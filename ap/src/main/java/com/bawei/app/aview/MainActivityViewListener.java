package com.bawei.app.aview;


import com.bawei.app.bean.LiebiaoBean;

public interface MainActivityViewListener {
    public void callBackSuccess(LiebiaoBean bean);
    public void callBackFailure(int code);
}