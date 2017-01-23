package com.lisa.administrator.sixgold.activity.mine;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

/**
 * 优惠券界面
 */
public class CouponActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "我的优惠券", -1, null);
    }
}
