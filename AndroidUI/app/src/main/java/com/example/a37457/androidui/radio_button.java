package com.example.a37457.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class radio_button extends AppCompatActivity {
    private RadioGroup radioGroup;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = findViewById(R.id.rdg);
        textView = findViewById(R.id.tv);

        //利用setOnCheckedChangeListener()为RadioGroup建立监听
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbtn) {
                    textView.setText("您的性别是：男");
                } else {
                    textView.setText("您的性别是：女");
                }
            }
        });
    }
}
