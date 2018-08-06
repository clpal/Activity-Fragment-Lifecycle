package com.deepak.lifecycles;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment2LifeCycle extends Fragment {
    public Fragment2LifeCycle() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("life cycle F2", "onAttach() Fragment 2");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("life cycle F2", "onCreate() Fragment 2");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("life cycle F2", "onCreateView() Fragment 2");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_life_cycle, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("life cycle F2", "onActivityCreated() Fragment 2");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("life cycle F2", "onStart() Fragment 2");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("life cycle F2", "onResume() Fragment 2");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("life cycle F2", "onPause() Fragment 2");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("life cycle F2", "onStop() Fragment 2");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("life cycle F2", "onDestroyView() Fragment 2");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("life cycle F2", "onDestroy() Fragment 2");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("life cycle F2", "onDetach() Fragment 2");
    }
}
