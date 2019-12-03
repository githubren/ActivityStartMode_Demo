package com.example.yfsl.activitystartmode_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ActivitySingleTask extends BaseActivity{
    private Button mSecondToSingleTask;
    private Button mToOther;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);

        initView();
    }

    private void initView() {
        mSecondToSingleTask = findViewById(R.id.second_jump_single_task);
        mToOther = findViewById(R.id.to_activity_other);

        mSecondToSingleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySingleTask.this,ActivitySingleTask.class);
                startActivity(intent);
            }
        });

        mToOther.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                forwordToActivity(ActivitySingleTask.this,OtherActivity.class);
            }
        });
    }
}
