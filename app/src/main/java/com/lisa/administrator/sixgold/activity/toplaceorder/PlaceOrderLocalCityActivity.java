package com.lisa.administrator.sixgold.activity.toplaceorder;

import android.os.Bundle;

import com.lisa.administrator.sixgold.R;
import com.lisa.administrator.sixgold.base.MyBaseActivity;

public class PlaceOrderLocalCityActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order_local_city);
        initActionBarTwoImg(R.drawable.ic_chevron_left_grey_24dp, "同城下单", -1, null);
    }
}
