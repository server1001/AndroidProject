package com.androidproject.androidproject.ui.adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.androidproject.androidproject.common.CommonLazyFragment;
import com.androidproject.androidproject.ui.fragment.TestFragmentA;
import com.androidproject.androidproject.ui.fragment.TestFragmentB;
import com.androidproject.androidproject.ui.fragment.TestFragmentC;
import com.androidproject.androidproject.ui.fragment.TestFragmentD;
import com.hjq.baselibrary.base.BaseFragmentPagerAdapter;

import java.util.List;


/**
 *    author : HJQ
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2018/10/18
 *    desc   : 主页界面 ViewPager + Fragment 适配器
 */
public final class HomeViewPagerAdapter extends BaseFragmentPagerAdapter<CommonLazyFragment> {

    public HomeViewPagerAdapter(FragmentActivity activity) {
        super(activity);
    }

    @Override
    protected void init(FragmentManager fm, List<CommonLazyFragment> list) {
        list.add(TestFragmentA.newInstance());
        list.add(TestFragmentB.newInstance());
        list.add(TestFragmentC.newInstance());
        list.add(TestFragmentD.newInstance());
    }
}