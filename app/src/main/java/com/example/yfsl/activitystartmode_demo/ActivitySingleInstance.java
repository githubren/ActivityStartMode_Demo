package com.example.yfsl.activitystartmode_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class ActivitySingleInstance extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

    }
}
