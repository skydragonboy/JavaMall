package com.java.mall.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.java.mall.R;
import com.java.mall.ui.fragment.Fragment1;
import com.java.mall.ui.fragment.Fragment2;
import com.java.mall.ui.fragment.Fragment3;
import com.java.mall.ui.fragment.Fragment4;
import com.java.mall.ui.fragment.Fragment5;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationBar bottomNavigationBar;
    private Stack<Fragment> mStack = new Stack();
    private Fragment fragment1 = new Fragment1();
    private Fragment fragment2 = new Fragment2();
    private Fragment fragment3 = new Fragment3();
    private Fragment fragment4 = new Fragment4();
    private Fragment fragment5 = new Fragment5();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationBar = findViewById(R.id.mBottomNavBar);

        initFragment();
        initBottomNav();
        changeFragment(0);
    }

    private void initFragment() {
        FragmentTransaction manager = getSupportFragmentManager().beginTransaction();
        manager.add(R.id.mContaier, fragment1);
        manager.add(R.id.mContaier, fragment2);
        manager.add(R.id.mContaier, fragment3);
        manager.add(R.id.mContaier, fragment4);
        manager.add(R.id.mContaier, fragment5);
        manager.commit();

        mStack.add(fragment1);
        mStack.add(fragment2);
        mStack.add(fragment3);
        mStack.add(fragment4);
        mStack.add(fragment5);
    }

    private void initBottomNav() {
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                changeFragment(position);
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {
            }
        });
    }

    private void changeFragment(int position) {
        FragmentTransaction manager = getSupportFragmentManager().beginTransaction();
        for (Fragment fragment : mStack) {
            manager.hide(fragment);
        }

        manager.show(mStack.get(position));
        manager.commit();
    }

}
