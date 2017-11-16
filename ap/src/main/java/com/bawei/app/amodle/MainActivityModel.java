package com.bawei.app.amodle;

import android.app.Activity;

import com.bawei.app.anet.Api;
import com.bawei.app.bean.LiebiaoBean;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivityModel extends Activity {
    String u = Api.THEHOME;

    public void getData(boolean up, final MainActivityModelListener listener){

    OkHttpClient client = new OkHttpClient();
    Request request = new Request.Builder()
           // .addHeader("User-Agent","OkHttp Example")
            .url(u)
            .build();
     client.newCall(request).enqueue(new Callback() {
         @Override
         public void onFailure(Call call, IOException e) {
             listener.callBackFailure(1);
         }

         @Override
         public void onResponse(Call call, Response response) throws IOException {
             String string = response.body().string();
             Gson gson=new Gson();
             LiebiaoBean bean = gson.fromJson(string,LiebiaoBean.class);

             listener.callBackSuccess(bean);
         }
     });


}

}