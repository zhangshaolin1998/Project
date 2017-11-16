package com.bawei.app.amodle;

import com.bawei.app.anet.OnNetListener;
import com.bawei.app.redisterbean.BaseBean;

/**
 * Created by 于俊建 on 2017/11/13.
 */

public interface IRegisterModel {
    public void register(String account, String pwd, OnNetListener<BaseBean> onNetListener);
}
