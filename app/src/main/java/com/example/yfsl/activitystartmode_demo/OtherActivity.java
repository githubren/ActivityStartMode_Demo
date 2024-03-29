package com.example.yfsl.activitystartmode_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class OtherActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到ActivitySingleTop页面
//                forwordToActivity(OtherActivity.this,ActivitySingleTop.class);
                //跳转到ActivitySingleTask页面
                forwordToActivity(OtherActivity.this,ActivitySingleTask.class);
            }
        });
    }
}
