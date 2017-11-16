package com.bawei.app.amodle;

import com.bawei.app.bean.LiebiaoBean;

/**
 * Created by 于俊建 on 2017/11/8.
 */

public interface MainActivityModelListener {
    public void callBackSuccess(LiebiaoBean bean);
    public void callBackFailure(int code);


}
