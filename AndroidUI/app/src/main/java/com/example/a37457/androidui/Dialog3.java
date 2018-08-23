package com.example.a37457.androidui;

//多选对话框

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dialog3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog3);

        /*setMultiChoiceItems()方法有3个参数，第1个参数建立数组，用于显示选项内容；
        * 第2个参数是boolean数组，用来判断哪个选项需要勾选，若没有选项需要选中则用“null”即可；
        * 第3个参数是建立监听，允许对话框被点击*/
        new AlertDialog.Builder(this)
                .setTitle("请添加兴趣爱好")
                .setIcon(R.mipmap.ic_launcher)
                .setMultiChoiceItems(new String[]{"旅游","美食","汽车","宠物"},
                        null,null)
                .setPositiveButton("确定",null)
                .setNegativeButton("取消",null)
                .show();
    }
}
