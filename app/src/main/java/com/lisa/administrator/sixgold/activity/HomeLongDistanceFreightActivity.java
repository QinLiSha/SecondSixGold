package com.lisa.administrator.sixgold.activity;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

/**
 * 长途运输的页面
 */
public class HomeLongDistanceFreightActivity extends MyBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_distance_freight);
        initActionBarOneImg(R.drawable.ic_chevron_left_grey_24dp, "填写订单", "收费详情", null);
    }

}
