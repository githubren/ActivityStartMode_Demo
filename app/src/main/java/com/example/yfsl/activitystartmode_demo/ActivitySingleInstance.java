package com.example.yfsl.activitystartmode_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ActivitySingleInstance extends BaseActivity{
    private Button mSecondToSingleInstance;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

        initView();
    }

    private void initView() {
        mSecondToSingleInstance = findViewById(R.id.second_jump_single_instance);

        mSecondToSingleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySingleInstance.this,ActivitySingleInstance.class);
                startActivity(intent);
            }
        });
    }
}
