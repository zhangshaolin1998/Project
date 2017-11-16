package com.bawei.app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;


public class MyZxing extends AppCompatActivity {
    private int REQUEST_CODE=1;
    private EditText editText;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f1erweima);
        //就这一行写到你的onCreate里就可以了
        ZXingLibrary.initDisplayOpinion(this);
        Intent intent = new Intent(MyZxing.this, CaptureActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
        editText = (EditText) findViewById(R.id.editText);
        imageView = (ImageView) findViewById(R.id.imageView);
        Button btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textContent = editText.getText().toString();
                if (TextUtils.isEmpty(textContent)) {
                    Toast.makeText(MyZxing.this, "您的输入为空!", Toast.LENGTH_SHORT).show();
                    return;
                }
                editText.setText("");
                Bitmap mBitmap = CodeUtils.createImage(textContent, 400, 400, null);
                imageView.setImageBitmap(mBitmap);
            }
        });

    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);

        if (resultCode == REQUEST_CODE) {
            //处理扫描结果（在界面上显示）
            if (null != data) {
                Bundle bundle = data.getExtras();
                if (bundle == null) {
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
                    String result = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(this, "解析结果:" + result, Toast.LENGTH_LONG).show();
                } else if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_FAILED) {
                    Toast.makeText(MyZxing.this, "解析二维码失败", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
