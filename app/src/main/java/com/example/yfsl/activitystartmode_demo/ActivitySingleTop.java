package com.example.yfsl.activitystartmode_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ActivitySingleTop extends BaseActivity{
    private Button mSecondToSingleTop;
    private Button mToOther;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);

        initView();
    }

    private void initView() {
        mSecondToSingleTop = findViewById(R.id.second_jump_single_top);
        mToOther = findViewById(R.id.to_other_activity);

        mSecondToSingleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySingleTop.this,ActivitySingleTop.class);
                startActivity(intent);
            }
        });

        mToOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwordToActivity(ActivitySingleTop.this,OtherActivity.class);
            }
        });
    }
}
