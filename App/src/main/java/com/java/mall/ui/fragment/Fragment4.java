package com.java.mall.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.java.baselibrary.ui.fragment.BaseFragment;
import com.java.mall.R;

/**
 * Created by Pan on 2018/10/30.
 */

public class Fragment4 extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.fragment_4, null);
    }
}
