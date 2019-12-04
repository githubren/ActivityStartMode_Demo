package com.example.yfsl.activitystartmode_demo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * activity基类，主要是对activity启动时调用方法做一个打印
 * 打印内容包括activity的hashcode以及所属的task
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG", "onCreate()");
        Log.e("TAG", "onCreate：" + getClass().getSimpleName() + " TaskId: " + getTaskId() + " hasCode:" + this.hashCode());
        dumpTaskAffinity();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.e("TAG", "onNewIntent()");
        Log.e("TAG", "onNewIntent：" + getClass().getSimpleName() + " TaskId: " + getTaskId() + " hasCode:" + this.hashCode());
        dumpTaskAffinity();
    }

    /**
     * 打印任务栈信息
     */
    private void dumpTaskAffinity() {
        try {
            ActivityInfo info = this.getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.e("TAG", "taskAffinity:"+info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 页面跳转
     */
    protected void forwordToActivity(Context context,Class<? extends BaseActivity> clazz){
        Intent intent = new Intent(context,clazz);
        context.startActivity(intent);
    }
}
