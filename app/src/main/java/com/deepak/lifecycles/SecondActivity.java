package com.deepak.lifecycles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Log.i("Activity 2 ", "onCreate()");
        Utils.showToast(SecondActivity.this, "Activity 2 : onCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity 2 ", "onStart()");
        Utils.showToast(SecondActivity.this, "Activity 2 : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity 2 ", "onResume()");
        Utils.showToast(SecondActivity.this, "Activity 2 : onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity 2 ", "onPause()");
        Utils.showToast(SecondActivity.this, "Activity 2 : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity 2 ", "onStop()");
        Utils.showToast(SecondActivity.this, "Activity 2 : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity 2 ", "onDestroy()");
        Utils.showToast(SecondActivity.this, "Activity 2 : onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity 2 ", "onRestart()");
        Utils.showToast(SecondActivity.this, "Activity 2 : onRestart()");
    }
}
