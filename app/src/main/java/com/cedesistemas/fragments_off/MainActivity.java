package com.cedesistemas.fragments_off;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView fragmentOne;
    private TextView fragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadView();
        loadListener();
    }

    private void loadView() {
        fragmentOne = findViewById(R.id.fragmentOne);
        fragmentTwo = findViewById(R.id.fragmentTwo);
    }

    private void loadListener() {
        fragmentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment myFragment = new OneFragment();
                showFragment(myFragment);
            }
        });
        fragmentTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment myFragment = new TwoFragment();
                showFragment(myFragment);
            }
        });
    }

    private void showFragment(Fragment myFragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayoutFragments, myFragment);
        transaction.commit();
    }




}
