package com.example.yfsl.activitystartmode_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ActivityStandard extends BaseActivity{
    private Button mSecondToStandard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        initView();
    }

    private void initView() {
        mSecondToStandard = findViewById(R.id.second_jump_standard);

        mSecondToStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwordToActivity(ActivityStandard.this,ActivityStandard.class);
            }
        });
    }
}
