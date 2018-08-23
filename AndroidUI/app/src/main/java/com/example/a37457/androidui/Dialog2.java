package com.example.a37457.androidui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dialog2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog2);

        //生成对话框
        /*setSingleChoiceItems()方法需要设置3个参数，
        * 第1个参数建立数组，用于显示选项内容；
        * 第2个参数设置是否选中，“0”表示默认选中第一个选项，若默认未选中，则参数填写-1；
        * 第三个参数为设立监听，允许对话框被点击。*/
        new AlertDialog.Builder(this)
                .setTitle("请选择性别")
                .setIcon(R.mipmap.ic_launcher)
                .setSingleChoiceItems(new String[]{"男", "女"},
                        0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                .setPositiveButton("确定",null)
                .setNegativeButton("取消",null)
                .show();
    }
}
