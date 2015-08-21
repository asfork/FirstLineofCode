package com.example.fragmenttest;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Zhang on 2015/8/21.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:
//                        AnotherRightFragment fragment = new AnotherRightFragment();
//                        FragmentManager fragmentManager = getFragmentManager();
//                        FragmentTransaction transaction = fragmentManager.beginTransaction();
//                        transaction.replace(R.id.right_layout, fragment);
//                        transaction.addToBackStack(null);
//                        transaction.commit();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
