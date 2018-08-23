package com.example.a37457.androidui;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dialog4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog4);

        ProgressDialog progressDialog;                      //声明对话框
        progressDialog = new ProgressDialog(this);  //构建对话框
        progressDialog.setTitle("正在加载...");
        //设置水平进度条，若将参数改为ProgressDialog.STYLE_SPINNER，则样式边为圆形进度条
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.show();
    }
}
