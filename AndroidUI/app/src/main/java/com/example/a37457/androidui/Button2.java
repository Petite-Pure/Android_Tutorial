package com.example.a37457.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//实现OnClickListener接口
public class Button2 extends AppCompatActivity implements View.OnClickListener {

    private Button myBtn1;
    private Button myBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        myBtn1 = findViewById(R.id.btn_one);
        myBtn2 = findViewById(R.id.btn_two);
        myBtn1.setOnClickListener(this);    //this代表是该Activity的引用，由于Activity实现了OnClickListener接口，
        myBtn2.setOnClickListener(this);    //所以这里this代表了OnClickListener的引用。
    }


    //重写onClick()方法
    @Override
    public void onClick(View v) {
        //switch语句判断哪个按钮被点击
        switch (v.getId()) {
            case R.id.btn_one:
                myBtn1.setText("按钮1已被点击");
                break;
            case R.id.btn_two:
                myBtn2.setText("按钮2已被点击");
                break;
        }
    }
}
