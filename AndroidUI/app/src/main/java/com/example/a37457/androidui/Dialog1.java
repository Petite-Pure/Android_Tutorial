package com.example.a37457.androidui;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dialog1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog1);

        //声明对象
        AlertDialog dialog;
        //绑定当前界面窗口，设置标题
        dialog = new AlertDialog.Builder(this)
                .setTitle("Dialog对话框")      //设置标题
                .setMessage("是否确定退出")     //设置提示信息
                .setIcon(R.mipmap.ic_launcher)  //设置图标
                .setPositiveButton("确定",null)   //添加“确定”按钮
                .setNegativeButton("取消",null)   //添加“取消”按钮
                .create();      //创建对话框
        dialog.show();      //显示对话框

    }
}
