package com.deepak.lifecycles;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentLifeCycle extends Fragment {
    public FragmentLifeCycle() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("life cycle F1", "onAttach() Fragment 1");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("life cycle F1", "onCreate() Fragment 1");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("life cycle F1", "onCreateView() Fragment 1");
        // Inflate the layout for this fragment
        View mRootView = inflater.inflate(R.layout.fragment1_life_cycle, container, false);
        Button btnNextFragment = (Button)mRootView.findViewById(R.id.btn_frag1);
        btnNextFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment2LifeCycle();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_place, fragment);
                fragmentTransaction.commit();
            }
        });
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("life cycle F1", "onActivityCreated() Fragment 1");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("life cycle F1", "onStart() Fragment 1");
//        Toast.makeText(getActivity(),"onStart() Fragment 1",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("life cycle F1", "onResume() Fragment 1");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("life cycle F1", "onPause() Fragment 1");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("life cycle F1", "onStop() Fragment 1");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("life cycle F1", "onDestroyView() Fragment 1");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("life cycle F1", "onDestroy() Fragment 1");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("life cycle F1", "onDetach() Fragment 1");
    }
}
