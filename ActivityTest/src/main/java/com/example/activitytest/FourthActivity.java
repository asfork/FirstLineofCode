package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Zhang on 2015/8/18.
 */
public class FourthActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_layout);

        final Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("FourthActivity", data);

        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("data_return", "Hello ThirdActivity");
                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello ThirdActivity");
        setResult(RESULT_OK, intent);
        finish();
    }
}
