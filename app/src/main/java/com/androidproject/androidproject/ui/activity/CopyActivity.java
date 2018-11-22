package com.androidproject.androidproject.ui.activity;


import com.androidproject.androidproject.R;
import com.androidproject.androidproject.common.CommonActivity;

/**
 *    author : HJQ
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2018/10/18
 *    desc   : 可进行拷贝的副本
 */
public class CopyActivity extends CommonActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_copy;
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
/*
Error:Could not resolve all files for configuration ':app:baiduDebugAnnotationProcessorClasspath'.
        > Could not download guava.jar (com.google.guava:guava:24.0-jre)
        > Could not get resource 'https://jcenter.bintray.com/com/google/guava/guava/24.0-jre/guava-24.0-jre.jar'.
        > Could not GET 'https://jcenter.bintray.com/com/google/guava/guava/24.0-jre/guava-24.0-jre.jar'.
        > Remote host closed connection during handshake*/
