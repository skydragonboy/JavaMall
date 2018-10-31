package com.java.baselibrary.widgets;

import android.content.Context;
import android.util.AttributeSet;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.java.baselibrary.R;

/**
 * Created by Pan on 2018/10/30.
 */

public class BottomNavBar extends BottomNavigationBar {


    public BottomNavBar(Context context) {
        super(context);
        init();
    }

    public BottomNavBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public BottomNavBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    private void init() {
        BottomNavigationItem NavBar1 = new BottomNavigationItem(R.drawable.bar1_yes, "主页")
                .setInactiveIconResource(R.drawable.bar1_no)
                .setActiveColorResource(R.color.theme_color)
                .setInActiveColorResource(R.color.text_normal);

        BottomNavigationItem NavBar2 = new BottomNavigationItem(R.drawable.bar2_yes, "分类")
                .setInactiveIconResource(R.drawable.bar2_no)
                .setActiveColorResource(R.color.theme_color)
                .setInActiveColorResource(R.color.text_normal);

        BottomNavigationItem NavBar3 = new BottomNavigationItem(R.drawable.bar3_yes, "发现")
                .setInactiveIconResource(R.drawable.bar3_no)
                .setActiveColorResource(R.color.theme_color)
                .setInActiveColorResource(R.color.text_normal);

        BottomNavigationItem NavBar4 = new BottomNavigationItem(R.drawable.bar4_yes, "购物车")
                .setInactiveIconResource(R.drawable.bar4_no)
                .setActiveColorResource(R.color.theme_color)
                .setInActiveColorResource(R.color.text_normal);

        BottomNavigationItem NavBar5 = new BottomNavigationItem(R.drawable.bar5_yes, "我的")
                .setInactiveIconResource(R.drawable.bar5_no)
                .setActiveColorResource(R.color.theme_color)
                .setInActiveColorResource(R.color.text_normal);

        //设置底部导航模式及样式
        setMode(BottomNavigationBar.MODE_FIXED);
        setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        setBarBackgroundColor(R.color.common_white);

        //添加Tab
        addItem(NavBar1)
                .addItem(NavBar2)
                .addItem(NavBar3)
                .addItem(NavBar4)
                .addItem(NavBar5)
                .setFirstSelectedPosition(0)
                .initialise();
    }
}
