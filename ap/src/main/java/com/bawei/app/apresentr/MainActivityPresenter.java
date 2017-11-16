package com.bawei.app.apresentr;

import com.bawei.app.amodle.MainActivityModel;
import com.bawei.app.amodle.MainActivityModelListener;
import com.bawei.app.aview.MainActivityViewListener;
import com.bawei.app.bean.LiebiaoBean;


public class MainActivityPresenter {


    private MainActivityViewListener listener;
    private MainActivityModel mainActivityModel;
    public MainActivityPresenter(MainActivityViewListener listener) {
        this.listener = listener;
        this.mainActivityModel = new MainActivityModel();
    }
    public void getData(boolean up){

        mainActivityModel.getData(up, new MainActivityModelListener() {
            @Override
            public void callBackSuccess(LiebiaoBean bean) {
                listener.callBackSuccess(bean);
            }

            @Override
            public void callBackFailure(int code) {
                listener.callBackFailure(code);
            }
        });

    }



}