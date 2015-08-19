package com.example.activitylifecycletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Zhang on 2015/8/19.
 */
public class NormalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle onSaveInstanceState) {
        super.onCreate(onSaveInstanceState);
        setContentView(R.layout.activity_normal);
    }
}
