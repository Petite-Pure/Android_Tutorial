package com.example.a37457.androidui;
//Toast消息对话框
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Dialog5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog5);

        //创建Toast
        /*通过makeText()方法实例化一个Toast对象，该方法需要接收3个参数
        * 第1个参数为当前类的Context(上下文)对象，
        * 第2个参数为文本显示内容，
        * 第3个参数为Toast显示的时间*/
        Toast.makeText(this,"Hello,Toast!",Toast.LENGTH_SHORT).show();
    }
}
