package com.bawei.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends Activity {
    private View view;
    //登陆
    private Button log_bt;
    private CheckBox log_cb;
    private ImageView log_qq;
    private ImageView log_wx;
    private ImageView log_fanhui;
    private ImageView log_shanchu;
    //注册
    private TextView log_zhuce;
    private TextView log_zhaohui;
    //账号
    private EditText et_name;
    //密码
    private EditText et_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initIdData();

        log_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        log_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.out_in, R.anim.out_out);
            }
        });


        et_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (i2 != 0) {
                    log_shanchu.setVisibility(View.VISIBLE);

                    if (et_name.getText() != null && et_password.getText() != null && !et_name.getText().toString().equals("") && !et_password.getText().toString().equals("")) {
                        log_bt.setTextColor(log_bt.getResources().getColor(R.color.bai));
                        log_bt.setBackgroundColor(log_bt.getResources().getColor(R.color.hong));

                    }
                }
                if (i2 == 0) {
                    log_bt.setTextColor(log_bt.getResources().getColor(R.color.huiText));
                    log_bt.setBackgroundColor(log_bt.getResources().getColor(R.color.hui));
                    log_shanchu.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (i2 != 0) {
                    if (et_name.getText() != null && et_password.getText() != null && !et_name.getText().toString().equals("") && !et_password.getText().toString().equals("")) {
                        log_bt.setTextColor(log_bt.getResources().getColor(R.color.bai));
                        log_bt.setBackgroundColor(log_bt.getResources().getColor(R.color.hong));
                    }
                }
                if (i2 == 0) {
                    log_bt.setTextColor(log_bt.getResources().getColor(R.color.huiText));
                    log_bt.setBackgroundColor(log_bt.getResources().getColor(R.color.hui));
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        log_cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    et_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    et_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
        log_shanchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_name.getText().clear();
            }
        });
    }
    // 监听手机自带的按键   KeyEvent.KEYCODE_BACK代表手机上的返回按钮
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();

            overridePendingTransition(R.anim.out_in, R.anim.out_out);
            return true;
        }
        //
        return super.onKeyDown(keyCode, event);
    }

    private void initIdData() {
        log_bt = findViewById(R.id.log_bt);
        log_cb = findViewById(R.id.log_cb);
        log_qq = findViewById(R.id.log_qq);
        log_wx = findViewById(R.id.log_wx);
        log_fanhui = findViewById(R.id.log_quxiao);
        log_shanchu = findViewById(R.id.log_shanchu);
        log_zhuce = findViewById(R.id.log_zhuce);
        log_zhaohui = findViewById(R.id.log_zhaohui);
        et_name = findViewById(R.id.et_name);
        et_password = findViewById(R.id.et_password);
    }
}
