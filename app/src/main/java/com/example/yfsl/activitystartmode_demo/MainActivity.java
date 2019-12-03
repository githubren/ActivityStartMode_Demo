package com.example.yfsl.activitystartmode_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Button mStandardBtn;
    private Button mSingleTopBtn;
    private Button mSingleTaskBtn;
    private Button mSingleInstanceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mStandardBtn = findViewById(R.id.standard_btn);
        mSingleTopBtn = findViewById(R.id.single_top_btn);
        mSingleTaskBtn = findViewById(R.id.single_task_btn);
        mSingleInstanceBtn = findViewById(R.id.single_instance_btn);

        mStandardBtn.setOnClickListener(this);
        mSingleTopBtn.setOnClickListener(this);
        mSingleTaskBtn.setOnClickListener(this);
        mSingleInstanceBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.standard_btn:
                forwordToActivity(MainActivity.this,ActivityStandard.class);
                break;
            case R.id.single_top_btn:
                forwordToActivity(MainActivity.this,ActivitySingleTop.class);
                break;
            case R.id.single_task_btn:
                forwordToActivity(MainActivity.this,ActivitySingleTask.class);
                break;
            case R.id.single_instance_btn:
                forwordToActivity(MainActivity.this,ActivitySingleInstance.class);
                break;
        }
    }
}
