package com.bawei.app.amodle;

import android.os.Handler;
import android.os.Looper;

public class BaseModel {
    protected Handler handler = new Handler(Looper.getMainLooper());
}
