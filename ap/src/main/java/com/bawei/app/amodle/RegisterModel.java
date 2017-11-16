package com.bawei.app.amodle;

import com.bawei.app.anet.Api;
import com.bawei.app.anet.HttpUtils;
import com.bawei.app.anet.OnNetListener;
import com.bawei.app.redisterbean.BaseBean;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by peng on 2017/11/7.
 * 网络请求，去注册
 */

public class RegisterModel extends BaseModel implements IRegisterModel{
    @Override
    public void register(String account, String pwd, final OnNetListener<BaseBean> onNetListener) {
        Map<String,String>params=new HashMap<>();
        params.put("mobile",account);
        params.put("password",pwd);
        HttpUtils.getHttpUtils().doPost(Api.REGISTER, params, new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        onNetListener.onFailure(e);
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                final BaseBean baseBean = new Gson().fromJson(string, BaseBean.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        onNetListener.onSuccess(baseBean);
                    }
                });
            }
        });
    }
}
