package com.deepak.lifecycles;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

//    private TextView tvOnCreate;
//    private TextView tvOnStart;
//    private TextView tvOnResume;
//    private TextView tvOnPause;
//    private TextView tvOnStop;
//    private TextView tvOnDestroy;
//    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //handler = new Handler();

        Button btn = findViewById(R.id.btn);

//        tvOnCreate = findViewById(R.id.tv_on_create);
//        tvOnStart = findViewById(R.id.tv_on_start);
//        tvOnResume = findViewById(R.id.tv_on_resume);
//        tvOnPause = findViewById(R.id.tv_on_pause);
//        tvOnStop = findViewById(R.id.tv_on_stop);
//        tvOnDestroy = findViewById(R.id.tv_on_destroy);

//        tvOnCreate.setText("onCreate");


//        addFragment(new FragmentLifeCycle(), FragmentLifeCycle.class.getName());

        Log.i("Activity 1 ", "onCreate()");
        Utils.showToast(FirstActivity.this, "Activity 1 : onCreate()");

        btn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity 1 ", "onStart()");
        Utils.showToast(FirstActivity.this, "Activity 1 : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity 1 ", "onResume()");
        Utils.showToast(FirstActivity.this, "Activity 1 : onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity 1 ", "onPause()");
        Utils.showToast(FirstActivity.this, "Activity 1 : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity 1 ", "onStop()");
        Utils.showToast(FirstActivity.this, "Activity 1 : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity 1 ", "onDestroy()");
        Utils.showToast(FirstActivity.this, "Activity 1 : onDestroy()");

//        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
//            finish();
//        } else {
//            super.onBackPressed();
//        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity 1 ", "onRestart()");
        Utils.showToast(FirstActivity.this, "Activity 1 : onRestart()");
    }

    private void addFragment(Fragment fragment, String fragmentName) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fragment, fragmentName);
        fragmentTransaction.addToBackStack(fragmentName);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn) {
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            startActivity(intent);
//            finish();
        }
    }
}