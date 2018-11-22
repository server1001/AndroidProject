package com.androidproject.androidproject.ui.fragment;


import com.androidproject.androidproject.R;
import com.androidproject.androidproject.common.CommonLazyFragment;

/**
 *    author : HJQ
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2018/10/18
 *    desc   : 可进行拷贝的副本
 */
public class CopyFragment extends CommonLazyFragment {

    public static CopyFragment newInstance() {
        return new CopyFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_copy;
    }

    @Override
    protected int getTitleBarId() {
        return R.id.tb_copy_title;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}