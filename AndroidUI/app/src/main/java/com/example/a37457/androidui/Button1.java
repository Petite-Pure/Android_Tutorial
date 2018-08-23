package com.example.a37457.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Button1 extends AppCompatActivity {

    private Button myBtn1;
    private Button myBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        //通过findViewById()初始化控件
        myBtn1 = findViewById(R.id.btn1);
        myBtn2 = findViewById(R.id.btn2);

        //匿名内部类的方法实现按钮2的点击事件
        myBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myBtn2.setText("按钮2已被点击");
            }
        });

    }

    //通过实现onClick()方法，实现按钮1的点击事件
    public void click(View view) {
        myBtn1.setText("按钮1已被点击");
    }

}
