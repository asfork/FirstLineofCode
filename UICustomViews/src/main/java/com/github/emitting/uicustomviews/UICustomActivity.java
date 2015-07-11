package com.github.emitting.uicustomviews;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Steve on 7/11/2015.
 */
public class UICustomActivity extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
    }
}
